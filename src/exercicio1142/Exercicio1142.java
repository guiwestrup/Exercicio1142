
package exercicio1142;

import java.util.Scanner;

public class Exercicio1142 
{
    public static void main(String[] args) 
    {
        int n = 0;
        int pum = 0;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (int i = 0;i<n;i++)
        {
            System.out.println((pum+1)+" "+(pum+2)+" "+(pum+3)+" PUM");
            pum+=4;
        }
    }
    
}
