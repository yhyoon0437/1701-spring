package di_constructor;

import java.sql.Connection;
import java.sql.DriverManager;

public class SpringDBConnect {
	private String driver;
	private String url;
	private String username;
	private String password;
	
	private Connection conn;

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Connection getConn() {
		
		try{
			Class.forName(driver).newInstance();
		    //System.out.println("driver loading success");
			conn = DriverManager.getConnection(url, username, password);
			//System.out.println("connection success");
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return conn;
		
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}
	
}
