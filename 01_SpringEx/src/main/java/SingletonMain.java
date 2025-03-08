import model.SingletonUtil;

public class SingletonMain {

	public static void main(String[] args) {
		SingletonUtil util1=SingletonUtil.getInstance();
		util1.show();
		
		SingletonUtil util2=SingletonUtil.getInstance();
		util2.show();
		
		//都會得到相同物件，就是Singleton物件

	}

}
