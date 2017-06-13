package aop_log;

import org.aspectj.lang.JoinPoint;

public class PrintLog {

	public Object before(JoinPoint point) throws Throwable {
		String methodName = point.getSignature().getName();
		
		System.out.println("<" + methodName + "> is calling..");
		
		return null;
	}

}
