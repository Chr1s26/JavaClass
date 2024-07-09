package VegetableShopManagementSystem;

import java.util.ArrayList;

public class Inventory {
	
	private ArrayList<Vegetable> vegetables;
	private ArrayList<Customer> customers;
	private ArrayList<Vegetable> orderVegetables;
	
	public Inventory() {
		this.vegetables = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.orderVegetables = new ArrayList<>();
	}
	
	
	
	public ArrayList<Vegetable> getVegetables() {
		return vegetables;
	}



	public ArrayList<Vegetable> getOrderVegetables() {
		return orderVegetables;
	}



	public void addNewVegetable(Vegetable vegetable) {
		boolean vegetableExist = false;
		for(int index = 0;index < vegetables.size();index++) {
			if(vegetables.get(index).getName().equalsIgnoreCase(vegetable.getName())) {
				vegetables.get(index).setQuantityInStock(vegetables.get(index).getQuantityInStock()+vegetable.getQuantityInStock());
				System.out.println("Vegetables are added successfully!!");
				vegetableExist = true;
			}}
		if(!vegetableExist) {
			vegetables.add(vegetable);}
		System.out.println("Vegetables are added successfully!!");}
	
	
	
	
	public void updateVegetableStock(String name, int quantity) {
		for(int index = 0; index < vegetables.size();index++) {
			if(vegetables.get(index).getName().equalsIgnoreCase(name)) {
				vegetables.get(index).setQuantityInStock(quantity);
				System.out.println("Vegetables are updated successfully");
			}}}
	
	
	
	public void registerNewCustomer(Customer customer) {
		if(customers.contains(customer)) {
			System.out.println("Customers already registered");
		}else {
		customers.add(customer);
		System.out.println("Customers are added successfully");}}
	
	 public void ViewOrders(Customer customer) {
	    	if(orderVegetables.isEmpty()) {
				System.out.println("There is no order");
			}
	    	else {
				 System.out.println("\nOrder Form");
				 System.out.println("Customer id is "+customer.getCustomerId());
				 System.out.println("Customer name is "+customer.getName());
				 System.out.println("Order List :  Name     Qty     Price");
				 for(int index = 0; index < orderVegetables.size();index++) {
					System.out.println("              "+orderVegetables.get(index).getName()+"   "+orderVegetables.get(index).getQuantityInStock()+"     "+orderVegetables.get(index).getPricePerUnit());
				 }
				 System.out.println("Total Price "+this.generalSaleReport());
			 }
		}
	    
	
	
     public Vegetable searchVegetable(String name) {
		for(int index = 0; index < vegetables.size();index++) {
			if(vegetables.get(index).getName().equalsIgnoreCase(name)) {
				System.out.println("Vegetable found!!");
				return vegetables.get(index);}
		}
		System.out.println("There is no vegetable with that name!!");
		return null;}
        
        
        
      public double generalSaleReport() {
        	double total =0;
        	for(int index = 0; index < orderVegetables.size();index++) {
        		double answer = orderVegetables.get(index).getQuantityInStock() * orderVegetables.get(index).getPricePerUnit();
        		total += answer;}
        	return total;}
      
      
      public void displayOrderVegetable() {
    	  for(int index = 0; index < orderVegetables.size();index++) {
    		  System.out.println(orderVegetables.get(index).toString());
      }
    	  }
      
      public void displayVegetable() {
    	  for(int index = 0; index < vegetables.size();index++) {
    		  System.out.println(vegetables.get(index).toString());
      }
    	  }
      
      public void displayCustomer() {
    	  for(int index = 0; index < customers.size();index++) {
    		  System.out.println(customers.get(index).toString());
      }
    	  }
      

}
