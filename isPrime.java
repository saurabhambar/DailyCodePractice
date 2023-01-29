public class isPrime {

    public static void main(String[] args){
        System.out.println(isPrimeCheck(9));
        System.out.println(isPrimeCheckOptimized(10));
    }

    static boolean isPrimeCheck(int a){
        for(int i=2;i*i<=a;i++){
            if(a%i == 0) return false;
           
        }
        return true;
    }

    // Optimized Solution 

    static boolean isPrimeCheckOptimized(int n)
  {
    // since 2 and 3 are prime
    if (n == 2 || n == 3)
      return true;
  
    // if n<=1 or divided by 2 or 3 then it can not be prime
    if (n <= 1 || n % 2 == 0 || n % 3 == 0)
      return false;
  
    // To check through all numbers of the form 6k ± 1
    for (int i = 5; i * i <= n; i += 6) 
    {
      if (n % i == 0 || n % (i + 2) == 0)
        return false;
    }
  
    return true;
  }

    
}
