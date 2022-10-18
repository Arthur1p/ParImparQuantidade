import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantidadeNumeros = scan.nextInt();

        int count = 0;
        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();
            count++;

            if(numero % 2 == 0){
                quantPares++;
            } else {
                quantImpares++;
            }


        } while(count < quantidadeNumeros);

        System.out.println("Quantidade par: " + quantPares);
        System.out.println("Quantidade impar: "+ quantImpares);
    }
}
