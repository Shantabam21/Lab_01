public class PersonTest {
    public static void main(String[] args) {
        Person askar = new Person("123456789", "Tom", "Wulf", "Mr.", 25);
        System.out.println(askar.toXML());

        Person sally = new Person("123456789", "Sally", "Wulf", "Mr.", 25);
        System.out.println(sally.toString());
    }
}
