import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma idade!");
        String idade = sc.nextLine();
        System.out.println("Voce digitiou " + idade + " anos");
    }
}