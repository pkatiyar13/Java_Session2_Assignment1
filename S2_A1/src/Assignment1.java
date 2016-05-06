import java.util.*;
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int age;
		System.out.println("Please Enter Your Age: ");
		age = scan.nextInt();
		if(age>=18)
			System.out.println("You Are Eligible to Vote");
		else
			System.out.println("You Are Not Eligible to Vote");
	}

}
