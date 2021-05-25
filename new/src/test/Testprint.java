package test;

public class Testprint {

	static int number;

	public Testprint(String str) {
		this(str.length());

	}

	public Testprint(int num) {//6 
		this();				//1		
		number = number + num;//7	 
	}

	public Testprint() {
		number = number + 1;//1+1=2
	}

	public static void main(String[] args) {
		new Testprint("iphone");
		new Testprint();   //adding 1
		new Testprint(4);
	
		
		
		

		System.out.println(Testprint.number);
	}

}
