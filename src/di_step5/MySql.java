package di_step5;

import di_step5.MyDB;

public class MySql implements MyDB{
	
	@Override
	public String getDB() {
		return "마이에스큐엘";
	}
}
