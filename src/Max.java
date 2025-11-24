public class Max {
    public static void main(String[] args) {

       System.out.println(max(20, 40, 20));
       System.out.println( max(2, 1, 1));
       System.out.println(    max(4, 5, 1));
        
    }

    public static int max(int a, int b, int c){
        if (a > b){
            return a;
        } else if (b > c){
            return b;
        }else {
            return c;
        }
    }
}
