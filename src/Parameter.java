public class Parameter {
    public static void main(String[] args) {
        printSum(3, 5);
    }   
        // void: nur ausführen
    public static void printSum(int a, int b) {
        System.out.println("Summe = " + (a + b));
    }

    // int: Ergebnis zurückgeben
    public static int add(int a, int b) {
        return a + b;
    }

    public static void sayHello(String name, int age) {
    System.out.println("Hallo " + name + ", du bist " + age + " Jahre alt.");
    }

    
}
