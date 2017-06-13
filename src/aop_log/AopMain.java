package aop_log;

import org.springframework.context.support.GenericXmlApplicationContext;


public class AopMain {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("aop_log/aopPojo.xml");

		Log login = ctx.getBean("login", Log.class);
		login.log("yyh");

//		Log logout = ctx.getBean("logout", Log.class);
//		logout.log("yh");
		
		
		
		

	}

}
