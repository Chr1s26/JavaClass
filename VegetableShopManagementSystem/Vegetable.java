package VegetableShopManagementSystem;

public class Vegetable {
	
	private int vegetableId;
	private String name;
	private String category;
	private double pricePerUnit;
	private double shelfLifeDays;
	private double quantityInStock;
	
	public Vegetable(String name, double quantityInStock) {
		this.name = name;
		this.quantityInStock = quantityInStock;
	}
	
	public Vegetable(int vegetableId,String name,String category,double pricePerUnit, double shelfLifeDays,double quantityInStock) {
		this.vegetableId = vegetableId;
		this.name = name;
		this.category = category;
		this.pricePerUnit = pricePerUnit;
		this.shelfLifeDays = shelfLifeDays;
		this.quantityInStock = quantityInStock;
	}

	public String getCategory() {
		return category;
	}

	public double getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(double quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	public int getVegetableId() {
		return vegetableId;
	}

	public void setVegetableId(int vegetableId) {
		this.vegetableId = vegetableId;
	}

	public String getName() {
		return name;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(int pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public double getShelfLifeDays() {
		return shelfLifeDays;
	}

	@Override
	public String toString() {
		return "Vegetable id is "+this.getVegetableId()+"\n Vegetable name is "+this.getName()+"\n Vegetable category is "+this.getCategory()+"\n Vegetable price per unit is "+this.pricePerUnit+"\n Vegetable shelfLife days is "+this.getShelfLifeDays()+"\n Vegetable quantity in stock is "+this.quantityInStock;
	}
	
	
	
	
}
