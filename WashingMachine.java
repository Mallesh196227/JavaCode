import java.util.Scanner;
public class WashingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Estimated Weight ");
		int weight = scn.nextInt();
		if(weight<0) {
			System.out.println("Invalid Weight");
		}
		else if(weight == 0 ) {
			System.out.println("Estimation time is 0 Minutes");
		}
		else if (weight > 0 && weight <=2000)
		{
			System.out.println("Estimation time is 25 Minutes");
		}
		else if(weight >= 2001 && weight <=4000) {
			System.out.println("Estimation time is 35 Minutes");
		}
		else if(weight >=4001 && weight <=7000) {
			System.out.println("Estimation time is 45 Minutes");
		}
		else {
			System.out.println("Over loaded");
		}
	}

}
