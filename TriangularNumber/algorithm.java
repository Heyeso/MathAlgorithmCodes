// Author:			Abdulsalam Odetayo
// Source file:		algorithm.java
// Description:		
// IDE used:		Eclipse Java

class algorithm {
/*Algorithm checks if a number is a triangular number.
  where,
  n = Summation of i, where i = 0, to any Integer x > 0,
  n is a triangular number.

  Equation:
  n = (x(x+1))/2 = 0 + 1 + ... + x-1 + x
  n = ((x*x) + x)/2
  2*n = (x*x) + x
  0 = (x*x) + x - 2*n
  Using quadratic equation
  (-b + sqr((b*b)-(4*a*c)))/(2*c) = root1
  (-b - sqr((b*b)-(4*a*c)))/(2*c) = root2
  where, a = 1, b = 1, c = (-2*n)
  since, x > 0, therefore, root1 = x
  (-1 + sqr((1*1)-(4*1*(-2*n))))/(2*1) = x
  (-1 + sqr(1 + (4*2*n)))/(2) = x
  Hence,
  (-1 + sqr(1 + (8*n)))/(2) = x
*/

//Input: Takes in an Integer.
//Checks if in Integer is a Triangular Number
//Returns True if Integer is a Triangular number.
//Returns False if Integer is not a Triangular Number
    public static boolean isTriangular(int number) {
        double root = ((-1) + Math.sqrt(1 + (8 * number))) / (2);
        if ((root % 1) == 0)
            return true;
        return false;
    }

//Input: Takes in an Integer.
//Checks if in Integer is a Triangular Number
//Returns root if Integer is a Triangular number.
//Returns 0 if Integer is not a Triangular Number.
    public static double isTriangularNumber(int number) {
        double root = ((-1) + Math.sqrt(1 + (8 * number))) / (2);
        if ((root % 1) == 0)
            return root;
        return 0.0;
    }
}