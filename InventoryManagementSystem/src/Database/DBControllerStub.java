package Database;

import java.util.ArrayList;

import DomainObj.Item;

public class DBControllerStub implements DBControllerInterface{
	private boolean connected = false;
	
	@Override
	public void close() {
		connected = false;
	}

	@Override
	public void connect() {
		connected = true;
	}

	@Override
	public boolean isConnected() {
		return connected;
	}
	
	@Override
	public ArrayList<Item> getItems() {
		return createItems();
	}
	
	//************************************************************
	//					INTERNAL METHODS
	//************************************************************
	
	private ArrayList<Item> createItems(){
		ArrayList<Item> result = new ArrayList<Item>();
		
		for(int i = 0; i < 10; i++){
			result.add(new Item("item"+i, "", "", i*0.5));
		}
		
		return result;
	}
}
