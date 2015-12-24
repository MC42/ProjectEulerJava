public class Euler_01 {
public static long count = 0;
public static void main(String[] args) {
for (int i = 0; i < 1000; i++) //Creates a loop in the requested range.  0 to 1000.

	{
	if (i % 3 == 0) //If divisible by 3, add to total/
		{
		count = count + i;
		}

	else if (i % 5 == 0) //if divisible by 5, add to total.
		{
		count = count + i;
		}
	}
	System.out.println(count); //When done, print total.
	}
}
