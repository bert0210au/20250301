package model;

public class SingletonUtil {
//	私有建構式
//	私有靜態的欄位，用來存放單例實體
//	公有靜態的方法，來獲得單例實體
	
	private static SingletonUtil instance;
	
	private SingletonUtil() {
		
	}

	public static SingletonUtil getInstance() {
		if (instance == null) {
        	// 首次呼叫才產生物件
            instance = new SingletonUtil();
        }
        return instance;//如果已經有物件就直接return原有的物件，因此都會取得相同物件
	}
	
	   public void show() {
	    	System.out.println(instance);
	    }
}
