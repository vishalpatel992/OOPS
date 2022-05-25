public class Encapsulation {
    public static void main(String a[])
    {
        Laptop l1= new Laptop();
        l1.setRam(8);
        l1.setPrice(100);
        System.out.println(l1.getRam() + " " + l1.getPrice());
    }
}

class Laptop
{
    private int ram;
    private int price;

    public Laptop(){}

    public int getRam()
    {
        return ram;
    }
    public void setRam(int ram)
    {
        this.ram= ram;
    }

    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price= price;
    }

}
