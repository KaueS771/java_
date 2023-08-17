import java.util.Scanner;
public class App9 {

    public static void main(String [] args){
        String nomes[] = new String[5];
        int idades[]= new int [5];
        float estatura[]= new float[5];
        float peso[]= new float[5];
        float imc[]= new float[5];
        Scanner MeuScanner =  new Scanner(System.in);
        for (int i =0;i<=4;i++){ 
            System.out.print("Digite um Nome "+(i+1)+"a. Pessoa: ");
            nomes[i]=MeuScanner.nextLine();
            System.out.print("Digite uma idade "+(i+1)+"a. Pessoa: ");
            idades[i]=MeuScanner.nextInt();
            System.out.print("Digite uma altura "+(i+1)+"a. Pessoa: ");
            estatura[i]=MeuScanner.nextFloat();
            System.out.print("Digite um peso "+(i+1)+"a. Pessoa: ");
            peso[i]=MeuScanner.nextFloat();
            MeuScanner.nextLine();
            
            imc[i] = peso[i] / (estatura[i] * estatura[i]);
            MeuScanner.nextLine();
   
        }
        System.out.print("\n");
        for (int i = 0; i< idades.length;i++){
            System.out.print(" Nome " + nomes[i]+ " Idade "+ idades[i]+ " Altura "+ estatura[i]+ " Peso " + peso[i]);

        }

    }
    
}
