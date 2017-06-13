package aop_log;

public class Login implements Log{

	@Override
	public void log(String id) {
		System.out.println(id + "님이 환영합니다.");
	}
	
	

}
