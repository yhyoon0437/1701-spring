package aWired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import di_constructor.Member;

public class AWired {
	
	Member mem;
	
	@Autowired
	@Qualifier("guest")
	public void setMem(Member m) {
		this.mem = m;
	}
	
	
	public AWired(){
	}


	public static void main(String[] args) {

	}

}
