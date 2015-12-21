package edu.han;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s0 = "";
		String s1 = "0";
		String s2 = "001";
		String s3 = "0010011";
		String s4 = "001001100011011";
		
		ModifyNumber modify1 = new ModifyNumber(s1);
		ModifyNumber modify2 = new ModifyNumber(s2);
		ModifyNumber modify3 = new ModifyNumber(s3);
		ModifyNumber modify4 = new ModifyNumber(s4);
		
		
		System.out.println("give me a number");
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    Algorithm alg = new Algorithm();
	    String finalnumber = alg.pastnumber(n);
	    System.out.println(finalnumber);
	    
	    while(!false){
	    System.out.println("At which character do you want?");
	    int num = sc.nextInt();
	    System.out.println(finalnumber.charAt(num-1));
	    System.out.println(finalnumber);
	    }
	}

}
