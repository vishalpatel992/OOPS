public class Interface {
    public static void main(String a[])
    {
        Bmw b= new Bmw();
        b.start(); 
        b.speed();
    }
}

// abstraction can be achieved using interfaces as well
// all the methods and variable inside an interface are public and abstract by default
interface Car
{
    //abstract methods dont' need a body 
    void start();
}

interface Sports
{
    void speed();
}

//class can implement multiple interfaces
class Bmw implements Car, Sports
{

    @Override
    public void start()
    {
        System.out.println("bmw is starting");
    }

    @Override
    public void speed()
    {
        System.out.println("Very high speed");
    }
}

interface Int
{
    //interface can have data members only with static and final keyword, and value should be assigned
    static final int a= 10;


    // in addition to abstract methods interface can have default and static methods as well 
    default void fun()
    {
        System.out.println("fun !!!");
    }

    static void fun1()
    {
        System.out.println("fun1 !!!");
    }

}

