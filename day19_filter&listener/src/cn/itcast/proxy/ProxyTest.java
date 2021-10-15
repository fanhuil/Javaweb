package cn.itcast.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        // 1、创建真实对象
        Lenovo lenovo = new Lenovo();

        // 2、动态代理增强lenovo对象
        SaleComputer proxy_lenovo = (SaleComputer) Proxy.newProxyInstance(
                lenovo.getClass().getClassLoader(),// 类加载器：真实对象.getClass().getClassLoader()
                lenovo.getClass().getInterfaces(),// 接口数组：真实对象.getClass().getInterfaces()
                /*
                * 代理逻辑编写方法：代理对象调用的所有方法都会触发该方法执行
                * */
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("该方法执行了");
                        return null;
                    }
                }
        );

        // 3、调用方法
        String computer = proxy_lenovo.sale(8000);
        System.out.println(computer);

    }
}
