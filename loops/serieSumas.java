import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        
        int t=in.nextInt();
        
        int j, sum;
        
        for(int i=0;i<t;i++){
            
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            sum=a;
            
            for(j=0; j<n; j++)
            {
                sum+= (int)Math.pow(2, j) * b;
                System.out.printf("%d ", sum);
            }
            
            System.out.println(); //para limpiar el buffer
            
        }
        in.close();
    }
}
