package YiJi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class no1065 {
		public static void main(String[] args) throws IOException
		{
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			int N=Integer.parseInt(in.readLine());
			HashMap<String, String> couple=new HashMap<String,String>();
			for(int i=0;i<N;i++)
			{
				String[] temp=in.readLine().split(" ");
				couple.put(temp[0], temp[1]);
				couple.put(temp[1], temp[0]);				
			}
			int M=Integer.parseInt(in.readLine());
			String[] people=in.readLine().split(" ");
			ArrayList<String> list=new ArrayList<String>();
			ArrayList<String> res=new ArrayList<String>();
			for(int i=0;i<M;i++)
			{
				if(couple.containsKey(people[i]))
					list.add(couple.get(people[i]));
			}
			for(int i=0;i<M;i++)
			{
				if(list.contains(people[i])==false)
					res.add(people[i]);
			}
			int length=res.size();
			Collections.sort(res);
			System.out.println(length);
			for(int i=0;i<length-1;i++)
			System.out.print(res.get(i)+" ");
			System.out.print(res.get(length-1));
		}
}
