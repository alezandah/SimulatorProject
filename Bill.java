import java.util.Random;
public class Bill {
	private String ClientName;
	private String Food;
	private double Price;
	private String Drinks; 

	/*public String Receipt () {
			
	}
	*/
	
	public void setFood(String Food){		
		this.Food=Food;
	}

	public String getFood(){		
		return Food;
	}

	public void setDrinks(String Drinks){		
		this.Drinks=Drinks;
	}

	public String getDrinks(){		
		return Drinks;
	}

}

















/*

double FoodPrice[]={0,20,30,15,10,15,9,20,3};
	double DrinksPrice[]={0,15,1.70,15,5,7,6,5,5};

	Random meal = new Random();
	int a=meal.nextInt(8);
	int b=meal.nextInt(8);
	double total= (FoodPrice[a] + DrinksPrice[b]);
	System.out.println("FoodPrice + DrinksPrice +Total");
	System.out.println(FoodPrice[a] + DrinksPrice[b] + total);

	*/