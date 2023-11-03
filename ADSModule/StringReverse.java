import java.util.Scanner;
class StringReverse
{
	public static void main(String args[])
	{
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter the String : ");
		String str = sc1.nextLine();
		
		reverse(str);
	}

	static void reverse(String str)
	{
		if((str == null) || (str.length() <= 1))
		{
			System.out.print(str);
		}
		else
		{
			System.out.print(str.charAt(str.length() - 1) +" ");
			reverse(str.substring(0, str.length() - 1));
		}
	}
}