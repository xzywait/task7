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

import service.UserEJBRemote;

public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	//执行doPost方法
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//前端参数userName和password
		String userName = request.getParameter("userName");
		System.out.println("用户名："+userName);
		String password = request.getParameter("password");
		System.out.println("密码 ："+password);
		//初始化上下文和获取远程对象方法
		Context ctx;
		UserEJBRemote user = null;
		try {
			Properties props = new Properties();
			props.setProperty(Context.INITIAL_CONTEXT_FACTORY, "org.jnp.interfaces.NamingContextFactory");
			props.setProperty(Context.PROVIDER_URL, "localhost:1099");
			props.setProperty(Context.URL_PKG_PREFIXES, "org.jboss.naming:org.jnp.interfaces");
			
			
			ctx = new InitialContext(props);
			// 创建上下文环境
			user = (UserEJBRemote) ctx.lookup("user");
			user.init(userName, password);
		} catch (NamingException e) {
			// TODO: handle exception
		}
		//将获取的user对象传入请求域中
		request.setAttribute("user", user);
		System.out.println(user+"<<<<");
		//转发到store.jsp页面
		request.getRequestDispatcher("/store.jsp").forward(request, response);
	}
}
