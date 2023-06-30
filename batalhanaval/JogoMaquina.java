package batalhanaval;
import java.util.Scanner;
import java.util.Random;

public class JogoMaquina {
    public Scanner ler;
    public Random aleatorio;
    public int barco1;
    public int barco2;
    public int barco3;
    public int barco4;
    public String[][] tabuleiro1;
    public String[][] tabuleiro2;
    public String jogador;
   

    public JogoMaquina() {
        ler = new Scanner(System.in);
        aleatorio = new Random();
        barco1 = 4;
        barco2 = 3;
        barco3 = 2;
        barco4 = 1;
        tabuleiro1 = new String[10][10];
        tabuleiro2 = new String[10][10];
    }

    public void alocarBarco1() {
        System.out.println("\n         - Digite o seu nome:");
        jogador = ler.next();
        System.out.println("\n         - Bem vindo(a) " + jogador);
        System.out.println("         __________________________________________");
        System.out.println("                                                 ");
        System.out.println("                     " + jogador + " X Máquina             ");
        System.out.println("         __________________________________________");

        System.out.println("\n         - Alocando barcos...");
         for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tabuleiro1[i][j] = ".";
            }
        }


        int orientacao;
        int linha;
        int coluna;
        int barcos[] = { 4, 3, 3, 2, 2, 2, 1, 1, 1, 1 };
        for (int contbarco = 0; contbarco < barcos.length; contbarco++) {
            int barco = barcos[contbarco];
            boolean alocado = false;
            do {
                orientacao = aleatorio.nextInt(1);
                linha = aleatorio.nextInt(9);
                coluna = aleatorio.nextInt(9);


                if (orientacao == 1) { // Vertical
                    if (linha + barco > 10) {
                        break;
                    }
                    boolean posicaoValida = true;
                    for (int i = linha; i < linha + barco; i++) {
                        if (!tabuleiro1[i][coluna].equals(".")) {
                            posicaoValida = false;
                            break;
                        }
                    }
                    if (posicaoValida) {
                        for (int i = linha; i < linha + barco; i++) {
                            tabuleiro1[i][coluna] = "O";
                        }
                        alocado = true;
                    }
                } else { // Horizontal
                    if (coluna + barco > 10) {
                        continue;
                    }
                    boolean posicaoValida = true;
                    for (int j = coluna; j < coluna + barco; j++) {
                        if (!tabuleiro1[linha][j].equals(".")) {
                            posicaoValida = false;
                            break;
                        }
                    }
                    if (posicaoValida) {
                        for (int j = coluna; j < coluna + barco; j++) {
                            tabuleiro1[linha][j] = "O";
                        }
                        alocado = true;
                    }
                }
            } while (!alocado);
        }


        System.out.println("");
        System.out.println("___________________________________________________________________________________________________");
        System.out.println("                                                            ");
        System.out.println("                                           Tabuleiro - " + jogador + "               ");
        System.out.println("___________________________________________________________________________________________________");
        System.out.println("");
        System.out.println("_____________________________________________" + "        ______________________________________________");
        System.out.println("|   | A | B | C | D | E | F | G | H | I | J |" + "        |                                            |");
        for (int i = 0; i < 10; i++) {
            System.out.print("|_" + i + "_|");
            for (int j = 0; j < 10; j++) {
                System.out.print("_" + tabuleiro1[i][j] + "_|");
            } if (i == 0) {
                System.out.print("        |                BATALHA NAVAL               |");
            }
            if (i == 1) {
                System.out.print("        |____________________________________________|");
            }
            if (i == 2) {
                System.out.print("        ______________________________________________");
            }
            if (i == 3) {
                System.out.print("        |   | Legendas                               |");
            }
            if (i == 4) {
                System.out.print("        |   |                                        |");
            }
            if (i == 5) {
                System.out.print("        | . | Caractere que representa o mar         |");
            }
            if (i == 6) {
                System.out.print("        | O | Caractere que representa os barcos     |");
            }
            if (i == 7) {
                System.out.print("        | X | Caractere que representa tiro no barco |");
            }
            if (i == 8) {
                System.out.print("        | # | Caractere que representa tiro no mar   |");
            }
            if (i == 9) {
                System.out.print("        |____________________________________________|");
            }
            System.out.println();
        }
        System.out.println("");

    }
    
 public void alocarBarco2(String jogador) {
       

        System.out.println("\n         - Alocando barcos...");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tabuleiro2[i][j] = ".";
            }
        }

                for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tabuleiro2[i][j] = ".";
            }
        }
        int orientacao;
        int linha;
        int coluna;
        int barcos[] = { 4, 3, 3, 2, 2, 2, 1, 1, 1, 1 };
        for (int contbarco = 0; contbarco < barcos.length; contbarco++) {
            int barco = barcos[contbarco];
            boolean alocado = false;
            do {
                orientacao = aleatorio.nextInt(1);
                linha = aleatorio.nextInt(9);
                coluna = aleatorio.nextInt(9);


                if (orientacao == 1) { // Vertical
                    if (linha + barco > 10) {
                        break;
                    }
                    boolean posicaoValida = true;
                    for (int i = linha; i < linha + barco; i++) {
                        if (!tabuleiro2[i][coluna].equals(".")) {
                            posicaoValida = false;
                            break;
                        }
                    }
                    if (posicaoValida) {
                        for (int i = linha; i < linha + barco; i++) {
                            tabuleiro2[i][coluna] = "O";
                        }
                        alocado = true;
                    }
                } else { // Horizontal
                    if (coluna + barco > 10) {
                        continue;
                    }
                    boolean posicaoValida = true;
                    for (int j = coluna; j < coluna + barco; j++) {
                        if (!tabuleiro2[linha][j].equals(".")) {
                            posicaoValida = false;
                            break;
                        }
                    }
                    if (posicaoValida) {
                        for (int j = coluna; j < coluna + barco; j++) {
                            tabuleiro2[linha][j] = "O";
                        }
                        alocado = true;
                    }
                }
            } while (!alocado);
        }


        System.out.println("");
        System.out.println("___________________________________________________________________________________________________");
        System.out.println("                                                            ");
        System.out.println("                                           Tabuleiro - Máquina              ");
        System.out.println("___________________________________________________________________________________________________");
        System.out.println("");
        System.out.println("_____________________________________________" + "        ______________________________________________");
        System.out.println("|   | A | B | C | D | E | F | G | H | I | J |" + "        |                                            |");
        for (int i = 0; i < 10; i++) {
            System.out.print("|_" + i + "_|");
            for (int j = 0; j < 10; j++) {
                System.out.print("_" + tabuleiro2[i][j] + "_|");
            }
            if (i == 0) {
                System.out.print("        |                BATALHA NAVAL               |");
            }
            if (i == 1) {
                System.out.print("        |____________________________________________|");
            }
            if (i == 2) {
                System.out.print("        ______________________________________________");
            }
            if (i == 3) {
                System.out.print("        |   | Legendas                               |");
            }
            if (i == 4) {
                System.out.print("        |   |                                        |");
            }
            if (i == 5) {
                System.out.print("        | . | Caractere que representa o mar         |");
            }
            if (i == 6) {
                System.out.print("        | O | Caractere que representa os barcos     |");
            }
            if (i == 7) {
                System.out.print("        | X | Caractere que representa tiro no barco |");
            }
            if (i == 8) {
                System.out.print("        | # | Caractere que representa tiro no mar   |");
            }
            if (i == 9) {
                System.out.print("        |____________________________________________|");
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
public void iniciarJogo1(String jogador, String tabuleiro1[][],  String tabuleiro2[][]) {
        boolean jogada = true;
        int pontuacao1 = 0;
        int pontuacao2 = 0;
        String tabuleiroV1[][] = new String[10][10];
        String tabuleiroV2[][] = new String[10][10];
        int linha = 0;
        int coluna = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tabuleiroV1[i][j] = ".";
                tabuleiroV2[i][j] = ".";
            }
        }


        do {
            if (jogada) {
                System.out.println("");
                System.out.println("__________________________________________________________________________________________________");
                System.out.println("                                                            ");
                System.out.println("                                         Jogando - " + jogador + "              ");
                System.out.println("__________________________________________________________________________________________________");
                System.out.println("");
                System.out.println("\n         - " + jogador + " ,digite o número da linha para atirar");
                linha = ler.nextInt();
                System.out.println("\n         - " + jogador + " ,digite a letra da coluna para atirar");
                String letra = ler.next().toUpperCase();
                String letras = "ABCDEFGHIJ";
                coluna = letras.indexOf(letra);

               if (tabuleiroV1[linha][coluna].equals("X")) {

                    System.out.println("\n         - Essa posição já foi jogada...");
                   System.out.println("\n         - Jogue novamente");
                    jogada = true;

                }else if (tabuleiro2[linha][coluna].equals("O")) {
                    pontuacao1++;
                    tabuleiroV1[linha][coluna] = "X";
                    System.out.println("\n         - Parabéns!!! Você acertou!");
                    System.out.println("");
                   System.out.println("___________________________________________________________________________________________________");
                    System.out.println("                                                            ");
                    System.out.println("                                        - Pontuação: " + jogador + " - " + pontuacao1 + " X " + pontuacao2 + "");
                   System.out.println("___________________________________________________________________________________________________");
                   System.out.println("");
                   System.out.println("___________________________________________________________________________________________________");
                   System.out.println("                                                            ");
                   System.out.println("                                             Tabuleiro de jogadas - " + jogador + "               ");
                   System.out.println("___________________________________________________________________________________________________");
                   System.out.println("");
                   System.out.println("_____________________________________________" + "        ______________________________________________");
                   System.out.println("|   | A | B | C | D | E | F | G | H | I | J |" + "        |                                            |");
                    for (int i = 0; i < 10; i++) {
                        System.out.print("|_" + i + "_|");
                        for (int j = 0; j < 10; j++) {
                            System.out.print("_" + tabuleiroV1[i][j] + "_|");
                        }
                        if (i == 0) {
                            System.out.print("        |                BATALHA NAVAL               |");
                        }
                        if (i == 1) {
                            System.out.print("        |____________________________________________|");
                        }
                        if (i == 2) {
                            System.out.print("        ______________________________________________");
                        }
                        if (i == 3) {
                            System.out.print("        |   | Legendas                               |");
                        }
                        if (i == 4) {
                            System.out.print("        |   |                                        |");
                        }
                        if (i == 5) {
                            System.out.print("        | . | Caractere que representa o mar         |");
                        }
                        if (i == 6) {
                            System.out.print("        | O | Caractere que representa os barcos     |");
                        }
                        if (i == 7) {
                            System.out.print("        | X | Caractere que representa tiro no barco |");
                        }
                        if (i == 8) {
                            System.out.print("        | # | Caractere que representa tiro no mar   |");
                        }
                        if (i == 9) {
                            System.out.print("        |____________________________________________|");
                        }
                        System.out.println();
                    }
                    System.out.println("");
                    System.out.println("\n         - Continue jogando...");
                } if (tabuleiroV1[linha][coluna].equals("#")) {

                    System.out.println("\n         - Essa posição já foi jogada...");
                    System.out.println("\n         - Jogue novamente");
                    jogada = true;


                }else if (tabuleiro2[linha][coluna].equals(".")) {
                    tabuleiroV1[linha][coluna] = "#";
                    System.out.println("\n         - Que pena!!! Você errou!");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("___________________________________________________________________________________________________");
                    System.out.println("                                                            ");
                    System.out.println("                                          - Pontuação: " + jogador + " - " + pontuacao1 + " X " + pontuacao2 + "");
                    System.out.println("___________________________________________________________________________________________________");
                    System.out.println("");
                    System.out.println("___________________________________________________________________________________________________");
                    System.out.println("                                                            ");
                    System.out.println("                                             Tabuleiro de jogadas - " + jogador + "               ");
                    System.out.println("___________________________________________________________________________________________________");
                    System.out.println("");
                    System.out.println("_____________________________________________" + "        ______________________________________________");
                    System.out.println("|   | A | B | C | D | E | F | G | H | I | J |" + "        |                                            |");
                    for (int i = 0; i < 10; i++) {
                        System.out.print("|_" + i + "_|");
                        for (int j = 0; j < 10; j++) {
                            System.out.print("_" + tabuleiroV1[i][j] + "_|");
                        }
                        if (i == 0) {
                            System.out.print("        |                BATALHA NAVAL               |");
                        }
                        if (i == 1) {
                            System.out.print("        |____________________________________________|");
                        }
                        if (i == 2) {
                            System.out.print("        ______________________________________________");
                        }
                        if (i == 3) {
                            System.out.print("        |   | Legendas                               |");
                        }
                        if (i == 4) {
                            System.out.print("        |   |                                        |");
                        }
                        if (i == 5) {
                            System.out.print("        | . | Caractere que representa o mar         |");
                        }
                        if (i == 6) {
                            System.out.print("        | O | Caractere que representa os barcos     |");
                        }
                        if (i == 7) {
                            System.out.print("        | X | Caractere que representa tiro no barco |");
                        }
                        if (i == 8) {
                            System.out.print("        | # | Caractere que representa tiro no mar   |");
                        }
                        if (i == 9) {
                            System.out.print("        |____________________________________________|");
                        }
                        System.out.println();
                    }
                    System.out.println("");
                    System.out.println("");


                    System.out.println("\n         - Passou a vez para a Máquina...");


                    jogada = false;


                }



                }



                if (!jogada) {

                    int linha2 = aleatorio.nextInt(9);
                    
                    int coluna2 = aleatorio.nextInt(9);
                    String numeros = "123456789";
                    int atirar = numeros.indexOf(coluna2);
                                    
                    System.out.println("");
                    System.out.println("___________________________________________________________________________________________________");
                    System.out.println("                                                            ");
                    System.out.println("                                        Jogando - Máquina               ");
                    System.out.println("___________________________________________________________________________________________________");
                    System.out.println("");
                    System.out.println("\n         - Máquina atirou na linha: "+linha2);
                    System.out.println("\n          - Máquina atirou na coluna: "+atirar);
                    
                    if (tabuleiroV2[linha2][coluna2].equals("X")) {

                        System.out.println("\n         - A máquina jogou uma posição já jogada...");
                        System.out.println("\n         - Jogando novamente...");
                        jogada = true;


                    } else if (tabuleiro1[linha2][coluna2].equals("O")) {
                        pontuacao2++;
                        tabuleiroV2[linha2][coluna2] = "X";
                        System.out.println("\n         - A máquina acertou!");
                        System.out.println("");
                        System.out.println("___________________________________________________________________________________________________");
                        System.out.println("                                                            ");
                        System.out.println("                                        - Pontuação: Máquina - " + pontuacao2 + " X " + pontuacao1 + "");
                        System.out.println("___________________________________________________________________________________________________");
                        System.out.println("");
                        System.out.println("___________________________________________________________________________________________________");
                        System.out.println("                                                            ");
                        System.out.println("                                           Tabuleiro de jogadas - Máquina              ");
                        System.out.println("___________________________________________________________________________________________________");
                        System.out.println("");
                        System.out.println("_____________________________________________" + "        ______________________________________________");
                        System.out.println("|   | A | B | C | D | E | F | G | H | I | J |" + "        |                                            |");
                        for (int i = 0; i < 10; i++) {
                            System.out.print("|_" + i + "_|");
                            for (int j = 0; j < 10; j++) {
                                System.out.print("_" + tabuleiroV2[i][j] + "_|");
                            }
                            if (i == 0) {
                                System.out.print("        |                BATALHA NAVAL               |");
                            }
                            if (i == 1) {
                                System.out.print("        |____________________________________________|");
                            }
                            if (i == 2) {
                                System.out.print("        ______________________________________________");
                            }
                            if (i == 3) {
                                System.out.print("        |   | Legendas                               |");
                            }
                            if (i == 4) {
                                System.out.print("        |   |                                        |");
                            }
                            if (i == 5) {
                                System.out.print("        | . | Caractere que representa o mar         |");
                            }
                            if (i == 6) {
                                System.out.print("        | O | Caractere que representa os barcos     |");
                            }
                            if (i == 7) {
                                System.out.print("        | X | Caractere que representa tiro no barco |");
                            }
                            if (i == 8) {
                                System.out.print("        | # | Caractere que representa tiro no mar   |");
                            }
                            if (i == 9) {
                                System.out.print("        |____________________________________________|");
                            }
                            System.out.println();
                        }
                        System.out.println("");
                        System.out.println("\n         - Continue jogando...");
                    }
                    if (tabuleiroV2[linha2][coluna2].equals("#")) {

                        System.out.println("\n         - Essa posição já foi jogada...");
                        System.out.println("\n         - Jogue novamente");
                        jogada = true;


                    } else if (tabuleiro1[linha2][coluna2].equals(".")) {
                        tabuleiroV2[linha2][coluna2] = "#";
                        System.out.println("\n         - Que pena!!! Você errou!");
                        System.out.println("");
                        System.out.println("___________________________________________________________________________________________________");
                        System.out.println("                                                            ");
                        System.out.println("                                        - Pontuação: Máquina - " + pontuacao2 + " X " + pontuacao1 + "");
                        System.out.println("___________________________________________________________________________________________________");
                        System.out.println("");
                        System.out.println("___________________________________________________________________________________________________");
                        System.out.println("                                                            ");
                        System.out.println("                                           Tabuleiro - Máquina              ");
                        System.out.println("___________________________________________________________________________________________________");
                        System.out.println("");
                        System.out.println("_____________________________________________" + "        ______________________________________________");
                        System.out.println("|   | A | B | C | D | E | F | G | H | I | J |" + "        |                                            |");
                        for (int i = 0; i < 10; i++) {
                            System.out.print("|_" + i + "_|");
                            for (int j = 0; j < 10; j++) {
                                System.out.print("_" + tabuleiroV2[i][j] + "_|");
                            }
                            if (i == 0) {
                                System.out.print("        |                BATALHA NAVAL               |");
                            }
                            if (i == 1) {
                                System.out.print("        |____________________________________________|");
                            }
                            if (i == 2) {
                                System.out.print("        ______________________________________________");
                            }
                            if (i == 3) {
                                System.out.print("        |   | Legendas                               |");
                            }
                            if (i == 4) {
                                System.out.print("        |   |                                        |");
                            }
                            if (i == 5) {
                                System.out.print("        | . | Caractere que representa o mar         |");
                            }
                            if (i == 6) {
                                System.out.print("        | O | Caractere que representa os barcos     |");
                            }
                            if (i == 7) {
                                System.out.print("        | X | Caractere que representa tiro no barco |");
                            }
                            if (i == 8) {
                                System.out.print("        | # | Caractere que representa tiro no mar   |");
                            }
                            if (i == 9) {
                                System.out.print("        |____________________________________________|");
                            }
                            System.out.println();
                        }
                        System.out.println("");
                        System.out.println("");
                        System.out.println("\n         - Passou a vez para o " + jogador + "...");
                        jogada = true;


                    }





            }


        }while(pontuacao1 < 20 && pontuacao2 < 20);


        if (pontuacao1 == 20) {
            System.out.println("\n         - " + jogador + " acertou 20 pontos!");
            System.out.println("___________________________________________________________________________________________________");
            System.out.println("                                                 ");
            System.out.println("                                             VENCEDOR                 ");
            System.out.println("                                              - " + jogador + " -          ");
            System.out.println("___________________________________________________________________________________________________");

        }
        if (pontuacao2 == 20) {
            System.out.println("\n         - Máquina acertou 20 pontos!");
            System.out.println("___________________________________________________________________________________________________");
            System.out.println("                                                 ");
            System.out.println("                                             VENCEDOR                 ");
            System.out.println("                                              - Máquina -          ");
            System.out.println("___________________________________________________________________________________________________");
        }
    } 
}