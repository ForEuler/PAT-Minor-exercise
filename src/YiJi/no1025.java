package YiJi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;





public class no1025 {
 public static void main(String[] args) throws IOException 
	  {
		  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		  String[] start=in.readLine().split(" ");
		  String curAddress=start[0];//当前的地址
		  String nextAddress=null;//下一个地址
		  int flag=0;//记录是否存在需要反序
		  int N=Integer.parseInt(start[1]);
		  int K=Integer.parseInt(start[2]);
		  node[] nodes= new node[N];
		  for(int i=0;i<N;i++)//读入所有的节点
		  {
			 String[] temp=in.readLine().split(" ");
	          nodes[i]=new node(temp[0],temp[1],temp[2]);
		  }
		  Stack<node> childnodes = new Stack<node>();//建立一个node栈，用于存储需要反序的子序列
		  for(int i=0;i<N/K;i++)
		  {
			  flag=1;
			  for(int j=0;j<K;j++)//将K个节点依次压栈
			  { 
				  node temp=curNode(nodes, curAddress);//根据当前地址找到当前节点，加入栈中
				  curAddress=temp.next;//更改当前地址
				  childnodes.push(temp);
				  if(j==K-1)//如果到了本轮最后一个节点,要记录下下一轮新开始的节点的地址
					  nextAddress= childnodes.peek().next;
				  
			  }
			  for(int j=0;j<K;j++)//将K个节点依次弹出栈
			  {
				  node temp=childnodes.pop();
				  if(i!=0||j!=0)
				  System.out.println(temp.address);
				  temp.print();
				  if((N%K==0)&&(j==K-1)&&(i==N/K-1))//如果此节点为所有节点最后一个
				  System.out.print("-1");
	                 
			  }
		  }
			 if(N%K!=0)//不需要反序的序列直接输出
			  {
				 curAddress=nextAddress;
			   for(int i=0;i<N%K;i++)
			  {		  
				  node temp=curNode(nodes, curAddress);
				  curAddress=temp.next; 
				  if(flag!=0||i!=0)
				  System.out.println(temp.address);
				  temp.print();
			  }
		  }
				  
}
	
 static node curNode(node[] nodes,String address)
	{
		int length=nodes.length;
		for(int i=0;i<length;i++)
		{
			if(nodes[i].address.equals(address))
				return nodes[i];
		}
		return null;
	}
}

class node
{
	String address;
	String data;
	String next;
	public node(String address, String data, String next) {
		super();
		this.address = address;
		this.data = data;
		this.next = next;
	}
	public node() {}
	public void print()
	{
		System.out.print(address+" "+data+" ");
	}
}
