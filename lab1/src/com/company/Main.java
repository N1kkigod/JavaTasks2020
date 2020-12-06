package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try
        {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            for(int i = a; i <= b; ++i)
            {
                for(int j = 2; j <= i; ++j)
                {
                    if(i % j == 0 && i != j)
                    {
                        break;
                    }
                    else if(j == i)
                    {
                        System.out.println(i);
                    }
                }
            }
        }
        catch(NumberFormatException e)
        {
            System.out.println("Error: " + e + ".");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: " + e + ".");
        }
    }
}
