package YiJi;

import java.util.Scanner;
import java.util.TreeMap;



public class no1020 {
	public static void main(String[] args)
	{
		Scanner in= new Scanner(System.in);
	    int kinds=in.nextInt();
	    int need=in.nextInt();
	    float total=0;
	    int[] store=new int[kinds];
	    float[] price=new float[kinds];
	    for(int i=0;i<kinds;i++)
	    	store[i]=in.nextInt();
	    for(int i=0;i<kinds;i++)
	    	price[i]=in.nextInt()/(float)store[i];
	    TreeMap<Float, Integer> mooncake=new TreeMap<Float, Integer>();
	    for(int i=0;i<kinds;i++)
	    mooncake.put(price[i],store[i]);
	    while(need>0)
	    {
	    float unitprice=mooncake.lastKey();
	    int inventory=mooncake.get(unitprice);
	        	if(inventory>=need)
	        	inventory=need;
	        	need-=inventory;
	        	total+=inventory*unitprice;	 
	        mooncake.remove(unitprice);
	    }
	    in.close();
	    System.out.printf("%.2f",total);
	}
	   	    
}
