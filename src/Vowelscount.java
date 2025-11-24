public class Vowelscount {
    public static void main(String[] args) {
        String vowels = "Programmierung";

        System.out.println(countVowels("How many vowels in this TExt"));
        System.out.println(countVowels("Hellooo World!1 thi ssi Yes No "));
        System.out.println(countVowels("Programmierung is funy!!"));

    }   
    public static int countVowels(String vowels){
        int counter = 0; 
        vowels = vowels.toLowerCase();

        for (int i = 0; i < vowels.length(); i++){
            char c = vowels.charAt(i);
            if (c == 'a'|| c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                counter++;
            }
        }
        return counter;
    }
}
