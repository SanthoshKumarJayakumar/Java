package Milestone;
import java.io.*;
import  java.util.*;
public class nthFibonacci {
	public long nthFibonacci(int input1){
		int n1=0,n2=1,n3=0,i;    
 		System.out.print(n1+" "+n2);//printing 0 and 1    
 		for(i=2;i<input1;++i){
  		n3=n1+n2;    
  		n1=n2;    
  		n2=n3;    
		}
 		return n3;
	}

}
