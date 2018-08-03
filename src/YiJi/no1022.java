package YiJi;

import java.util.Scanner;
import java.util.Stack;

public class no1022 {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int sum=in.nextInt()+in.nextInt();
		int token=in.nextInt();
		in.close();
        Stack<Integer> s=new Stack<Integer>();
        int q;
        int r;
        do
        {
        	q=sum/token;
        	r=sum%token;
        	s.add(r);
        	sum=q;
        }
        while(q!=0);
        while(s.isEmpty()==false)
        System.out.print(s.pop());
        	
	}
	
}
