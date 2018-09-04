package YiJi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;


public class no1075 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String str[]=in.readLine().split(" ");
		String start=str[0];
		int N=Integer.parseInt(str[1]);
		int K=Integer.parseInt(str[2]);
		LinkedList<mynode> nodes=new LinkedList<mynode>();
		for (int i=0;i<N;i++)	
		{
		String temp[]=in.readLine().split(" ");
		mynode n=new mynode(temp[0], Integer.parseInt(temp[1]), temp[2]);
	    nodes.add(n);
		}
		in.close();
		mynode[] nodes1 = new mynode[N];
		int count1=0;
		mynode[] nodes2 = new mynode[N];
		int count2=0;
		mynode[] nodes3 = new mynode[N];
		int count3=0;
		for(int i=0;i<N;i++)
		{
			mynode temp=find(nodes,start);
			start=temp.nextAdd;
			if(temp.value<0)
				nodes1[count1++]=temp;
			else if(temp.value<=K)
				nodes2[count2++]=temp;
			else
				nodes3[count3++]=temp;
		}
		int flag=0;
		for(int i=0;i<count1;i++)
		{
			if(i==0)
				{
				 System.out.print(nodes1[i].add+" "+nodes1[i].value+" ");
				 flag=1;
				}
			else
			{
				if(flag==1)
					System.out.print(nodes1[i].add+"\n"+nodes1[i].add+" "+nodes1[i].value+" ");
			}
			
		}
		for(int i=0;i<count2;i++)
	    {
			if(i==0&&flag!=1)
			 {System.out.print(nodes2[i].add+" "+nodes2[i].value+" ");
					 flag=1; }
			else 
			System.out.print(nodes2[i].add+"\n"+nodes2[i].add+" "+nodes2[i].value+" ");			
		}
		for(int i=0;i<count3;i++)
	    {
			if(i==0&&flag!=1)
			 {System.out.print(nodes3[i].add+" "+nodes3[i].value+" ");
					 flag=1; }
			else 
			System.out.print(nodes3[i].add+"\n"+nodes3[i].add+" "+nodes3[i].value+" ");			
		}
		System.out.print("-1");
		
		
		
	}
	public static mynode find(LinkedList<mynode> nodes,String add)
	{
		int len=nodes.size();
		for (int i=0;i<len;i++)
		{
			if(nodes.get(i).add.equals(add))
				return nodes.get(i);
		}
		return null;
	}
}
class mynode 
{
	String add;
	int value;
	String nextAdd;
	public mynode(String add, int value, String nextAdd) {
		super();
		this.add = add;
		this.value = value;
		this.nextAdd = nextAdd;
	}	
}
