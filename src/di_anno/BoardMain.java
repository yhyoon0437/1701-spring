package di_anno;

import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardMain {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("di_anno/anno_context.xml");
		
//		BoardDao dao = ctx.getBean("dao", BoardDao.class);
//		
//		BoardVo v = new BoardVo();
//		v.setSerial(66);
//		BoardVo vo = dao.view(v);
//		
//		if(vo != null) {
//			System.out.println("serial: " + vo.getSerial());
//			System.out.println(vo.getSubject() + ", " + vo.getWorker());
//		} else {
//			System.out.println("data not found");
//		}
		
		AutoWiredTest au = ctx.getBean("autowire", AutoWiredTest.class);
							// new AutoWiredTest(); + setter
		System.out.println(au.getUser().getIrum());
	}
}
