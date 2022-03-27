package C;
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class OneTimePad{
	public static String stringEncryption(String text,
										String key)
	{
		String cipherText = "";
		int cipher[] = new int[key.length()];
		
		for (int i = 0; i < key.length(); i++)
		{
			cipher[i] = text.charAt(i) - 'A' + key.charAt(i)
						- 'A';
		}

		for (int i = 0; i < key.length(); i++)
		{
			if (cipher[i] > 25)
			{
				cipher[i] = cipher[i] - 26;
			}
		}
		for (int i = 0; i < key.length(); i++)
		{
			int x = cipher[i] + 'A';
			cipherText += (char)x;
		}
		return cipherText;
	}
	
	public static String stringDecryption(String s,String key)
	{
		String plainText = "";

		int plain[] = new int[key.length()];

		for (int i = 0; i < key.length(); i++)
		{
			plain[i]= s.charAt(i) - 'A' - (key.charAt(i) - 'A');
		}
		for (int i = 0; i < key.length(); i++)
		{
			if (plain[i] < 0)
			{
				plain[i] = plain[i] + 26;
			}
		}
		for (int i = 0; i < key.length(); i++)
		{
			int x = plain[i] + 'A';
			plainText += (char)x;
		}

		return plainText;
	}

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);
		int n;
        System.out.println("Which operation you want to perform:Press 1 for Encryption and 2 for Decryption");
        n=input.nextInt();
        if(n==1)
        {
		String plainText;
		System.out.println("Enter your string:");
		plainText=input.next();
		String key;
		System.out.println("Enter Key:");
		key=input.next();
		String encryptedText =
			stringEncryption(plainText.toUpperCase(), key.toUpperCase());
		System.out.println("Encrypted Text is:\n"+ encryptedText);
        }
        else if(n==2)
        {
        	String plainText;
    		System.out.println("Enter your string:");
    		plainText=input.next();
    		String key;
    		System.out.println("Enter Key:");
    		key=input.next();
		System.out.println("Decrypted Text is:\n"+ stringDecryption(plainText,key.toUpperCase()));
        }
        else 
        {
        	System.out.println("Incorrect Choice.");
        }
	}
}
