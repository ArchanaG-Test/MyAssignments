package week1.Assignment;

public class Bike {

	public static void main(String[] args) {
		Car c=new Car();
		Bike b=new Bike();
		c.applyBreak();
		b.soundHorn();
	}
	public void soundHorn()
	{
		System.out.println("sound horn");
	}


}
