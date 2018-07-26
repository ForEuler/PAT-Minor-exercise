package YiJi;
import java.util.Scanner;

public class ABC1011
{
    public static void main(String[] args){
    Scanner in =new Scanner(System.in);
    int size=in.nextInt();
        for(int i=1;i<size+1;i++)
        {
            long a = in.nextLong();
            long b = in.nextLong();
            long c = in.nextLong();  
            long sum = a+b; 
            System.out.println(sum);

            if(sum>c)      
               System.out.println("Case #"+i+": true");
            else       
            System.out.println("Case #"+i+": false");   
         }
         in.close();
     }
}

