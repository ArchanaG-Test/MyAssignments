package week1.Assignment;

public class Palindrome {

	public static void main(String[] args) {
		int input=121;
		int org_num=input;
		int rev=0;
		while(input!=0)
		{
			rev=rev*10+input%10;
			input=input/10;
			
		}
		if(org_num==rev)
		{
			System.out.println(org_num+"= Palindrome");
		}
		else
		{
			System.out.println(org_num+"= Not Palindrome");
		}
		

	}

}
