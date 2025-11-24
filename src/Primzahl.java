public class Primzahl {
    public static void main(String[] args) {
        System.out.println(isPrimzahl(3));
        System.out.println(isPrimzahl(12));
        System.out.println(isPrimzahl(34));
    }

    public static boolean isPrimzahl (int a){
        if ( a <= 1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(a); i++){
            if (a % i == 0 ) {
                return false;
            }
        }
        return true;
    }
}
