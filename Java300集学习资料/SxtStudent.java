
public class SxtStudent {
	
	//属性
	int id;
	String name;
	int age;
	
	Computer comp;	//计算机
	
	//方法
	void study() {
		System.out.println("我在学习"+comp.brand);
	}
	
	void play() {
		System.out.println("我在玩游戏");
	}
	
	//构造方法 用于创建这个类的对象。无参的构造方法可以由系统自动创建
	SxtStudent(){
		
	}
	
	//程序执行的入口，必须要有
	public static void main(String[] args) {
		SxtStudent stu = new SxtStudent();
		stu.id = 1001;
		stu.name = "侯克";
		stu.play();
		Computer c1 = new Computer();
		c1.brand = "Lenovo";
		stu.comp = c1;
	}
}

class Computer{
	String brand;
}
