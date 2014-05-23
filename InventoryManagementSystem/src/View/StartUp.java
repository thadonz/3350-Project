package View;

import java.util.ArrayList;

import Database.DBControllerInterface;
import Database.DBHolder;
import DomainObj.Item;

public class StartUp {
	public static void main(String[] args){
		DBControllerInterface db = DBHolder.getDb();
		System.out.println("db is connected=" + db.isConnected() + "\n");
		db.connect();
		System.out.println("db is connected=" + db.isConnected() + "\n");
		
		ArrayList<Item> items = db.getItems();
		System.out.println("all items in ArrayList:");	
		for(Item item:items){
			System.out.println("\t" + item);
		}
		System.out.println();
		
		db.close();
		System.out.println("db is connected=" + db.isConnected() + "\n");
	}
}
