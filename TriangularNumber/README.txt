Author:	Abdulsalam Odetayo

Algoritm checks if a number is a triangular number.
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


C++ algorithm.cpp
Java algorithm.java
