package week1.Assignment;

public class Mobile {

	public static void main(String[] args) {
		Mobile m=new Mobile();
		System.out.println("This is my mobile");
		m.makeCall();
		m.sendMsg();
	}
	public void makeCall()
	{
		String mobileModel="vivo";
		Float mobileWeight=5.6f;
		System.out.println("Mobile Mode="+mobileModel);
		System.out.println("Mobile Weight="+mobileWeight);
		
		
	}
	public void sendMsg()
	{
		Boolean isFullycharged=true;
		int mobileCost=15;
		System.out.println("Fully charged="+isFullycharged);
		System.out.println("Mobile Cost="+mobileCost);
		
	}

}
