import java.util.Scanner;

public class Vetores {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        //Vetores
        int[] vetor1 = new int[]{1, 4, 7, 3, 5};
        int varx = vetor1[2]; //=7
        int[] vetor2 = new int[7];
        //repetidores
        System.out.println("Dados do vetor 1");
        for(int i = 0; i < 5; i++){
            int vlr = vetor1[i];
            System.out.println("Valor" + vlr);
            
        }
        System.out.println("\nDados do vetor 2");
        
        //Prencher o vetor 2 com dados
        int contador = 0;
        while (contador < 4 ) {
          System.out.println("Digite o valor " + (contador +1));
        //   int vlr = leitor.nextInt();
        //   vetor2[contador] = vlr;
        //   contador++;
          vetor2[contador++] = leitor.nextInt();
        }
        // dobrar os valores do vetor2
        contador = 0;
        do{
            if(vetor2[0] == 0){
                System.err.println("O valor da posição 1 não pode ser zero!");
                break;
            }
            contador++;
        } while(contador < 4);

        for(int i = 0; i < 5; i++){
            int vlr = vetor2[i];
            System.out.println("Valor" + vlr);
        }

        leitor.close();
    }
}
