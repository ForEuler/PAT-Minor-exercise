package YiJi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;


public class no1080 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String[] temp =in.readLine().split(" ");
		int n1=Integer.parseInt(temp[0]);
		int n2=Integer.parseInt(temp[1]);
		int n3=Integer.parseInt(temp[2]);
		HashMap<String, patstudent> map=new HashMap<String,patstudent>();
		for (int i=0;i<n1;i++)
		{
			String[] info=in.readLine().split(" ");
			if(map.containsKey(info[0])==false)
			{
				patstudent stu=new patstudent(info[0], Integer.parseInt(info[1]), -1, -1, -1);
			    map.put(info[0], stu);
			}
			else
			{
				patstudent stu=map.get(info[0]);
				stu.coding=Integer.parseInt(info[1]);
				map.put(info[0], stu);			
			}
				
		}
		for (int i=0;i<n2;i++)
		{
			String[] info=in.readLine().split(" ");
			if(map.containsKey(info[0])==false)
			{
				patstudent stu=new patstudent(info[0],-1,Integer.parseInt(info[1]), -1, -1);
			    map.put(info[0], stu);
			}
			else
			{
				patstudent stu=map.get(info[0]);
				stu.mid=Integer.parseInt(info[1]);
				map.put(info[0], stu);			
			}
		}
		for (int i=0;i<n3;i++)
		{
			String[] info=in.readLine().split(" ");
			if(map.containsKey(info[0])==false)
			{
				patstudent stu=new patstudent(info[0],-1,-1,Integer.parseInt(info[1]), -1);
			    map.put(info[0], stu);
			}
			else
			{
				patstudent stu=map.get(info[0]);
				stu.fin=Integer.parseInt(info[1]);
				map.put(info[0], stu);			
			}
		}
		in.close();
		ArrayList<patstudent> list=new ArrayList<patstudent>();
	    Iterator it = map.keySet().iterator();
	    while(it.hasNext()) {
	    	String key = (String)it.next();
	    	if(map.get(key).isPass()==true)
	    		list.add(map.get(key));	    		
	    }
	    Collections.sort(list);
	    for(patstudent s:list)
	    	s.print();
	}
			
}
 class patstudent implements Comparable<patstudent>
{
	String no;
	int coding=-1;
	int mid=-1;
	int fin=-1;
	int G;
	public patstudent(String no, int coding, int mid, int fin,int G) {
		super();
		this.no = no;
		this.coding = coding;
		this.mid = mid;
		this.fin = fin;
		this.G=G;
	}
	boolean isPass()
	{
		if (coding<200)
			return false;
		else
		{
			if (mid>fin)
				G=(int) (0.4*mid+0.6*fin+0.5);
			else
				G=fin;
			if(G>=60)
				return true;
			else
				return false;
		}
	}
	void print()
	{
		System.out.println(no+" "+coding+" "+mid+" "+fin+" "+G);
	}
	@Override
	public int compareTo(patstudent o) {
		if(G>o.G)
			return -1;
		else if(G<o.G)
			return 1;
		else 
			return no.compareTo(o.no);
	}

	
}