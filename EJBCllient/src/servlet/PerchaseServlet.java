package servlet;

import java.io.IOException;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Goods;

import service.CartEJB;
import service.UserEJB;
import service.UserEJBRemote;

public class PerchaseServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	//执行doPost方法
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String[] books =request.getParameterValues("book");
		UserEJBRemote user = (UserEJBRemote) request.getAttribute("user");
		
		
		Context ctx;
		CartEJB cart = null;
		try {
			Properties props = new Properties();
			props.setProperty(Context.INITIAL_CONTEXT_FACTORY, "org.jnp.interfaces.NamingContextFactory");
			props.setProperty(Context.PROVIDER_URL, "localhost:1099");
			props.setProperty(Context.URL_PKG_PREFIXES, "org.jboss.naming:org.jnp.interfaces");
			ctx = new InitialContext(props);
			// 创建上下文环境
			cart = (CartEJB) ctx.lookup("CartEJB/remote");
			//强制转换
			cart.user=(UserEJB) user;
			for(String book:books){
				cart.contents.add(new Goods(book));
			}
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("cart", cart);
		System.out.println(cart+"<------");
		request.getRequestDispatcher("/success.jsp").forward(request, response);
		
	}

}
