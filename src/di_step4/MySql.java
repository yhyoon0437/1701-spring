package di_step4;

import di_step4.MyDB;

public class MySql implements MyDB{
	
	@Override
	public String getDB() {
		return "마이에스큐엘";
	}
}
