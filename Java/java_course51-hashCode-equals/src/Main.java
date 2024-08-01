public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Robert", "Junior");
        Client client2 = new Client("Tom", "Holland");
        Client client3 = new Client("Robert", "Junior");

        System.out.println(client1.equals(client3));
        System.out.println(client1.hashCode());
        System.out.println(client3.hashCode());
    }
}