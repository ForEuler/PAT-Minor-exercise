package YiJi;

import java.util.Scanner;

public class no1038 {
	 public static void main(String[] args) 
	 {
		 Scanner in=new Scanner(System.in);
		 int N=in.nextInt();
		 in.nextLine();
		 String[] score=in.nextLine().split(" ");
		 int findnum=in.nextInt();
		 for(int i=0;i<findnum;i++)
		 { 
		    int count=0;
			String temp=in.next();
			for(int j=0;j<N;j++)
				if(score[j].equals(temp))
					count++;
			if(i!=findnum-1)
			 System.out.print(count+" ");
			else
				 System.out.print(count);
		 }
		 in.close();
		 
	 }
}
