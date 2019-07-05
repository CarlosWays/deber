import java.util.Scanner;

public class Ejecutable{
	public static void main (String []args){
	int num;

	Scanner lee= new Scanner(System.in);
	System.out.println("Ingrese el numero: ");
	num=lee.nextInt();
	Multidos obj= new Multidos(num);
	obj.Multiplo();
	}
}