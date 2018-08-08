package YiJi;

import java.util.Scanner;

public class no1034 {
	public static void main(String[] args)
	  {
	    Scanner in=new Scanner(System.in);
	    String[] a=in.next().split("/");
	    String[] b=in.next().split("/");
	    in.close();
	    int[] a1= {Integer.parseInt(a[0]),Integer.parseInt(a[1])};
	    int[] b1= {Integer.parseInt(b[0]),Integer.parseInt(b[1])};
	    add(a1, b1);
        sub(a1, b1);
        mul(a1, b1);
        div(a1, b1);       
	  }
	static void add(int[] a,int[] b)
	{
		int[] res=new int[2];
		res[0]=(a[0]*b[1]+a[1]*b[0]);
		res[1]=a[1]*b[1];
		if(res[1]<0)
		{
			res[0]=-res[0];
			res[1]=-res[1];
		}
		System.out.println(normalize(a)+" + "+normalize(b)+" = "+normalize(res));
	}
	static void sub(int[] a,int[] b)
	{
		int[] res=new int[2];
		res[0]=(a[0]*b[1]-a[1]*b[0]);
		res[1]=a[1]*b[1];
		if(res[1]<0)
		{
			res[0]=-res[0];
			res[1]=-res[1];
		}
		System.out.println(normalize(a)+" - "+normalize(b)+" = "+normalize(res));
	}
	static void mul(int[] a,int[] b)
	{
		int[] res=new int[2];
		res[0]=a[0]*b[0];
		res[1]=a[1]*b[1];
		if(res[1]<0)
		{
			res[0]=-res[0];
			res[1]=-res[1];
		}
		System.out.println(normalize(a)+" * "+normalize(b)+" = "+normalize(res));
	}
	static void div(int[] a,int[] b)
	{
		int[] res=new int[2];
		res[0]=a[0]*b[1];
		res[1]=a[1]*b[0];
		if(res[1]<0)
		{
			res[0]=-res[0];
			res[1]=-res[1];
		}
		System.out.println(normalize(a)+" / "+normalize(b)+" = "+normalize(res));
	}
	static String normalize(int[] number)
	{
		int a=number[0];
		int b=number[1];
		if(b==0)
			return "Inf";	
		if(a==0)
				return "0";
		else if(a>0)
			   {
					if(a%b==0)
					return (a/b)+"";
					else if(a/b!=0)
				    return (a/b)+" "+simplify(a%b,b);
					else 
                    return simplify(a%b,b);
				}
			else 
			{
				if(a%b==0)
					return "("+(a/b)+")";
				else if(a/b!=0)
					return "("+(a/b)+" "+simplify(-a%b, b)+")";
				else 
					return "(-"+simplify(-a%b, b)+")";		
					
			}
		
	}
	static String simplify(int a,int b)
	{
		int k=0;
		int A=a;
		int B=b;
		do {
			k=A%B;
			A=B;
			B=k;
		}while(k!=0);
		return (a/A)+"/"+(b/A);
			
	}
}
