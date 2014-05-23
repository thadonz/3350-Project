package Database;

public class DBHolder {
	static DBControllerInterface instance;
	
	public static DBControllerInterface getDb(){
		if(instance == null){
			instance = new DBControllerStub();
			//instance = new DBControllerFinal(); //uncomment when ready to move to real database
		}
		
		return instance;
	}
}
