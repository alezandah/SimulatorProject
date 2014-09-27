/*public class Restaurant {
	private int Tables = 5;
	private int Cook = 1;
	private int Servers = 2;

	public Restaurant(int){

	}
}*/

public class Restaurant{

	int Counter=6;
	String FirstName;
	String LastName;
	String Food;
	String Drink;
	String Bill;

public Restaurant(){
	do {
		newClient();
		Counter--;
	}while (Counter>1);



}

	public static void newClient(){

		ClientFactory cFactory = new ClientFactory(); 
		Bill bill = new Bill();
	 System.out.println(cFactory.getClient().getFirstName() + " " + cFactory.getClient().getLastName());

	 Menu menu = new Menu();
	 Client cClient= new Client();
	 System.out.println(menu.getBill().getFood());
	 System.out.println(menu.getBill().getDrinks());
	 System.out.println(menu.total());


	 System.out.println(cFactory.getClient().getGuests());
	} 



}