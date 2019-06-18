package Milestone;

import java.util.Scanner;

public class IsPalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		int input1=d.nextInt();
		if(input1>=0 && input1<=25000){
		String s=String.valueOf(input1);
		StringBuilder sb = new StringBuilder(s);   
		sb=sb.reverse();
		String s2=sb.toString();
		System.out.println(s2);
		if(s.equals(s2)){
			System.out.println("p");
		}
		else {
			System.out.println("no");
		}
		}
	}
}
