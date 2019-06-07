package Sample;
import java.util.Scanner;
// A-Z Y-B D-W V-E M-N
public class AlphabetReversePrint {
	public static void main(String [] args){
		Scanner d=new Scanner(System.in);
		System.out.print("Enter an Alphabet : ");
		String str ="abcdefghijklmnopqrstuvwxyz";
		char  c = d.next().charAt(0);
		if(Character.isUpperCase(c)) {
			str=str.toUpperCase();
		}
		System.out.println(str.charAt(25-str.indexOf(c)));
		d.close();
}
}
