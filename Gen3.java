 class Gen3 {
public static void main (String[]args){
		
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	int firstRandom = (int)(a + Math.random() * (b-a));
	int secondRandom = (int)(a + Math.random() * (b-a));
	int thirdRandom = (int)(a + Math.random() * (b-a));
	int min = (int)Math.min(firstRandom, (int)Math.min(secondRandom, 		thirdRandom));
		System.out.println(firstRandom);
		System.out.println(secondRandom);
		System.out.println(thirdRandom);
		System.out.println("The minimal generated number was " + min);


 }
}