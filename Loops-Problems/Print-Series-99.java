// Print the Series- 99,95,91,87... upto all terms which are positive
public class Main {
    public static void main(String[] args) {
        int a = 99;
        int d = 4;

        for (int i=1;a>0;i++) {
            System.out.print(a + " ");
            a-=d;
        }
    }
}
