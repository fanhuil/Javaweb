package cn.itcast.web.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener {

    /**
     * 监听ServletContext对象创建的。ServlerContext对象服务器启动后自动创建
     * 服务器启动后自动调用
     *
     * @param servletContextEvent
     */
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        // 加载资源文件
        ServletContext servletContext = servletContextEvent.getServletContext();
        // 加载

        System.out.println("ServletContext对象被创建了...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContext对象被销毁了...");
    }
}
