package C;
import java.util.*;
public class Rail{
	int numRails;
	public Rail() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter key for encryption:");
		int n;
		n=input.nextInt();
		numRails=n;
	}
	String getDecryptedData(String data) {
		char[] decrypted = new char[data.length()];
		int n = 0;
		for(int k = 0 ; k < numRails; k ++) {
			int index = k;
			boolean down = true;
			while(index < data.length() ) {
				//System.out.println(k + " " + index+ " "+ n );
				decrypted[index] = data.charAt(n++);
				
				if(k == 0 || k == numRails - 1) {
					index = index + 2 * (numRails - 1);
				}
				else if(down) {
					index = index +  2 * (numRails - k - 1);
					down = !down;
				}
				else {
					index = index + 2 * k;
					down = !down;
				}
			}
		}
		return new String(decrypted);
	}
	String getEncryptedData(String data) {
		char[] encrypted = new char[data.length()];
		int n = 0;
		
		
		for(int k = 0 ; k < numRails; k ++) {
			int index = k;
			boolean down = true;
			while(index < data.length() ) {
				//System.out.println(k + " " + index+ " "+ n );
				encrypted[n++] = data.charAt(index);
				
				if(k == 0 || k == numRails - 1) {
					index = index + 2 * (numRails - 1);
				}
				else if(down) {
					index = index +  2 * (numRails - k - 1);
					down = !down;
				}
				else {
					index = index + 2 * k;
					down = !down;
				}
			}
		}
		return new String(encrypted);
	}
	String getEncryptedData2(String data) {
		int len = data.length();
		StringBuffer[] sb = new StringBuffer[numRails];
		for (int i = 0; i < numRails; i++) {
			sb[i] = new StringBuffer();
		}
		int index = 0;
		int direction = 1;
		for (int i = 0; i < data.length(); i++) {
			sb[index].append(data.charAt(i));
			index = index + direction;
			if (index == 0) {
				direction = 1;
			} else if (index == numRails) {
				if(index == 2) {
					index = 0;
				}else {
					direction = -1;
					index = numRails -2;					
				}
			}
		}
		for (int i = 1; i < numRails; i++) {
			sb[0].append(sb[i].toString());
		}
		return sb[0].toString();
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
        System.out.println("Which operation you want to perform:Press 1 for Encryption and 2 for Decryption");
        n=input.nextInt();
        if(n==1)
        {
		String data;
		System.out.println("Enter string to encrypt:");
		data=input.next();
		Rail railFenceCipher=new Rail();
		String encrypted =railFenceCipher.getEncryptedData(data);
		System.out.println("Encrypted text is:\n"+encrypted);
        }
        else if(n==2)
        {
        	String data;
    		System.out.println("Enter string to encrypt:");
    		data=input.next();
    		Rail railFenceCipher=new Rail();
		String decrypted = railFenceCipher.getDecryptedData(data);
		System.out.println("Decrypted text is:\n"+decrypted);
        }
        else 
        {
        	System.out.println("Incorrect Choice.");
        }
	}
}
