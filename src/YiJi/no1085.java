package YiJi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class no1085 {
	public static void main(String[] args)throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(in.readLine());
		HashMap<String, college> map=new HashMap<String,college>();
		for(int i=0;i<N;i++ )
		{
			String[] temp=in.readLine().split(" ");
			char c=temp[0].charAt(0);
			int s=Integer.parseInt(temp[1]);
			String school=temp[2].toLowerCase();
			if(map.containsKey(school)==false)
			{
				college sc=new college();
				sc.name=school;
				sc.numOfstu++;
			   switch (c) {
			   case 'A':
				 sc.A=s;
				 break;
			   case 'B':
					 sc.B=s;
					 break;
			   case 'T':
					 sc.T=s;
					 break;
			   default:
				break;
			    }
			   map.put(school, sc);
			}
			else
			{
				 college sc=map.get(school);
				 sc.numOfstu++;
				   switch (c) {
				   case 'A':
					 sc.A+=s;
					 break;
				   case 'B':
						 sc.B+=s;
						 break;
				   case 'T':
						 sc.T+=s;
						 break;
				   default:
					break;
				    }
				   map.put(school, sc);
			}
		}
		in.close();
		ArrayList<college> colls=new ArrayList<college>();
	    for(String c:map.keySet())
	   {
		   college co=map.get(c);
           colls.add(co);   
	   }
	    Collections.sort(colls);
		int lastcount=-1;
		int no=0;
		int cur=0;
		for(college c:colls)
		{
			no++;
			c.score=(int)(c.B/1.5+c.A+c.T*1.5);
			if(c.score!=lastcount)
				{
				System.out.print(no+" ");
				cur=no;
				lastcount=c.score;
				c.print();
				}
			else
			  {
				System.out.print(cur+" ");
				lastcount=c.score;
				c.print();
				}
		}
		
	}
}


class college implements Comparable<college>
{
	String name;
	float B;
	float A;
	float T;
	int score=0;
	int numOfstu=0;
	public college() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(college o) {
		int G1=(int)(B/1.5+A+T*1.5);
		int G2=(int)(o.B/1.5+o.A+o.T*1.5);
		if(G1>G2)
			return -1;
		else if(G1<G2)
			return 1;
		else if(numOfstu<o.numOfstu)
			return -1;
		else if(numOfstu>o.numOfstu)
			return 1;
		else 
            return name.compareTo(o.name);
	}
	void print()
	{
		score=(int)(B/1.5+A+T*1.5);
		System.out.println(name+" "+score+" "+numOfstu);
	}
}
