package YiJi;

import java.util.Scanner;

public class no1037 {
	 public static void main(String[] args) 
	 {
		 Scanner in=new Scanner(System.in);
		 String[] ought=in.next().split("\\.");
		 String[] actual=in.next().split("\\.");
		 in.close();
		 int sum1=Integer.parseInt(ought[0])*17*29+Integer.parseInt(ought[1])*29+Integer.parseInt(ought[2]);
		 int sum2=Integer.parseInt(actual[0])*17*29+Integer.parseInt(actual[1])*29+Integer.parseInt(actual[2]);
		 int sub=sum2-sum1;
		 String[] res=new String[3];
		 if(sub<0)
		 {
			 sub=-sub;
		 res[0]="-"+sub/(17*29)+"";
		 res[1]=(sub%(17*29))/29+"";
		 res[2]=sub%29+"";
		 }
		 else
		 {
		 res[0]=sub/(17*29)+"";
		 res[1]=(sub%(17*29))/29+"";
		 res[2]=sub%29+"";
		 }
	    System.out.print(res[0]+"."+res[1]+"."+res[2]);	 
		 
	 }
}
