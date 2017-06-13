package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BeginController {
	
	@RequestMapping("/begin") //요청 url중 /hello 경로가 표시되었을 때
	public String abc(Model model,
			@RequestParam(value = "name", required = false)
		    String name){
		
		
		showHello(model,name);
		return "begin"; // view의 이름.
		
	}
	
	public void showHello(Model model, String name) {
		model.addAttribute("greeting","안녕?"+name);
		
	}
	
}