package DomainObj;

public class Item {
	private String name;
	private String type;
	private String materials;
	private double price;
	
	public Item(){
		name = "";
		type = "";
		materials = "";
		price = 0;
	}
	
	public Item(String name, String type, String materials, double price){
		setName(name);
		setType(type);
		setMaterials(materials);
		setPrice(price);
	}
	
	public String toString(){
		return name + " " + type + " " + materials + " " + price;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public void setMaterials(String materials){
		this.materials = materials;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public String getName(){
		return name;
	}
	
	public String getType(){
		return type;
	}
	
	public String getMaterials(){
		return materials;
	}
	
	public double getPrice(){
		return price;
	}
}
