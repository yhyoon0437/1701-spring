package begin;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
//		스프링의 환경설정 파일인 app_context.xml을
//		사용함으로써 같은 의미로 처리됨
//		Greeter g = new Greeter();
//		g.setFormat("%s, 안녕하세요~");
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("begin/app_context.xml");
		
		Greeter g = ctx.getBean("greeter",Greeter.class);
		
		String temp = g.greet("Spring");
		System.out.println(temp);
		
	}
}
