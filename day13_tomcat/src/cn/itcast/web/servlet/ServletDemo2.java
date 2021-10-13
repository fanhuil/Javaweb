package cn.itcast.web.servlet;

import javax.servlet.*;
import java.io.IOException;


public class ServletDemo2 implements Servlet {
    /**
     * 在servlet被创建时执行，执行一次
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 提供服务方法
     * 每一次Servlet被访问时，执行多次
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service....");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 在服务器正常关闭时，执行一次
     */
    @Override
    public void destroy() {

    }
}
