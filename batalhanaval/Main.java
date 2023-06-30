package batalhanaval;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random aleatorio = new Random();
        boolean jogonovo = true;
        JogoMaquina jogoMaquina = new JogoMaquina();
        JogoAutomatico jogoAutomatico = new JogoAutomatico();
        JogoManual jogoManual = new JogoManual();

do{
        System.out.println("         __________________________________________");
        System.out.println("         |                                        |");
        System.out.println("         |             BATALHA NAVAL              |");
        System.out.println("         |________________________________________|");


        System.out.println("\n         Começando...");
        System.out.println("\n         - Digite 1 para jogar com outro jogador:");
        System.out.println("\n         - Digite 2 para jogar com a máquina:");
        int tipoDeJogo = ler.nextInt();


        switch (tipoDeJogo) {
            case 1:
                System.out.println("\n         - Digite 3 para alocação de barcos automática:");
                System.out.println("\n         - Digite 4 para alocação manual:");
                int tipoDeJogo2 = ler.nextInt();
                switch (tipoDeJogo2) {
                    case 3:
                        jogoAutomatico.alocarBarco1();
                        jogoAutomatico.alocarBarco2(jogoAutomatico.jogador1, jogoAutomatico.jogador2);
                        jogoAutomatico.iniciarJogo1(jogoAutomatico.jogador1, jogoAutomatico.jogador2, jogoAutomatico.tabuleiro1, jogoAutomatico.tabuleiro2);
                        System.out.println("\n         - Digite 0 para encerrar o jogo:");
                        System.out.println("\n         - Digite 1 para iniciar um novo jogo:");
                        int novo = ler.nextInt();
                        if (novo==0){
                            jogonovo = true;

                        }
                        if (novo==1){
                         jogonovo = false;

                        }
                        break;
                    case 4:
                       jogoManual.alocarBarco1();
                        jogoManual.alocarBarco2(jogoManual.jogador1, jogoManual.jogador2);
                        jogoManual.iniciarJogo1(jogoManual.jogador1,jogoManual.jogador2, jogoManual.tabuleiro1, jogoManual.tabuleiro2);
                        System.out.println("\n         - Digite 0 para encerrar o jogo:");
                        System.out.println("\n         - Digite 1 para iniciar um novo jogo:");
                        novo = ler.nextInt();
                        if (novo==0){
                            jogonovo = true;

                        }
                        if (novo==1){
                         jogonovo = false;
}
                        
                        break;
                    default:
                        System.out.println("\n         - Opção inválida!");
                }
                break;
            case 2:
               jogoMaquina.alocarBarco1();
                        jogoMaquina.alocarBarco2(jogoMaquina.jogador);
                        jogoMaquina.iniciarJogo1(jogoMaquina.jogador,jogoMaquina.tabuleiro1, jogoMaquina.tabuleiro2);
                        System.out.println("\n         - Digite 0 para encerrar o jogo:");
                        System.out.println("\n         - Digite 1 para iniciar um novo jogo:");
                        int novo = ler.nextInt();
                        if (novo==0){
                            jogonovo = true;

                        }
                        if (novo==1){
                         jogonovo = false;
                        }
                break;
            default:
                System.out.println("\n         - Opção inválida!");
        }}while(!jogonovo);

    }
}