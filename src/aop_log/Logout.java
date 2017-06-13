package aop_log;

public class Logout implements Log{

	@Override
	public void log(String id) {
		System.out.println(id + "님이 로그아웃했습니다.");
	}


}
