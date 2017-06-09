package di_step1;

import di_step2.MyDB;

//DI 형태의 구조물이 만들어지지 않은 상태로
//서로 다른 환경에서는 코드를 그때 그때 다시 디버깅해야함

public class DiMain {
	
	public static void prn(MyDB db) {
		System.out.println(db.getDB());
		
	}

	public static void main(String[] args) {
		MyDB sql1 = new MsSql();
		prn(sql1);
		
		MyDB sql2 = new Oracle();
		prn(sql2);
		
		MyDB sql3 = new MySql();
		prn(sql3);
		
	}
}
