package YiJi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class no1052 {
	public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> hands=prase(in.readLine());
        ArrayList<String> eyes=prase(in.readLine());
        ArrayList<String> mouth=prase(in.readLine());
        int K=Integer.parseInt(in.readLine());
        int handlength=hands.size();
        int eyelength=eyes.size();
        int mouthlength=mouth.size();
        String res;
        String[] rows=new String[K];
        for(int i=0;i<K;i++)
        	 {
        	 rows[i] = in.readLine();
        	 }
        for(int i=0;i<K;i++)
        {
        	res="";
        	String[] temp=rows[i].split(" ");
        	int num=Integer.parseInt(temp[0]);
        	if(num<0||num>=handlength)
        	{System.out.println("Are you kidding me? @\\/@");break;}   	
        	res+=hands.get(num);
        	
        	res+="（";
        	
        	num=Integer.parseInt(temp[1]);
        	if(num<0||num>=eyelength)
        	{System.out.println("Are you kidding me? @\\/@");break;}   
        	res+=eyes.get(num);
        	
        	num=Integer.parseInt(temp[2]);
        	if(num<0||num>=mouthlength)
        	{System.out.println("Are you kidding me? @\\/@");break;}   
        	res+=mouth.get(num);
        	
        	num=Integer.parseInt(temp[3]);
        	if(num<0||num>=eyelength)
        	{System.out.println("Are you kidding me? @\\/@");break;} 
        	res+=eyes.get(num);
        	
        	res+="）";
        	
        	num=Integer.parseInt(temp[4]);
        	if(num<0||num>=handlength)
        	{System.out.println("Are you kidding me? @\\/@");break;} 
        	res+=hands.get(num);
        	
        	System.out.println(res);
        	 }
       in.close(); 
	}
	public static ArrayList<String> prase(String s)
	{
		if(s==""||s.isEmpty())
			return null;
		int length=s.length();
		boolean isStart=false;
		ArrayList<String> list=new ArrayList<String>();	
		String temp="";
		list.add("");
		for(int i=0;i<length;i++)
		{
			if(s.charAt(i)=='[')
				isStart=true;
			else if(s.charAt(i)==']')
			{
				list.add(temp);
				isStart=false;
				temp="";
			}
			else {
				if(isStart==true)
					temp+=s.charAt(i);
			}
		}
		return list;
	}
}
