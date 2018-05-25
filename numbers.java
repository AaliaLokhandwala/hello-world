import java.util.Scanner;

class aalia
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,j,d=0,count=0,max=2,k=0;
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {count=0;
 
            for(j=0;j<n;j++)
            {
                d=a[i]-a[j];
                if(d==0 || d==1)
                {
                    count++;
                }
                
            }
         if(count>=max)
                    max=count;
            
        }
        System.out.println(max);
        
    }
}