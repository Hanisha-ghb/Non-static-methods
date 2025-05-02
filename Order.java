public class Order{
	public String getOrderDetails(String restaurantName, String foodItem, int quantity){
		return "Restaurant Name :"+restaurantName + "\nFood Item : "+foodItem + "\nQuantity : "+quantity;
	}
	public static void main(String [] args){
		Order order=new Order();
		String result=order.getOrderDetails("Spice Garden" , "Paneer Butter Masala" , 2);
	System.out.println("result");
		System.out.println("-------------------------");
		String result1=order.getOrderDetails("Spice Garden" , "Chicken Biryani" , 1);
	System.out.println("result");
		System.out.println("-------------------------");
	}
}