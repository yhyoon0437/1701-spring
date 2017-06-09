package di_step1;

import di_step2.MyDB;

public class MySql implements MyDB{
	
	@Override
	public String getDB() {
		return "마이에스큐엘";
	}
}
