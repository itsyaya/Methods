

public class Methoden_1 {
    public static void main(String[] args) {
        sayHello("Annama");
        sayHello("Bama");
        sayHello("Naringie");
        sayHello("Apple");

        System.out.println("____________________");

        System.out.println(add(3, 6));
        System.out.println(add(10, 20));

        System.out.println("____________________");

        System.out.println(multiply(2, 3));
        System.out.println(multiply(5, 10));

        System.out.println("____________________");
        
        System.out.println(max(4, 6, 100));
        System.out.println(max(20, 105, 5));
        System.out.println(max(200, 4, 12));
    }

    public static void sayHello (String name){
        System.out.println("Hello my friend " + name);
    }


    public static int add (int a, int b){
        return a + b;
    }
    
    public static int multiply (int a,int b){
        return a * b;
    }

    public static int max (int a, int b, int c){
        if (a > b){
            return a;
        }else if (b > c) {
            return b;
        }else {
            return c;
        }
    }
}