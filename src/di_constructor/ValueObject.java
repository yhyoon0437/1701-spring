package di_constructor;

public class ValueObject {
	
	int danSet;

	public void setDanSet(int danSet) {
		this.danSet = danSet;
	}

	public ValueObject(int dan) {
		System.out.println("=============================");
		for(int i=0; i<10; i++) {
			String temp = String.format("%d * %d = %d", dan, i, (dan*i));
			System.out.println(temp);
		}
	}
	
	public ValueObject() {
		System.out.println("=============================");
		for(int i=0; i<10; i++) {
			String temp = String.format("%d * %d = %d", danSet, i, (danSet*i));
			System.out.println(temp);
		}
	}
	
}
