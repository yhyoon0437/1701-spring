package di_step4;

import di_step4.MyDB;

public class MsSql implements MyDB{
	
	@Override
	public String getDB() {
		return "엠에스에스큐엘";
	}
}
