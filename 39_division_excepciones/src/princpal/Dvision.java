package princpal;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Dvision {

	public static void main(String[] args) {
		try 
		{ 
			Scanner sc=new Scanner(System.in);
			 int a=sc.nextInt();
			 int b=sc.nextInt();
			 int s=a/b;
			 System.out.println("División: "+s);
		}
		catch(InputMismatchException ex)
		{
			 System.out.println("Número incorrecto");
		}
		catch(ArithmeticException ex)
		{
			 System.out.println("División por 0");
		}
		finally 
		{
			System.out.println("FIN DEL PROGRAMA");
		}
	}

}
