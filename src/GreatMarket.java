import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class GreatMarket {

	public static Scanner scan = new Scanner(System.in);
	public static HashMap<String, Double> customers = new HashMap<String, Double>();
	public static HashMap<String, double[]> fruitsList = new HashMap<String, double[]>();
	
	
	public static void main(String[] args) {
		
		fruitsMenu();
	}
	
	public static void customerArrival() {
		
		System.out.println("Indiquez le nom et le prénom du client :");
		String customer = scan.nextLine();
		
		
	}
	
	public static void editDayRewiew() {
		
	}
	
	public static double totalBasket() {
		return 0;
		
	}
	
	public static void fruitsMenu() {
		double[] clementine = {6,2.90};
		double[] date = {4,7.00};
		double[] grenade = {3,3.50};
		double[] kaki = {3,4.5};
		double[] kiwi = {5,3.50};
		double[] mandarin = {6,2.80};
		double[] tangerin = {8,1.50};
		double[] grapefruit = {8,2.00};
		double[] pear = {5,2.50};
		double[] apple = {8,1.50};
		
		fruitsList.put("Clémentine", clementine);
		fruitsList.put("Datte", date);
		fruitsList.put("Grenade", grenade);
		fruitsList.put("Kaki", kaki);
		fruitsList.put("Kiwi", kiwi);
		fruitsList.put("Mandarine", mandarin);
		fruitsList.put("Orange", tangerin);
		fruitsList.put("Pamplemousse", grapefruit);
		fruitsList.put("Poire", pear);
		fruitsList.put("Pomme", apple);
		
		for(String fruit : fruitsList.keySet()) {
			System.out.println(fruit + " : " + fruitsList.get(fruit)[0] + "kg | " + fruitsList.get(fruit)[1] + "€");
		}
		
	}

}
