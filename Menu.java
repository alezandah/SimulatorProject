import java.util.Random;
public class Menu {

		String Food[]= {"No Food","Banku", "Rice", "Eba", "Konkonte","TZ", "Waakye", "Amala","Akara"};
		String Drinks[]={"No Drink","Agya Appiah","Coke","Alomo", "Pito","Palm Wine","Local Hot", "Sobolo", "water"};
		double FoodPrice[]={0,20,30,15,10,15,9,20,3};
		double DrinksPrice[]={0,15,1.70,15,5,7,6,5,5};
		double Total;
		Random meal = new Random();
		int a=meal.nextInt(8);
		int b=meal.nextInt(8);
		double c = meal.nextInt(8);

		Bill bill = new Bill();
		public Bill getBill() 
		{
			return bill;
		}

		public Menu()
		{
		bill.setFood(Food[a]);
		bill.setDrinks(Drinks[b]);
		}
// Calculating the total of the drinkprice and the foodprice
		public double total()
		{

		Total = (FoodPrice[a] + DrinksPrice[b]);
		return Total;
		}
}



















/*
Random meal = new Random();
		int a=meal.nextInt(8);
		int b=meal.nextInt(8);
		double total= (FoodPrice[a] + DrinksPrice[b]);
		System.out.println("Food\t\t FoodPrice\t Drinks\t\t DrinksPrice\t\t Total");
		System.out.println(Food[a] + "\t"+FoodPrice[a]+"\t\t"+ Drinks[b]+"\t\t"+DrinksPrice[b] + "\t\t" + total);
*/