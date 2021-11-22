package org.generation.italy.strings;

import java.util.Scanner;

public class VerificaPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		String word;
		String s="";
		int sum=0;
		
		System.out.print("Inserisci una parola: ");
		word=scan.nextLine();
		
		for(int i=word.length()-1 ;i>=0; i--) {
			char c=word.charAt(i);
			
			s+=c;
			sum++;
			
		}
		if(word.equals(s)) {
			System.out.println("La parola è palindrome, e ha "+sum+" lettere");
		}else {
			System.out.println("La parola non è palindrome, e ha "+sum+" lettere");
		}
		
		scan.close();
	}

}
