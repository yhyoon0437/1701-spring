package di_constructor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.context.support.GenericXmlApplicationContext;

import bean.BoardVo;

public class DiMain {
	
	public DiMain(){
		//스프링이 제공한 외부 조립기
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("di_constructor/value_context.xml");
		
		//생성자의 매개변수가 기본형인 클래스
//		ValueObject o1 = ctx.getBean("obj1",ValueObject.class);
						// new ValueObject();
		
//		ValueObjectProperty vop = ctx.getBean("val",ValueObjectProperty.class);
//		vop.output();
		
		
		SpringDBConnect db = ctx.getBean("db",SpringDBConnect.class);
		
		PreparedStatement ps;
		ResultSet rs;
		
		String sql = "select * from board where serial=?";
		
		try{
			
			ps = db.getConn().prepareStatement(sql);
			ps.setInt(1, 66);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println("================================");
				System.out.println("serial : " + rs.getInt("serial"));
				System.out.println("subject : " + rs.getString("subject"));
				System.out.println("worker : " + rs.getString("worker"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new DiMain();
		

	}

}
