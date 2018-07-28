package YiJi;


import java.util.Scanner;
import java.util.TreeSet;

public class deCai1015 {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int L=in.nextInt();
		int H=in.nextInt();
		in.nextLine();
		TreeSet<stu> class1=new TreeSet<stu>();
		TreeSet<stu> class2=new TreeSet<stu>();
		TreeSet<stu> class3=new TreeSet<stu>();
		TreeSet<stu> class4=new TreeSet<stu>();
	    for(int i=0;i<N;i++)
	    {
	       String[] temp=in.nextLine().split(" ");
	    	stu student=new stu(Integer.parseInt(temp[0]),Integer.parseInt(temp[1]),Integer.parseInt(temp[2]));
	    	if(student.moral>=L&&student.talent>=L)
	    	{
	    		if(student.moral>=H&&student.talent>=H)
	    		class1.add(student);
	    		else if(student.moral>=H)
	    		class2.add(student);
	    		else if(student.moral>=student.talent)
	        	class3.add(student);
	        	else
	        	class4.add(student);
	    	} 		 
	   }
	    System.out.println(class1.size()+class2.size()+class3.size()+class4.size());
	    print(class1);
	    print(class2);
	    print(class3);
	    print(class4);
	    in.close();
	 }
	public static void print(TreeSet<stu> set)
	{
		for(stu s:set)
			System.out.println(s.id+" "+s.moral+" "+s.talent);
	}
	     static class stu implements Comparable<stu>{
	        int id;
	        int moral;
	        int talent;
	        public stu(int id,int moral,int talent) {
				this.id=id;
				this.moral=moral;
				this.talent=talent;
			}
			@Override
			public int compareTo(stu o) {
				if(this.moral+this.talent!=o.moral+o.talent)
					return o.moral+o.talent-this.moral-this.talent;
				if(this.moral!=o.moral)
					return o.moral-this.moral;
				else
					return this.id-o.id;
			}
	    }
}
