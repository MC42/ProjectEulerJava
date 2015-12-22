public class Euler_01 {
public static long count = 0;
public static void main(String[] args) {
for (int i = 0; i < 1000; i++)

{
if (i % 3 == 0)
{
count = count + i;
}

else if (i % 5 == 0)
{
count = count + i;
}
}

System.out.println(count);
}
}
