package VegetableShopManagementSystem;

public class RootVegetable extends Vegetable{
	
	private String soilType;
	
	public RootVegetable(int vegetableId,String name,String category,double pricePerUnit, double shelfLifeDays,double quantityInStock,String soilType) {
		super(vegetableId, name,category,pricePerUnit,shelfLifeDays,quantityInStock);
		this.soilType = soilType;
	}

	public String getSoilType() {
		return soilType;
	}

	public void setSoilType(String soilType) {
		this.soilType = soilType;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\n vegetable soil type is "+this.getSoilType();
	}
	
}
