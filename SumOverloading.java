class SumOverloading
{
    static int add(int a, int b)
    {
        return a+b;
    }
    static float add(int a, float b)
    {
        return a+b;
    }
    static float add(float a, float b)
    {
        return a+b;
    }
    static double add(double a, double b, double c)
    {
        return a+b+c;
    }
    public static void main(String[] args) 
    {
        System.out.println(add(4, 6));
        System.out.println(add(4, 6.15f));
        System.out.println(add(4.5f, 6.5f));
        System.out.println(add(4.123, 6.4574, 9.3453));
    }
}