public class Coins {
public static void main (String[]args){
	int a = Integer.parseInt(args[0]);
	int quarters = a/25; 
	int cents = a%(quarters*25);
		System.out.println("Use " + quarters + " quarters " + "and " + cents +      	 " cents"); 

	} 
}