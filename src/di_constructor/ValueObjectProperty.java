package di_constructor;

public class ValueObjectProperty {
	
	int sdan;
	int edan;
	
	public void setSdan(int sdan) {
		this.sdan = sdan;
	}
	
	public void setEdan(int edan) {
		this.edan = edan;
	}
	
	public void output() {
		
		for(int j=sdan; j<=edan; j++){
			
		System.out.println("=============================");
			
			for(int i=0; i<10; i++) {
				String temp = String.format("%d * %d = %d", j, i, (j*i));
				System.out.println(temp);
			}
		}
	}

}
