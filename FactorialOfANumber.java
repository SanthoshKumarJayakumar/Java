package Milestone;
import java.io.*;
import java.util.*;
public class FactorialOfANumber {
	public int nFactorial(int input1){
		int fact=1;
		if(input1>=1){
			for(int i=1;i<=input1;i++){    
			      fact=fact*i;    
			  } 
		}
		return fact;
		
	}
}
