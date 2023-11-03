class PalindromeRecursive{
	public static void main(String args[]){
		int num = 13431;
		int reverse = 0;
		int rem;

		if(getReverse(num, reverse) == num)
			System.out.println(num+" is Palindrome");
		else
			System.out.println(num+" is not palindrome");
	}

	static int getReverse(int num, int reverse){
		if(num == 0)
			return reverse;

		int rem = num % 10;
		reverse = reverse * 10 + rem;

		return getReverse(num/10, reverse);
	}
}