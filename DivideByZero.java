//package FinalQuarter;
import java.util.*;
import java.io.*;
public class DivideByZero 
{
    public static void main(String[] args) throws IOException
    {
        Scanner bob = new Scanner(System.in);
        int testCases = bob.nextInt();
        for(int i = 0; i < testCases; i++)
        {
            Checks checker = new Checks();
            String s1 = bob.next();
            String s2 = bob.next();
            boolean n1check = checker.checkNumbers(s1);
            boolean n2check = checker.checkNumbers(s2);
            if(n1check == false)
            {
                System.out.println("Invalid Dividend");
                continue;
            }
            else if(n2check == false)
            {
                System.out.println("Invalid Divisor");
                continue;
            }
            checker.setToDouble(s1, s2);
            if(checker.input2 == 0)
            {
                System.out.println("Divide By Zero");
                continue;
            }
            double result = checker.dividing();
            System.out.printf("%.1f\n", result);
        }
    }
    
    static class Checks
    {
        double input1;
        double input2;
        
        public boolean checkNumbers(String s1)
        {
            if (s1 == null) 
            {
                return false;
            }
            try 
            {
                double d = Double.parseDouble(s1);
            } catch (NumberFormatException nfe) {
                return false;
            }
            return true;
        }
        
        public void setToDouble(String s1, String s2)
        {
            input1 = Double.parseDouble(s1);
            input2 = Double.parseDouble(s2);
        }
        
        public double dividing()
        {
            double ans = input1/input2;
            if(Math.abs(ans) < 0.05)
            {
                ans = Math.abs(ans);
            }
            return ans;
        }
    }
}

/*

test input:

4
5 2
Five 2.0
5 Two
5.0 0

*/