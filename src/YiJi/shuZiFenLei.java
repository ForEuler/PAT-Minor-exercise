package YiJi;
import java.util.Scanner;

public class shuZiFenLei{
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
    int num=in.nextInt();//
    int[] a=new int[num];
    int[] b=new int[5];
    int[] sum=new int[5];
    for(int i=0;i<b.length;i++)
    { b[i]=0; sum[i]=0;}
    for(int i=0;i<a.length;i++)
    {
    	a[i]=0;//初始化
        a[i]=in.nextInt();
        switch(a[i]%5)
        {
            case 0:{if(a[i]%2==0) b[0]+=a[i]; sum[0]++;break;}
            case 1:{b[1]+=a[i]*Math.pow(-1,sum[1]); sum[1]++;break;}
            case 2:{b[2]++; sum[2]++ ;break;}
            case 3:{b[3]+=a[i]; sum[3]++;break;}
            case 4:{if(a[i]>b[4]) b[4]=a[i]; sum[4]++;break;}
            default:break;
        }
    }
    float b3=(float)b[3]/sum[3];
     String string=String.format("%.1f", b3);
     StringBuffer sBuffer=new StringBuffer();
     for (int i = 0; i < b.length; i++) {
         if (b[i]==0) {
             sBuffer.append("N ");
         }else {
             if (i==3) {
                 sBuffer.append(string+" ");
             }else {
                 sBuffer.append(b[i]+" ");
             }
         }
      
     }
     System.out.println(sBuffer.toString().trim());
       in.close();
  }
}