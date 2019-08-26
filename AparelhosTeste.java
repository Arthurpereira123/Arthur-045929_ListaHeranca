package aparelhos.teste;

import java.util.Scanner;

public class AparelhosTeste {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao;
        
        System.out.println("Qual seu Aparelho de comunicação que você mais utiliza?");
        System.out.println("Digite 1 caso seja Celular");
        System.out.println("Digite 2 caso seja Computador");
        System.out.println("Digite 3 caso seja Telefone Residêncial");
        opcao = ler.nextInt();
        
        switch (opcao){
            case 1:
                ler = new Scanner(System.in);
                System.out.println("Digite o Tipo de Comunicação");
                String TipoComunicacao = ler.nextLine();
                System.out.println("Digite a Marca do seu celular");
                String Marca = ler.nextLine();
                System.out.println("Digite a cor do seu Celular");
                String Cor = ler.nextLine();
                break;
            case 2:
                ler = new Scanner(System.in);
                System.out.println("Digite o tipo de Comunicação");
                String TipoComunicacao1 = ler.nextLine();
                System.out.println("Digite a marca do seu computador");
                String Marca1 = ler.nextLine();
                System.out.println("Digite o modelo do seu computador");
                String Modelo = ler.nextLine();
                break;
            case 3:
                ler = new Scanner(System.in);
                System.out.println("Digite o tipo de Comunicação");
                String TipoComunicacao2 = ler.nextLine();
                System.out.println("Digite a marca do seu telefone");
                String Marca2 = ler.nextLine();
                System.out.println("Digite o tipo do seu telefone, se é fixo ou móvel");
                String Tipo = ler.nextLine();
            break;
                
                
        }
        
        
    }
    
}
