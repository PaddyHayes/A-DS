// Recursive factorial method

public class Factorial {
   
   // Recursive definition of method factorial
   public static int factorial( int n )
   {      
      if ( n == 1 || n == 0 )  // base case
         return 1;
      else {
         int result1 = factorial(n-1);
         int result = n * result1;
         return result;
      }//Factorial method

   }
   public static double myPow(double x, int y){
      if (y <= 0){
         return 1;
      }
        else {
         double result1 = myPow(x,y-1);
         double result = x* result1;
         return result;
      }
   }
}

