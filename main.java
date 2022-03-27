package C;
import java.util.Scanner;
import java.lang.*;
public class main {

	public static void main(String args[])
	{
		// TODO Auto-generated method stub
		user u1=new user();
		u1.login();
		System.out.println("************************************");
		System.out.println("*                                  *");
		System.out.println("*Welcome to Cryptography Techniques*");
		System.out.println("*                                  *");
		System.out.println("************************************");
		while(true)
		{
		System.out.println("Choose which method you want to use for encryption and decryption of your text:");
		System.out.println("1.Caeser Cipher");
		System.out.println("2.MonoAlphabetic Cipher:");
		System.out.println("3.Playfair Cipher");
		System.out.println("4.Hill Cipher");
		System.out.println("5.Railfence Cipher");
		System.out.println("6.One Time Pad Cipher");
		System.out.println("7.Exit");
		System.out.println("Enter Your Choice:");
		Scanner input = new Scanner(System.in);
		int n;
		n=input.nextInt();
		switch(n)
		{
		case 1:
			Ceaser c1=new Ceaser();
			c1.main(args);
			break;
		case 2:
			Mono m1=new Mono();
			m1.main(args);
			break;
		case 3:
			Playfair p1=new Playfair();
			p1.main(args);
			break;
		case 4:
			Hill h1=new Hill();
			h1.main(args);
			break;
		case 5:
			Rail r1=new Rail();
			r1.main(args);
			break;
		case 6:
			OneTimePad o1= new OneTimePad();
			o1.main(args);
			break;
		case 7:
		default:System.out.println("Incorrect Choice.");
			System.exit(0);
		}
	}
}
}