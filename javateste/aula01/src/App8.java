import java.util.Scanner;
public class App8 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int idades[]= new int[5];
        for (int i =0;i<=4;i++){ 
            System.out.println("Digite um valor "+(i+1)+"o. valor: ");
            idades[i]=sc.nextInt();

        }
        System.out.print("Valores Digitados ");
        for (int i =0;i<=4;i++){
            System.out.print(idades[i]+"\t");
        }
 
    }
    
}
