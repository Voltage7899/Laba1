package com.company;
import java.util.Scanner;
public class Factorial {
public static void main(String[] args)
{
    int a=0;
    Scanner b=new Scanner(System.in);
    System.out.println("Enter the number");
    if(b.hasNextInt()) {
        a = b.nextInt();

    }
    else
    {
        System.out.println("The wrong number");
    }
System.out.println(Factorial(a));

}
public static int Factorial(int c)
{
    int f=1;
    int i=1;
    while(i<=c)
    {
        f=f*i;
        i++;
    }

    return f;
}


}
