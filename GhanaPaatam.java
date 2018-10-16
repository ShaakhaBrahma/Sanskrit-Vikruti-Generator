package veda_chants;

import java.util.Scanner;
import java.util.StringTokenizer;

public class GhanaPaatam {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("welcome to ghana genarator");
		System.out.println("enter your sentence");
		String src = in.nextLine();
		src = src.trim();
		String s[] =  src.split(" ");
		for(int i=0;i<s.length;i++)
			System.out.println(s[i]);
		int lineLen=(s.length-2);
		String dest="";
		for(int i = 0;i<lineLen;i++)
		{
			dest+=s[i]+" "+s[i+1]+","+s[i+1]+" "+s[i]+","+s[i]+" "+s[i+1]+" "+s[i+2]+","+s[i+2]+" "+s[i+1]+" "+s[i]+","+s[i]+" "+s[i+1]+" "+s[i+2]+"\n";
		}
		System.out.println(dest);
			

	}

}
