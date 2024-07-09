package VegetableShopManagementSystem;
import java.io.IOException;

public class MainTest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Inventory inventory = new Inventory();
		
		Customer customer1 = new Customer(1, "Chris" , "09897164417");
		Customer customer2 = new Customer(2, "Kelvin" , "09897682417");
		
		Vegetable fruitVegetable = new FruitVegetable(3, "Tomato", "Fruit", 12, 5, 200, "Summer");
		inventory.addNewVegetable(fruitVegetable);
		Vegetable rootVegetable = new RootVegetable(2, "Carrot", "Root", 8, 10, 50, "Loamy");
		inventory.addNewVegetable(rootVegetable);
		Vegetable leafyVegetable = new LeafyVegetable(1, "Spinach", "Leafy", 10, 7, 100);
		inventory.addNewVegetable(leafyVegetable);
		
		inventory.searchVegetable("Tomato");
		
		inventory.updateVegetableStock("Carrot", 100);
		
		inventory.registerNewCustomer(customer2);
		
		customer1.placeOrder(inventory,"Tomato", 100);
		customer1.placeOrder(inventory,"Carrot", 50);
		customer1.placeOrder(inventory,"Spinach", 70);
		
		inventory.ViewOrders(customer1);
		
//		System.out.println(inventory.generalSaleReport());
//		
//		inventory.displayCustomer();
//		inventory.displayVegetable();
//		inventory.displayOrderVegetable();

	}

}
