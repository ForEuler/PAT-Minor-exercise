package YiJi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class no1025 {
	String[] node=new String[3];
    no1025() {
	}
	no1025(String[] a)
	{
		node=a;
	}
	void print()
	{
		System.out.println(node[0]+" "+node[1]+" "+node[2]);
	}
	static no1025 curNode(no1025[] nodes,String address)
	{
		int length=nodes.length;
		for(int i=0;i<length;i++)
		{
			if(nodes[i].node[0].equals(address))
				return nodes[i];
		}
		return null;
	}
	public static void main(String[] args) throws IOException 
	  {
		  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		  String[] start=in.readLine().split(" ");
		  String curAddress=start[0];
		  int N=Integer.parseInt(start[1]);
		  int K=Integer.parseInt(start[2]);
		  no1025[] nodes=new no1025[N];
		  for(int i=0;i<N;i++)
          nodes[i]=new no1025(in.readLine().split(" "));
		  Stack<no1025> child = new Stack<no1025>();
		  for(int i=0;i<N/K;i++)
		  {
			  for(int j=0;j<K;j++)
			  {
				  child.push(curNode(nodes,curAddress));
				  curAddress=child.peek().node[2];
			  }	
			  for(int j=0;j<K;j++)
			  {
				  child.pop().print();
			  }			  
		  }
		  for(int i=0;i<N%K;i++)
			  nodes[i].print();
	  }

}
