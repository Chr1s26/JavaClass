package VegetableShopManagementSystem;

import java.util.ArrayList;

public class Customer {
	
	private int customerId;
	private String name;
	private String contactInfo;
	
	
	public Customer(int customerId,String name,String contactInfo) {
		this.customerId = customerId;
		this.name = name;
		this.contactInfo = contactInfo;
		
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}
	
	public void placeOrder(Inventory inventory,String name,int quantity) {
		boolean vegetableExist = false;
		 ArrayList<Vegetable> vegetables = inventory.getVegetables();
	     ArrayList<Vegetable> orderVegetables = inventory.getOrderVegetables();
	     
	     for(int index = 0; index <vegetables.size();index++) {
	    	 if(vegetables.get(index).getName().equalsIgnoreCase(name)) {
	    		 vegetableExist = true;
	    		 if(vegetables.get(index).getQuantityInStock() >= quantity) {
	    			 vegetables.get(index).setQuantityInStock(vegetables.get(index).getQuantityInStock()-quantity);
	    			 System.out.println("Order successful!!");
	    			 Vegetable vegetable = new Vegetable(vegetables.get(index).getVegetableId(), vegetables.get(index).getName(), vegetables.get(index).getCategory(), vegetables.get(index).getPricePerUnit(), quantity, vegetables.get(index).getShelfLifeDays());
	    			 orderVegetables.add(vegetable);
	    		 }
	    		 else {
	    			 System.out.println("Not enough quantity!!");
	    		 }
	    		 break;
	    	 }
	     }
	     if(!vegetableExist) {
	    	 System.out.println("There is no vegetable with that name!!");
	     }
	}
	

	@Override
	public String toString() {
		return "Customer id is "+this.getCustomerId()+"\n Customer name is "+this.getName()+"\n Customer contact Info is "+this.getContactInfo();
	}
	
	
	

}
