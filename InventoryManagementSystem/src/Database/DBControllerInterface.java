package Database;

import java.util.ArrayList;
import DomainObj.Item;

public interface DBControllerInterface {
	public void close();
	public void connect();
	public boolean isConnected();
	public ArrayList<Item> getItems();
}
