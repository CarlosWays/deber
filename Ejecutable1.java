import java.util.Scanner;

public class Ejecutable1{
	public static void main (String []args){
	int num;

	Scanner lee= new Scanner(System.in);
	System.out.println("Ingrese su edad: ");
	num=lee.nextInt();
	Edad obj= new Edad(num);
	obj.Mayoredad();
	}
}