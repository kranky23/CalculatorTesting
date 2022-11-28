public class PandC
{
    static double permutation(int n, int r)
    {
        double per = factorial(n) / factorial(n-r);
        return per;
    }

    static double combination(int n, int r)
    {
        double comb = factorial(n) / (factorial(r) * factorial(n-r));
        return comb;
    }

    public static double factorial(double number1)
    {
        double result = fact(number1);
        return result;
    }

    public static double fact(double num)
    {
        double facto = 1;
        for(int i = 1; i <= num; ++i)
        {
            facto *= i;
        }
        return  facto;
    }
}
