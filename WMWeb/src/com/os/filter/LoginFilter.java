package com.os.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.os.domain.User;

/**
 * Servlet Filter implementation class LoginFilter
 */
/**
 * 登录过滤器 
 * 在我的订单、申请开店和结算时看下有没登录
 * @author oy
 *
 */
public class LoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse resp = (HttpServletResponse) response;
		resp.setCharacterEncoding("UTF-8");  
		PrintWriter out = resp.getWriter();
		
		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("user");
		
		if(user != null) {
			chain.doFilter(req, resp);
		}else {
			out.println("<script>alert('1')</script>");
			req.getRequestDispatcher("/jsp/login1.jsp").forward(req, resp);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
