class Prime
{
     public static void main (String[]args)
     {

    int lower = 1, upper = 20;


    for (int i = lower; i <= upper; i++)
      if (isPrime (i))
	  System.out.println (i);
    }
 
  static boolean isPrime (int n)
  {
    if (n <= 1)
        return false;

    else if (n == 2)
        return true;

    else if (n % 2 == 0)
        return false;

    for (int i = 3; i <= Math.sqrt(n); i += 2)
    {
        if (n % i == 0)
            return false;
    }
    
    return true;
}
}
/*
Output:
2 3 5 7 11 13 17 19 