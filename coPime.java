// Euler’s Totient Function
// find the count of the numbers from 1 to n that are coprime to n
//The two integers are said to be coprime to each other when their greatest common divisor is 1.

// https://www.geeksforgeeks.org/eulers-totient-function/
// https://www.geeksforgeeks.org/check-two-numbers-co-prime-not/

import java.util.*;

public class coprime {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = coprimeNumbers(n);

        System.out.println(result);
        sc.close();
    }

    // Solution
    static int coprimeNumbers(int n) {
        int count = 0;
        // if(n==1) return 1;
         for(int i=1;i<=n;i++)
        {
            if(checkCoprime(n,i))
            count++;
        }
        return count;
    }
    static boolean checkCoprime(int a, int b){
        if(_gcd(a,b) == 1) return true;
        else return false;
    }
    static int _gcd(int a , int b){
        if(a == 0 || b == 0) return 0;
        else if(a == b) return a;
        else{
            if(a > b) return _gcd(a-b,b);
            else return _gcd(a,b-a);
        }
    }
    
}
