public class Coins {
public static void main (String[]args){
	int a = Integer.parseInt(args[0]);
	int quarters = a/25; 
	int cents = a%25;
	if (a <= 0){
		System.out.println("you dont have any money");
		return;
	}
		System.out.println("Use " + quarters + " quarters " + "and " + cents +      	 " cents"); 

	} 
}