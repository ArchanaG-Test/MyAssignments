package week1.Assignment;

public class Primenumbercheck {

	public static void main(String[] args) {
		int n=9;
		int count=0;
		if(n>1)
		{
			for(int i=1;i<=n;i++)
			{
				if(n%1==0)
				{
					count++;
				}
			}
			if(count==2) 
			{
				System.out.println(n+"= Prime");
			}
			else 
			{
				System.out.println(n+"= Not Prime");
			}
			
		}

	}

}
