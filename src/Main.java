import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int portaPremiada, portaVazia = 0, portaEscolhida, opcaoMenu = 55;
        Scanner scn = new Scanner(System.in);
        Random random = new Random();

            System.out.println("Bem-vindo ao jogo Monty Hall");
            System.out.print("Escolha uma porta (1, 2 ou 3): ");
            portaEscolhida = scn.nextInt();
            scn.nextLine();

            if(portaEscolhida >= 1 && portaEscolhida <=3 ) {
                portaPremiada = random.nextInt(3) + 1;

                for(int i = 1; i <= 3; i++){  //portaVazia tem que ser diferente da portaPremiada e da portaEscolhida
                    if(portaEscolhida != i && portaPremiada != i) {
                        portaVazia = i;
                    }
                }

                System.out.println("O apresentador abriu a porta " + portaVazia + " que está vazia.");
                System.out.println("Você deseja trocar para a outra porta? (s/n)");
                String escolha2 = scn.nextLine().toLowerCase();

                if (escolha2.equals("s")){
                    for(int j = 1; j <= 3; j++) {
                        if(portaVazia != j && portaEscolhida != j) { //novo valor p portaEscolhida precisa ser diferente
                            portaEscolhida = j;  // da portaVazia e não ser a portaEscolhida que o usuario digitou antes
                        }
                    }
                    if(portaEscolhida == portaPremiada) {
                        System.out.println("Parabéns! Você ganhou!");
                    } else {
                        System.out.println("Você perdeu! A porta premiada era a " + portaPremiada);
                    }
                } else {
                    if(portaEscolhida == portaPremiada) {
                        System.out.println("Parabéns! Você ganhou!");
                    } else {
                        System.out.println("Você perdeu! A porta premiada era a " + portaPremiada);
                    }
                }
            } else {
                System.out.println("Digite um número entre 1 e 3!");
            }
    }
}
