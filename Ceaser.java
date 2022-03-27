package C;

import java.util.Scanner;
public class Ceaser
{
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
 
    public static String encrypt(String plainText, int shiftKey)
    {
        plainText = plainText.toLowerCase();
        String cipherText = "";
        for (int i = 0; i < plainText.length(); i++)
        {
            int charPosition = ALPHABET.indexOf(plainText.charAt(i));
            int keyVal = (shiftKey + charPosition) % 26;
            char replaceVal = ALPHABET.charAt(keyVal);
            cipherText += replaceVal;
        }
        return cipherText;
    }
 
    public static String decrypt(String cipherText, int shiftKey)
    {
        cipherText = cipherText.toLowerCase();
        String plainText = "";
        for (int i = 0; i < cipherText.length(); i++)
        {
            int charPosition = ALPHABET.indexOf(cipherText.charAt(i));
            int keyVal = (charPosition - shiftKey) % 26;
            if (keyVal < 0)
            {
                keyVal = ALPHABET.length() + keyVal;
            }
            char replaceVal = ALPHABET.charAt(keyVal);
            plainText += replaceVal;
        }
        return plainText;
    }
 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Which operation you want to perform:Press 1 for Encryption and 2 for Decryption");
        n=sc.nextInt();
        if(n==1)
        {
        	System.out.println("Enter your string: ");
            String message = new String();
            message = sc.next();
        System.out.println("Your Encrypted text is:");
        System.out.println(encrypt(message, 3));
        }
        else if(n==2)
        {
        	System.out.println("Enter your string: ");
            String message = new String();
            message = sc.next();
        System.out.println("Your Decrypted text is:");
        System.out.println(decrypt(message, 3));
        }
        else 
        {
        	System.out.println("Incorrect Choice.");
        }
    }
}