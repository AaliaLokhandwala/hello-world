import java.util.Scanner;

class aalia
{
        public static void main(String args[])
        {
                Scanner sc= new Scanner(System.in);
                int n=sc.nextInt();
                if(n>60)
                {
                        return;
                }
                int i,k=0,j;
                int a[]=new int[n];
                for(i=0;i<n;i++)
                {
                      a[i]=sc.nextInt(); 
                        if(a[i]>100)
                                return ;
                          
                }
                for(i=0;i<n;i++)
                {
                        
                        if(a[i]>=38)
                        {
                           
                                if(a[i]%5==0)
                                {
                                        k=a[i];
                                        
                                }
                                else{
                                         k=a[i];
                                        for(j=a[i];j<100;j++)
                                        {
                                            k++;
                                                if(k%5==0 && k-a[i]<3)
                                                {
                                                     break;   
                                                }
                                                if( k%5==0 && k-a[i]>=3)
                                                {
                                                        k=a[i];
                                                        break;
                                                }
                                                
                                                   
                                                
                                        }
                                        
                                }
                               
                        }
                        else
                        {
                                k=a[i];
                        }
                        System.out.println(k);
                }
                
        }
}