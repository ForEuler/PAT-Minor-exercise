package YiJi;

import java.util.Scanner;
import java.util.HashMap;


public class pinyin1002 {
		  public static void main(String[] args)
		  {
		    Scanner in=new Scanner(System.in);
		    String str=in.next();
		    int sum=0;
			for (int i=0;i<str.length();i++) {             
				Character c=str.charAt(i);
				int num=Integer.parseInt(c.toString());	
				sum+=num;
	                }
			HashMap<Integer, String> spellTable=new HashMap<Integer, String>();
			spellTable.put(0, "ling");
			spellTable.put(1, "yi");
			spellTable.put(2, "er");
			spellTable.put(3, "san");
			spellTable.put(4, "si");
			spellTable.put(5, "wu");
			spellTable.put(6, "liu");
			spellTable.put(7, "qi");
			spellTable.put(8, "ba");
			spellTable.put(9, "jiu");
			String result=Integer.toString(sum);
			for(int i=0;i<result.length();i++)
			{
				Character c=result.charAt(i);
				int num=Integer.parseInt(c.toString());	
				if(i!=result.length()-1)
				System.out.print(spellTable.get(num)+" ");
				else
			   System.out.print(spellTable.get(num));
			}

			   in.close();
		  }

		}
