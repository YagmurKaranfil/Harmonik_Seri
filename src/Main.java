import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int number;
        double total=0.0;


        Scanner input = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++) {

            total += 1.0 / i;
        }
        System.out.println(total);
    }

}