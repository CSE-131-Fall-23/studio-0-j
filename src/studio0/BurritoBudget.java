package studio0;

public class BurritoBudget {

		public static void main(String args[]) {
		int burritosEatenWeek1 = 7;
		int burritosEatenWeek2 = 4;
		int burritosEatenWeek3 = 19; //don't judge me
		int burritosEatenWeek4 = 1;
		
		double burritoPrice = 7.50;
		double week1Price = burritosEatenWeek1 * burritoPrice;
		double week2Price = burritosEatenWeek2 * burritoPrice;
		double week3Price = burritosEatenWeek3 * burritoPrice;
		double week4Price = burritosEatenWeek4 * burritoPrice;
		double totalPrice = week1Price + week2Price + week3Price + week4Price;
		double averageWeeklyPrice = totalPrice / 4;
		
		System.out.println("You have spent an average of $" + averageWeeklyPrice + " per week on burritos.");
	
	}
}
