public class Factorial{
    public long factorial(long num) {
        long fact = 1;
        for (long i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}

