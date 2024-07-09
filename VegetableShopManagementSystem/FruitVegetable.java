package VegetableShopManagementSystem;

public class FruitVegetable extends Vegetable {
	
	private String seasonality;
	
	public FruitVegetable(int vegetableId,String name,String category,double pricePerUnit, double shelfLifeDays,double quantityInStock,String seasonality) {
		super(vegetableId, name,category,pricePerUnit,shelfLifeDays,quantityInStock);
		this.seasonality = seasonality;
	}

	public String getSeasonality() {
		return seasonality;
	}

	public void setSeasonality(String seasonality) {
		this.seasonality = seasonality;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\n vegetable seasonality is "+this.seasonality;
	}
	

}
