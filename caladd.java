import java.util.Scanner;
 public class caladd {
	/* comment added by team1 1 */
 	public static void main(String[] args) {
 		float a, b, res;
 		char choice, ch;
 		Scanner scan = new Scanner(System.in);

 		do{
 			System.out.print("1. ADD TWO Numbers\n");
			System.out.print("2.Subtract two numbers");
 			System.out.print("3. MULTIPLY TWO Numbers\n");
 			System.out.print("4. Exit\n\n");
 			System.out.print("Enter Your Choice : ");
 			choice=scan.next().charAt(0);
 			switch(choice) {
 				case '1' : System.out.print("Enter Two Numbers : ");
 						   a=scan.nextFloat();
 						   b=scan.nextFloat();
 						   res= a + b;
 						   System.out.print("Result = " + res);
 						   break;

 				case '2' : System.out.print("Enter Two Numbers : ");
 						   a=scan.nextFloat();
 						   b=scan.nextFloat();
 						   res= a - b;
 						   System.out.print("Result = " + res);
 						   break;

 				case '3' : System.out.print("Enter Two Numbers : ");
 						   a=scan.nextFloat();
 						   b=scan.nextFloat();
 						   res= a * b;
 						   System.out.print("Result = " + res);
 						   break;


 				case '4' : System.exit(0);
 						   break;

 				default  : System.out.print("INVALID CHOICE !!!");
 						   break; 
 			}
 			System.out.print("\n---------------------------------------------------\n");

 		}while(choice !=2); 
 	}
 	/*comment added by team 2*/
 }
