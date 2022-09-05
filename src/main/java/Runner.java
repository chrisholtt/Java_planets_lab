public class Runner {
    public static void main(String[] args) {
        Planet jupiter = new Planet("Jupiter", 100000);
        System.out.println(jupiter.getName());
        System.out.println(jupiter.getSize());
        jupiter.explode();
        System.out.println(jupiter.describe());
    }
}
