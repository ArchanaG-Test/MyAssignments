package week1.Assignment;



public class FindMissingElement {

	public static void main(String[] args) {
		int[] a= {1,4,7,9,2,3,6,8};
		//Arrays.sort(a);
		int sum1=0,sum2=0,sub;
		for(int i=0;i<8;++i)
		{
			sum1=sum1+a[i];
			
		}
		System.out.println("sum1="+sum1);
		for(int j=1;j<=9;j++)
		{
			sum2=sum2+j;
			
		}
		System.out.println("sum2="+sum2);
		sub=sum2-sum1;
		System.out.println("The missing number="+sub);
	}

}
