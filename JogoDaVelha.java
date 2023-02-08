import java.util.Scanner;

public class JogoDaVelha{
    public static void main(String[] args){
        Boolean game = true;
        char simboloAtual = 'X';
        String vitoria = "";

        Scanner scan = new Scanner(System.in);

        Campo[][] velha = new Campo[3][3];

        while (game){
            desenhaJogo(velha);
            vitoria = verificaVitoria(velha);
            if(!vitoria.equals("")){
                System.out.printf("Jogador %s Ganhou!", vitoria);
                break;
            }
            try{

            } catch(Exception e){
                System.out.println("Erro");
            }
        }
        System.out.println("Fim de Jogo");
    }

    public static void desenhaJogo(Campo[][] velha){
        //limparTela()
        System.out.printf("     0    1    2%n");
        System.out.printf("0    %c | %c | %c%n", velha[0][0].getSimbolo(), velha[0][1].getSimbolo(), velha[0][2].getSimbolo());
        System.out.println("--------------------------");
        System.out.printf("0    %c | %c | %c%n", velha[1][0].getSimbolo(), velha[1][1].getSimbolo(), velha[1][2].getSimbolo());
        System.out.println("--------------------------");
        System.out.printf("0    %c | %c | %c%n", velha[2][0].getSimbolo(), velha[2][1].getSimbolo(), velha[2][2].getSimbolo());
    }

    public static void limparTela(){
        for(int cont=0; cont<200;cont++){
            System.out.println("");
        }
    }

    public static Boolean verificaJogada(Campo[][] velha, int[] p, char simboloAtual){
        if(velha[p[0]][p[1]].getSimbolo() == ' '){
            velha[p[0]][p[1]].setSimbolo(simboloAtual);
            return true;
        } else{
            System.out.println("Escolha uma posicao vazia!");
            return false;
        }
    }

    public static String verificaVitoria(Campo[][] velha){
        int[] valorX = new int[6];
        String resultado = "";
        
        for(int l=0; l<3; l++){
            for(int c=0; c<3; c++){
                if(velha[l][c].getSimbolo() == 'X'){
                    countX++;
                }
            }
        }
    }
}