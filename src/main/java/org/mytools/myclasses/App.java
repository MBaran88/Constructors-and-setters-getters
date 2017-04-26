package org.mytools.myclasses;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Car myCar = new Car();              // w taki sposób podnosi sie klase do instancji
        Car myCar2 = new Car();


        System.out.println(myCar.toString());
        System.out.println(myCar2.toString());

        myCar.doBLink();
        System.out.println("myCar:" + myCar.);
    }
}
