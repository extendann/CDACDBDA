import java.util.Scanner;
class Hello
{
	public static void main(String[] args)
	{	
		boolean isActive = false;
		System.out.println("Hi, Dannish : "+isActive);
	/*	int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println("Addition is "+(num1+num2));
	//*/	int count;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value to Check : "); 
		if( sc.nextInt() == 10)
			System.out.println("True");
		else
			System.out.println("False");
	}
}	