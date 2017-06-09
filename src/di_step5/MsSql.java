package di_step5;

import di_step5.MyDB;

public class MsSql implements MyDB{
	
	@Override
	public String getDB() {
		return "엠에스에스큐엘";
	}
}
