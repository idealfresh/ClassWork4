import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);
	System.out.println("Insert number: ");
	int a = scan. nextInt();
	if (a>=1 && a<=5)
	
		
		if (a%2==0){
			
			System.out.println("The number is even: ");
		}
			else {
				System.out.println("The number is odd: ");
			}
	
		
	
	else if(a>=6 && a<=15){
		
	if( a% 3==0){
			
		System.out.println("The number devide by 3");
	} else System.out.println("The number doesn't devide by 3 ");
	
	}
	else if (a<1)
		
		if (a==0){
		System.out.println("The number is zero");
		}else System.out.print("The number is negative");
	
else if (a>15){
		System.out.println("The number is possitive");
}
	}
	
}

