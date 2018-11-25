package pl.sda;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        LinearEquation linearEquation = new LinearEquation();

        int solve = linearEquation.solve(45, 76, 90);
        System.out.println(solve);

        int a, b;

        a = 5;
        b = -6;
        int c = a-b;

        System.out.println(c);


    }

}
