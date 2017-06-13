package aop_xml;

import org.aspectj.lang.JoinPoint;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainXmlPojo {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx= 
				new GenericXmlApplicationContext("aop_xml/aopPojo.xml");
		
		Calculator impeCal = ctx.getBean("impeCal",Calculator.class);
		long fect1 = impeCal.factorial(5);
		System.out.println("impeCal.factorial(5) = "+fect1);
		
		Calculator recCal = ctx.getBean("recCal",Calculator.class);
		long fect2 = recCal.factorial(5);
		System.out.println("recCal.factorial(5)="+fect2);
		
		//before advice유형
		
		Login login = ctx.getBean("login",Login.class);
		login.loginCheck("kim");
		
		
	} 
}