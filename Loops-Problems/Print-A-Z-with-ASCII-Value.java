//Print all alphabets with their corresponding ASCII values.
public class Main {
    public static void main(String[] args) {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch +"-"+(int)ch+" ");
        }
    }
}
