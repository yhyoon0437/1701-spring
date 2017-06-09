package di_anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AutoWiredTest {
	
	private Member user;

	public Member getUser() {
		return user;
	}

	@Autowired
	@Qualifier("guest")
	public void setUser(Member user) {
		this.user = user;
	}
	
	
	
	
	


}
