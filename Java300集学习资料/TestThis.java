
public class TestThis {
	int a, b, c;
	
	TestThis(int a,int b){
		this.a = a;
		this.b = b;
	}
	TestThis(int a,int b,int c){
		this(a,b);
		this.c = c;
	}
	void sing() {
		
	}
	void eat() {
		this.sing();//调用本类中的sing（）;
		System.out.println("AAAA");
	}
	public static void main(String[] args) {
		TestThis th1 = new TestThis(2,3);
		th1.eat();
	}
}
