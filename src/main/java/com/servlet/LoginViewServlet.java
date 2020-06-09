package com.servlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginViewServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        pw.println("<form method=''action='LoginAction.do'>");
        pw.println("name:<input type='text'name='username'><br>");
        pw.println("mima:<input type='password'name='password'><br>");
        pw.println("<input type='submit'value='denglu'>");
        pw.println("</form>");
        pw.println("<html>");

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
