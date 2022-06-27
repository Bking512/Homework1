public class ObjectTest {
    public static void main(String[] args)
    {
    ObjectHomework1 item1 = new ObjectHomework1();

    item1.details();
    item1.increasePrice();

    System.out.println();

    item1.details();

    System.out.println();

    item1.increasePrice(7);
    item1.details();

    System.out.println();

    ObjectHomework1 item2 = new ObjectHomework1("Jeans", "small", 31.2);
    item2.details();

    System.out.println();

    item2.increasePrice(10);
    item2.details();

    System.out.println();

    item2.increasePrice(4);
    item2.details();


    }
}
