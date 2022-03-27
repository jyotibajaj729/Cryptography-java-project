package C;
import java.io.*;
import java.util.Scanner;
class Mono {
	public static char normalChar[]
		= { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
			'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
			's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	public static char codedChar[]
		= { 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O',
			'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K',
			'L', 'Z', 'X', 'C', 'V', 'B', 'N', 'M' };

	public static String stringEncryption(String s)
	{
		String encryptedString = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < 26; j++) {
				if (s.charAt(i) == normalChar[j])
				{
					encryptedString += codedChar[j];
					break;
				}
				if (s.charAt(i) < 'a' || s.charAt(i) > 'z')
				{
					encryptedString += s.charAt(i);
					break;
				}
			}
		}

		return encryptedString;
	}

	public static String stringDecryption(String s)
	{

		String decryptedString = "";

		for (int i = 0; i < s.length(); i++)
		{
			for (int j = 0; j < 26; j++) {

				if (s.charAt(i) == codedChar[j])
				{
					decryptedString += normalChar[j];
					break;
				}
				if (s.charAt(i) < 'A' || s.charAt(i) > 'Z')
				{
					decryptedString += s.charAt(i);
					break;
				}
			}
		}

		return decryptedString;
	}
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int n;
        System.out.println("Which operation you want to perform:Press 1 for Encryption and 2 for Decryption");
        n=input.nextInt();
		if(n==1)
		{
			String str;
			System.out.println("Enter your string:");
	        str=input.next();
		String encryptedString = stringEncryption(str.toLowerCase());
		System.out.println("Encrypted message:\n"+ encryptedString);
		}
		else if(n==2)
		{
			String str;
			System.out.println("Enter your string:");
	        str=input.next();
		System.out.println("Decrypted message:\n"+ stringDecryption(str));
		}
		else 
        {
        	System.out.println("Incorrect Choice.");
        }
	}
}
