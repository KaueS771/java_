import java.util.Scanner;

class Operacoes{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);         //ENTRADA entra como o nome do metodo scanner 
        double num1, num2, num3;
        
        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextDouble();
        
        num3 = num1 * num2;
        System.out.printf("%f +%f = %f\n", num1,num2,num3);
    
        
    }
}
