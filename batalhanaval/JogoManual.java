package batalhanaval;

import java.util.Scanner;
import java.util.Random;

public class JogoManual {
    public Scanner ler;
    public Random aleatorio;
    public int barco1;
    public int barco2;
    public int barco3;
    public int barco4;
    public int countBarco1;
    public int countBarco2;
    public int countBarco3;
    public int countBarco4;
    public String[][] tabuleiro1;
    public String[][] tabuleiro2;
    public String jogador1;
    public String jogador2;

    public JogoManual() {
        ler = new Scanner(System.in);
        aleatorio = new Random();
        barco1 = 4;
        barco2 = 3;
        barco3 = 2;
        barco4 = 1;
        countBarco1 = 0;
        countBarco2 = 0;
        countBarco3 = 0;
        countBarco4 = 0;
        tabuleiro1 = new String[10][10];
        tabuleiro2 = new String[10][10];
    }

    public void alocarBarco1() {
        boolean vaialocar = true;
                for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tabuleiro1[i][j] = ".";
            }
        }
       
            System.out.println("\n         - Digite o nome do jogador 1:");
            jogador1 = ler.next();
            System.out.println("\n         - Bem vindo(a) " + jogador1);
            System.out.println("\n         - Digite o nome do jogador 2:");
            jogador2 = ler.next();
            System.out.println("\n         - Bem vindo(a) " + jogador2);
            System.out.println("");
            System.out.println("         __________________________________________");
            System.out.println("                                                 ");
            System.out.println("                     " + jogador1 + " X " + jogador2 + "             ");
            System.out.println("         __________________________________________");
            System.out.println("\n         - Alocando barcos...");

          System.out.println("\n         - Alocando barcos - " + jogador1);

             do {
                 vaialocar = true;
            for (int barcoIndex = 0; barcoIndex < 10; barcoIndex++) {
                System.out.println("\n         - Digite o tamanho do barco:");
                System.out.println("\n         1 - Barco de 1 espaço");
                System.out.println("\n         2 - Barco de 2 espaços");
                System.out.println("\n         3 - Barco de 3 espaços");
                System.out.println("\n         4 - Barco de 4 espaços");
                int tamanho = ler.nextInt();

                if (tamanho <= 4) {
                    if (vaialocar) {
                        switch (tamanho) {
                            case 1:
                                countBarco1++;
                                break;
                            case 2:
                                countBarco2++;
                                break;
                            case 3:
                                countBarco3++;
                                break;
                            case 4:
                                countBarco4++;
                                break;
                        }
                    }

                    if (countBarco1 > 4 || countBarco2 > 3 || countBarco3 > 2 || countBarco4 > 1){
                       
                        vaialocar = false;
                        System.out.println("\n         - Quantidade de barcos excede o limite permitido!");
                        countBarco4--;
                        countBarco3--;
                        countBarco2--;
                        countBarco1--;
                        break;
                        
                    
                    }
                    
                    String[] tamanhoBarco = new String[tamanho];

                    for (int i = 0; i < tamanho; i++) {
                        tamanhoBarco[i] = "O";
                    }

                    System.out.println("\n         - " + jogador1 + " ,digite o número da linha para alocar");
                    linha = ler.nextInt();
                    System.out.println("\n         - " + jogador1 + " ,digite a letra da coluna para alocar");
                    String letra = ler.next().toUpperCase();
                    String letras = "ABCDEFGHIJ";
                    coluna = letras.indexOf(letra);


                    System.out.println("\n         - Digite 1 para alocar o barco na vertical:");
                    System.out.println("\n         - Digite 2 para alocar o barco na horizontal:");
                    int alocar = ler.nextInt();
                    boolean podeAlocar = true;
                    switch (alocar) {
                        case 1:

                            for (int i = 0; i < tamanho; i++) {
                                if (coluna + i >= 10 || tabuleiro1[linha][coluna + i]!=".") {
                                    podeAlocar = false;
                                    break;
                                }
                            }

                            if (podeAlocar) {
                                for (int i = 0; i < tamanho; i++) {
                                    tabuleiro1[linha + i][coluna ] = tamanhoBarco[i];
                                }
                            } else {
                                System.out.println("\n         - Não é possível alocar o barco nessa posição!");
                            }
                            break;

                        case 2:
                            for (int i = 0; i < tamanho; i++) {
                                if (coluna + i >= 10 || tabuleiro1[linha][coluna + i]!=".") {
                                    podeAlocar = false;
                                    break;
                                }
                            }
                            if (podeAlocar) {
                                for (int i = 0; i < tamanho; i++) {
                                    tabuleiro1[linha][coluna + i] = tamanhoBarco[i];
                                }
                            } else {
                                System.out.println("\n         - Não é possível alocar o barco nessa posição!");
                            }
                            break;

                        default:
                            System.out.println("\n         - Opção inválida!");
                    }

                    System.out.println("");
                    System.out.println("_______________________________________________________________________________________________");
                    System.out.println("                                                            ");
                    System.out.println("                                      Tabuleiro - " + jogador1 + "               ");
                    System.out.println("_______________________________________________________________________________________________");
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

                } else {
                    System.out.println("\n         - Não é possível alocar barcos maiores que 4!");
                }
            }
        } while (!vaialocar);


    }



public void alocarBarco2(String jogador1, String jogador2){
            for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tabuleiro2[i][j] = ".";
            }
        }
            boolean vaialocar = true;
              do{
                  
  System.out.println("\n         - Alocando barcos...");

                System.out.println("\n         - Alocando barcos - "+jogador2);
                  
                    int countBarco1 = 0;
                    int countBarco2 = 0;
                    int countBarco3 = 0;
                    int countBarco4 = 0;
                    vaialocar = true;

                    for (int barcoIndex = 0; barcoIndex < 10; barcoIndex++) {
                        System.out.println("\n         - Digite o tamanho do barco:");
                        System.out.println("\n         1 - Barco de 1 espaço");
                        System.out.println("\n         2 - Barco de 2 espaços");
                        System.out.println("\n         3 - Barco de 3 espaços");
                        System.out.println("\n         4 - Barco de 4 espaços");
                        int tamanho = ler.nextInt();

                        if (tamanho <= 4) {
                            if (vaialocar) {
                                switch (tamanho) {
                                    case 1:
                                        countBarco1++;
                                        break;
                                    case 2:
                                        countBarco2++;
                                        break;
                                    case 3:
                                        countBarco3++;
                                        break;
                                    case 4:
                                        countBarco4++;
                                        break;
                                }
                            }

                            if (countBarco1 > 4 || countBarco2 > 3 || countBarco3 > 2 || countBarco4 > 1) {
                                vaialocar = false;
                                System.out.println("\n         - Quantidade de barcos excede o limite permitido!");
                                break;
                            }

                            String[] tamanhoBarco = new String[tamanho];

                            for (int i = 0; i < tamanho; i++) {
                                tamanhoBarco[i] = "O";
                            }

                            System.out.println("\n         - " + jogador2 + " ,digite o número da linha para alocar");
                            linha = ler.nextInt();
                            System.out.println("\n         - " + jogador2 + " ,digite a letra da coluna para alocar");
                            String letra = ler.next().toUpperCase();
                            String letras = "ABCDEFGHIJ";
                            coluna = letras.indexOf(letra);

                            System.out.println("\n         - Digite 1 para alocar o barco na vertical:");
                            System.out.println("\n         - Digite 2 para alocar o barco na horizontal:");
                            int alocar = ler.nextInt();

                            boolean podeAlocar = true;
                            switch (alocar) {
                                case 1:
                                    for (int i = 0; i < tamanho; i++) {
                                        if (linha + i >= 10 || tabuleiro2[linha][coluna]!=".") {
                                            podeAlocar = false;
                                            break;
                                        }
                                    }
                                    if (podeAlocar) {
                                        for ( int i = 0; i < tamanho; i++) {
                                            tabuleiro2[linha + i][coluna] = tamanhoBarco[i];
                                        }
                                    } else {
                                        System.out.println("\n         - Não é possível alocar o barco nessa posição!");
                                    }
                                    break;

                                case 2:
                                    for (int i = 0; i < tamanho; i++) {
                                        if (coluna + i >= 10 || tabuleiro2[linha][coluna]!=".") {
                                            podeAlocar = false;
                                            break;
                                        }
                                    }
                                    if (podeAlocar) {
                                        for (int i = 0; i < tamanho; i++) {
                                            tabuleiro2[linha][coluna + i] = tamanhoBarco[i];
                                        }
                                    } else {
                                        System.out.println("\n         - Não é possível alocar o barco nessa posição!");
                                    }
                                    break;

                                default:
                                    System.out.println("\n         - Opção inválida!");
                                    
                            }
 System.out.println("");
        System.out.println("_______________________________________________________________________________________________");
        System.out.println("                                                            ");
        System.out.println("                                      Tabuleiro - " +jogador2+ "               ");
        System.out.println("_______________________________________________________________________________________________");
       System.out.println("");
        System.out.println("_____________________________________________" + "        ______________________________________________");
        System.out.println("|   | A | B | C | D | E | F | G | H | I | J |" + "        |                                            |");
        for (int i = 0; i < 10; i++) {
            System.out.print("|_" + i + "_|");
            for (int j = 0; j < 10; j++) {
                System.out.print("_" + tabuleiro2[i][j] + "_|");
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
}System.out.println("");

                        } else {
                            System.out.println("\n         - Não é possível alocar barcos maiores que 4!");
                        } }}while(!vaialocar);
                   

           }

       public void iniciarJogo1(String jogador1, String jogador2, String tabuleiro1[][],  String tabuleiro2[][]) {
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
                System.out.println("                                         Jogando - " + jogador1 + "              ");
                System.out.println("__________________________________________________________________________________________________");
                System.out.println("");
                System.out.println("\n         - " + jogador1 + " ,digite o número da linha para atirar");
                linha = ler.nextInt();
                System.out.println("\n         - " + jogador1 + " ,digite a letra da coluna para atirar");
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
                    System.out.println("                                        - Pontuação: " + jogador1 + " - " + pontuacao1 + " X " + pontuacao2 + "");
                   System.out.println("___________________________________________________________________________________________________");
                   System.out.println("");
                   System.out.println("___________________________________________________________________________________________________");
                   System.out.println("                                                            ");
                   System.out.println("                                             Tabuleiro de jogadas - " + jogador1 + "               ");
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
                    System.out.println("                                          - Pontuação: " + jogador1 + " - " + pontuacao1 + " X " + pontuacao2 + "");
                    System.out.println("___________________________________________________________________________________________________");
                    System.out.println("");
                    System.out.println("___________________________________________________________________________________________________");
                    System.out.println("                                                            ");
                    System.out.println("                                             Tabuleiro de jogadas - " + jogador1 + "               ");
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


                    System.out.println("\n         - Passou a vez para o " + jogador2 + "...");


                    jogada = false;


                }



                }



                if (!jogada) {


                    System.out.println("");
                    System.out.println("___________________________________________________________________________________________________");
                    System.out.println("                                                            ");
                    System.out.println("                                        Jogando - " + jogador2 + "               ");
                    System.out.println("___________________________________________________________________________________________________");
                    System.out.println("");
               
                    System.out.println("\n         - " + jogador2 + " ,digite o número da linha para atirar");
                    linha = ler.nextInt();
                    System.out.println("\n         - " + jogador2 + " ,digite a letra da coluna para atirar");
                    String letra = ler.next().toUpperCase();
                    String letras = "ABCDEFGHIJ";
                    coluna = letras.indexOf(letra);
                    if (tabuleiroV2[linha][coluna].equals("X")) {

                        System.out.println("\n         - Essa posição já foi jogada...");
                        System.out.println("\n         - Jogue novamente");
                        jogada = true;


                    } else if (tabuleiro1[linha][coluna].equals("O")) {
                        pontuacao2++;
                        tabuleiroV2[linha][coluna] = "X";
                        System.out.println("\n         - Parabéns!!! Você acertou!");
                        System.out.println("");
                        System.out.println("___________________________________________________________________________________________________");
                        System.out.println("                                                            ");
                        System.out.println("                                        - Pontuação: " + jogador2 + " - " + pontuacao2 + " X " + pontuacao1 + "");
                        System.out.println("___________________________________________________________________________________________________");
                        System.out.println("");
                        System.out.println("___________________________________________________________________________________________________");
                        System.out.println("                                                            ");
                        System.out.println("                                           Tabuleiro de jogadas - " + jogador2 + "               ");
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
                    if (tabuleiroV2[linha][coluna].equals("#")) {

                        System.out.println("\n         - Essa posição já foi jogada...");
                        System.out.println("\n         - Jogue novamente");
                        jogada = true;


                    } else if (tabuleiro1[linha][coluna].equals(".")) {
                        tabuleiroV2[linha][coluna] = "#";
                        System.out.println("\n         - Que pena!!! Você errou!");
                        System.out.println("");
                        System.out.println("___________________________________________________________________________________________________");
                        System.out.println("                                                            ");
                        System.out.println("                                        - Pontuação: " + jogador2 + " - " + pontuacao2 + " X " + pontuacao1 + "");
                        System.out.println("___________________________________________________________________________________________________");
                        System.out.println("");
                        System.out.println("___________________________________________________________________________________________________");
                        System.out.println("                                                            ");
                        System.out.println("                                           Tabuleiro de jogadas - " + jogador2 + "               ");
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
                        System.out.println("\n         - Passou a vez para o " + jogador1 + "...");
                        jogada = true;


                    }





            }


        }while(pontuacao1 < 20 && pontuacao2 < 20);


        if (pontuacao1 == 20) {
            System.out.println("\n         - " + jogador1 + " acertou 20 pontos!");
            System.out.println("___________________________________________________________________________________________________");
            System.out.println("                                                 ");
            System.out.println("                                             VENCEDOR                 ");
            System.out.println("                                              - " + jogador1 + " -          ");
            System.out.println("___________________________________________________________________________________________________");

        }
        if (pontuacao2 == 20) {
            System.out.println("\n         - " + jogador2 + " acertou 20 pontos!");
            System.out.println("___________________________________________________________________________________________________");
            System.out.println("                                                 ");
            System.out.println("                                             VENCEDOR                 ");
            System.out.println("                                              - " + jogador2 + " -          ");
            System.out.println("___________________________________________________________________________________________________");
        }
    } }