package aop_log;

public class Search implements Log{

	@Override
	public void log(String id) {
		System.out.println(id + "를 검색했습니다.");
	}


}
