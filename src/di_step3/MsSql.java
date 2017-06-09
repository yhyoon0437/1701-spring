package di_step3;

import di_step2.MyDB;

public class MsSql implements MyDB{
	
	@Override
	public String getDB() {
		return "엠에스에스큐엘";
	}
}
