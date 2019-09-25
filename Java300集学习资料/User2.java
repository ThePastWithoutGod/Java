/**
 * 测试static关键字
 * @author allen
 *
 */
public class User2 {
	int id;
	String name;
	String pwd;
	
	static String company = "徐工信息";
	
	public User2(int id,String name) {
		this.id = id;
		this.name = name;
	}
	public void login() {
		System.out.print("登录："+ name);
	}
	
	/**
	 * 静态的方法中无法调用非静态的方法
	 */
	public static void printCompany() {
		//login(): 调用非静态成员，编译就会报错
		System.out.println(company);
	}
	
	public static void main(String[] args) {
		User2 u = new User2(1001,"侯克");
		User2.printCompany();
		User2.company = "阿里巴巴";
		User2.printCompany();
	}
	
}
