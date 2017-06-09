package main;

import org.springframework.context.support.GenericXmlApplicationContext;
import bean.BoardDao;
import bean.BoardVo;

public class BoardMain {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("bean/board_context.xml");
		
		BoardDao dao = ctx.getBean("dao", BoardDao.class);
		
		BoardVo v = new BoardVo();
		v.setSerial(66);
		BoardVo vo = dao.view(v);
		
		if(vo != null) {
			System.out.println("serial: " + vo.getSerial());
			System.out.println(vo.getSubject() + ", " + vo.getWorker());
		} else {
			System.out.println("data not found");
		}
	}
}
