package di_step1;

import di_step2.MyDB;

//DI를 구현하기 전에 특정 환경에 맞는 
//스페셜한 클래스

public class Oracle implements MyDB{
	@Override
	public String getDB() {
		return "오라클";
	}
}
