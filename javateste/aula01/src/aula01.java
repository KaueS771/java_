import java.util.Scanner;  //importar a função scanner

class Operacoes{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);         //ENTRADA entra como o nome do metodo scanner 
    int num1;
        int num2;
        
        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextInt();
        
        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextInt();
        
        System.out.println();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2) );
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2) );
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2) );
        
        
    }
}
