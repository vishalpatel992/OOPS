public class Abstraction {
    public static void main(String a[])
    {
        Audi a1= new Audi();
        a1.start();
        a1.color();
    }
}

//you can't make objects of abstract class
//abstract class can have abstract functions as well as normal functions
abstract class Car
{
    int price;

    //you dont't have to define the body of abstract funtion
    //class inheriting the abstract class will override the abstract function
    abstract public void start();
    
    public void color()
    {
        System.out.println("amazing color");
    }
}

class Audi extends Car
{
    
    @Override
    public void start()
    {
        System.out.println("audi is starting");
    }
}



