public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Application is running");

        Utilities util = new Utilities();
        System.out.println(util.removePairs("AABCDDEFF"));
    }
}