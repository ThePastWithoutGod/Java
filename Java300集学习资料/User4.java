/**
 * 测试参数传值机制
 * @author allen
 *
 */
public class User4 {
	int id;			//id
	String name;	//账户名
	String pwd;		//密码
	
	public User4(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public void testParameterTransfer01(User4 u) {
		u.name = "allen.hou";
	}
	
	public void testParameterTransfer02(User4 u) {
		u = new User4(200,"kekeke");
	}
	
	public static void main(String[] args) {
		User4 u1 = new User4(1002,"allen.houke");
		u1.testParameterTransfer01(u1);
		System.out.print(u1.name);
	}
}
