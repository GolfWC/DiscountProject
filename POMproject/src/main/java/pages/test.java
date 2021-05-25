package pages;

public class test {
	static int number;
	public test(String str) {
		this(str.length());
	}
	public test(int num) {
		this();
		number += num;
	}
	public test() {
		number += 1;
	}
	
}

class cellPhone{
	public static void main(String [] args) {
		new test("iphone");
		new test();
		new test(4);
		System.out.println(test.number);
		
	}
}
