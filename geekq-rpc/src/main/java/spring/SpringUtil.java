package spring;

import org.springframework.context.ApplicationContext;

/** 
 * spring工具类
 * @author 邱润泽
 */
public class SpringUtil {

	/**
	 * spring上下文
	 */
	private static ApplicationContext applicationContext;

	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public static void setApplicationContext(ApplicationContext applicationContext) {
		SpringUtil.applicationContext = applicationContext;
	}
}
