/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    static void printFun(int test)
    {
        if (test < 1)
            return;
        else {
            System.out.print(test + " ");
            printFun(test - 1);
            System.out.print(test + " ");
            return;
        }
    }

    public static void main(String[] args)
    {
        // Calling function printFun()
        int test = 3;

        printFun(test);
    }
}