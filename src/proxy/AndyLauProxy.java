package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理对象 
 * @author WZM
 *
 * 2018年7月23日
 */
public class AndyLauProxy {
	private Person ldh = new AndyLau();//目标对象
	
	/**
	 * 设计一个方法生成代理对象 jdk动态代理（就是使用动态代理的对象必须实现一个或多个接口）
	 * @return
	 */
	public Person getProxy(){
		return (Person) Proxy.newProxyInstance(AndyLauProxy.class.getClassLoader(),ldh.getClass().getInterfaces(),
				new InvocationHandler(){
					/**
					 * 对目标方法增强
					 */
					@Override
					public Object invoke(Object proxy, Method method,
							Object[] args) throws Throwable {
						 //如果调用的是代理对象的sing方法
                         if (method.getName().equals("sing")) {
                             System.out.println("我是他的经纪人，要找他唱歌得先给十万块钱！！");
                             //已经给钱了，经纪人自己不会唱歌，就只能找刘德华去唱歌！
                             return method.invoke(ldh, args); //代理对象调用真实目标对象的sing方法去处理用户请求
                         }
                         //如果调用的是代理对象的dance方法
                         if (method.getName().equals("dance")) {
                             System.out.println("我是他的经纪人，要找他跳舞得先给二十万块钱！！");
                             //已经给钱了，经纪人自己不会唱歌，就只能找刘德华去跳舞！
                             return method.invoke(ldh, args);//代理对象调用真实目标对象的dance方法去处理用户请求
                         }
                         return null;
					}
		});
	}
	
}
