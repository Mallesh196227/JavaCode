import java.util.Scanner; 

public class HypoTrinangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double base, perpendicular, hypothenuse; 
		Scanner scn=new Scanner(System.in);
		
		//formula for Hypotenuse of right angle triangle is:
		//ac(square)= SqrRoot of(ab(Square)+bc(square)); or
		//hypotenuse = base(square)+perpendicular\height(square);
		
		
		
		System.out.println("Enter the base value");
		base =scn.nextDouble();
		
		System.out.println("Enter the perpendicular value");
		perpendicular = scn.nextDouble();
		
		hypothenuse = Math.sqrt(Math.pow(base,2) + Math.pow(perpendicular, 2) );
		
		System.out.println("The Length of the hypothenuse is" + hypothenuse);

	}

}
