
public class Euler_02 {
public static long count = 0;
public static void main(String[] args) {
long firstNumber = 1;
long secondNumber = 1;
long out = 0;

for (int i = 0; i < 4000000; i++) {
out = firstNumber + secondNumber;
if ((out % 2 ==0) && (out < 4000000))
{
count = count + out;
}
firstNumber = secondNumber;
secondNumber = out;
if (out > 4000000) {
System.out.println(count);
System.exit(0);
}
}
}
}
