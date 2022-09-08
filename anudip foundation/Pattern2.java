class Pattern2  
{  
     public static void main(String[] args)  
    {  
        int i,j,k,n;
        for ( i= 0; i<=3-1 ; i++)  
        {  
          for ( j=0; j<i; j++)  
           {  
             System.out.print(" ");  
           }  
            for ( k=i; k<=3-1; k++)   
              {   
                System.out.print("*" + " ");   
               }   
            System.out.println("");   
        }   
       
      
       for ( i= 2-1; i>= 0; i--)  
         {  
            for ( j=0; j<i; j++)  
            {  
              System.out.print(" ");  
            }  
              for ( k=i; k<=3-1; k++)  
              {  
                 System.out.print("*" + " ");  
              }  
            System.out.println("");  
         }  
       
     }  
} 