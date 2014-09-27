import java.util.Random;

public class ClientFactory {
		
	Random rand = new Random();
	String Firstname[] = {"Alexander", "Kennedy", "David", "Barnabas", "Laud"};
	String Lastname[] = {"Okereke", "Nsoh", "Anyinatoe", "Evhade", "Bruce"};

	Client see = new Client();

	// adding constructors

	public ClientFactory() {		
		see.setFirstName(Firstname[rand.nextInt(5)]);
		see.setLastName(Lastname[rand.nextInt(5)]);
		see.setGuests((int)(Math.random()*5));
		
// this is the side that is giving us much trouble 
		//System.out.println(see.getGuests() + " test " + (int)(Math.random()*5));
	}

	public Client getClient() {
		return see;
	} 
	//Constructing the get method for the number of Guests
//	public Client getGuests(){
	//	return see;
	//}

}