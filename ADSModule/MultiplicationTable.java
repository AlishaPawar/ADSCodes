import java.util.Scanner;
class MultiplicationTable
{
	public static void main(String args[])
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc1.nextInt();

		printTable(num, 1);
	}
	static int printTable(int num, int i) {
    	if (i <= 10) {
        	System.out.println(num + " x " + i + " = " + num * i);
        	printTable(num, i + 1);
    	}
   		return 0;
	}
}
