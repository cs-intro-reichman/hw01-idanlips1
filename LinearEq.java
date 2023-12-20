public class LinearEq {
public static void main (String[]args){
	double a = Double.parseDouble(args[0]);
	double b = Double.parseDouble(args[1]);
	double c = Double.parseDouble(args[2]);
	if (a == 0) {
		System.out.println("The coefficient 'a' cannot be zero for a linear equation.");
		return;
	}
	double x = (c-b)/a;	
		System.out.println(a + " * " + "x " + "+ " + b + " = " + c);
		System.out.println("X " + "= " + x); 

	} 
}