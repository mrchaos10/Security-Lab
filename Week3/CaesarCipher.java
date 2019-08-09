import java.io.*;
import java.lang.*;
import java.util.*;

//A Java Program to illustrate Caesar Cipher Technique 
public class CaesarCipher 
{ 
    // Encrypts text using a shift od s 
    public static StringBuffer encrypt(String text, int s) 
    { 
        StringBuffer result= new StringBuffer(); 
  
        for (int i=0; i<text.length(); i++) 
        { 
            if (Character.isUpperCase(text.charAt(i))) 
            { 
                char ch = (char)(((int)text.charAt(i) + 
                                  s - 65) % 26 + 65); 
                result.append(ch); 
            } 
            else
            { 
                char ch = (char)(((int)text.charAt(i) + 
                                  s - 97) % 26 + 97); 
                result.append(ch); 
            } 
        } 
        return result; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
	    Scanner sc =new Scanner(System.in);
		System.out.println("Enter the secret text to be encrypted");
        String text = sc.next(); 
        
		System.out.println("Enter the number of shifts for encryption");
        int s = sc.nextInt(); 
        
		System.out.println("Plain Text  : " + text); 
        System.out.println("Shifts : " + s); 
        System.out.println("Ciphered Text : " + encrypt(text, s)); 
    } 
} 