
public class User {
	int id;
	String name;
	String pwd;
	
	public User() {
		
	}
	public User(int id,String name) {
		super();		//构造方法的第一句总是super()
		/**
		 * 	右边的id根据就近原则指的是局部变量中的id，而不是成员变量中的id
		 *  左边的id如果没有this的话指的都是局部变量中的id
		 *  this表示创建好的对象，this.id指的是根据类User创建出来的对象的成员变量
		 */
		this.id = id;	
		this.name = name;
	}
	public User(int id,String name,String pwd) {
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}
	public static void main(String[] args) {
		User u1 = new User();
		User u2 = new User(1001,"侯克");
		User u3 = new User(1001,"侯克","12345");
	}
}
