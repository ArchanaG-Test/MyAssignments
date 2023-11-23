package week1.Assignment;

import java.util.Arrays;

public class Secondsmallno {

	public static void main(String[] args) {
		int[] a= {22,78,90,34,51};
		Arrays.sort(a);
		int len=a.length;
		System.out.println("Length of array ="+len);
		for(int i=0;i<len;i++)
		{
			System.out.println(a[i]);
		}
System.out.println("The second smallest number="+a[1]);
	}

}
