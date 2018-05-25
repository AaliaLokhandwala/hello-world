import java.io.*;
import java.util.*;
public class aalia{
        public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[]=new int[m];
        int b[]=new int[n];
        int max=0,min,count1,count3=0,count2;
        for(int i=0;i<m;i++)
        {
                        a[i]=sc.nextInt();
                        if(a[i]>max)
                        max=a[i];
        }
        for(int i=0;i<n;i++)
        {
                        b[i]=sc.nextInt();
               
        }
                min=b[0];
        for(int i=0;i<n;i++)
        {
                         if(b[i]<min)
                          min=b[i];
        }
        for(int i=max;i<=min;i++)
        {       count1=0;
                count2=0;
               for(int j=0;j<m;j++)
               {
                       if(i%a[j]==0)
                       count1++;
               }
                       
                
                if(count1==m)
                {   
                        for( int j=0;j<n;j++)
                         {
                                if(b[j]%i==0)
                                count2++;
                         }
                }
                if(count2==n)
                {               
                                count3++;   
                }
        }
                System.out.println(count3);
}}