public class ObjectHomework1
{

    public String type;
    public String size;
    public double price;

    public ObjectHomework1()
    {
        type = "T-shirt";
        size = "Medium";
        price = 29.9;
    }

    public ObjectHomework1(String type, String size, double price)
    {
        this.type = type;
        this.size = size;
        this.price = price;

    }

    public void increasePrice()
    {
        price+=5;
    }
    public void increasePrice(double x)
    {
        price+=x;
    }
    public void details()
    {
        System.out.println("item: " + type);
        System.out.println("size: " + size);
        System.out.println("price: " + price);
    }
}
