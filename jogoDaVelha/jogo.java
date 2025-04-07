import java.util.Scanner;
import javax.swing.JOptionPane;



public class jogo {


        static char[][] tabuleiro = {
            {'1','2','3'},
            {'4','5','6'},
            {'7','8','9'}
        };
    
        static String jogador1;
        static String jogador2;
    
        public static void menu() {
            char tecla;
            String menu = "*** Jogo Da Velha ***\n1 - Começar jogo\n2 - Sair";
            String opcao;
    
            do {
                opcao = JOptionPane.showInputDialog(null, menu);
                tecla = opcao.charAt(0);
    
                switch (tecla) {
                    case '1':
                        jogador1 = JOptionPane.showInputDialog("Nome do Jogador 1 (X):");
                        jogador2 = JOptionPane.showInputDialog("Nome do Jogador 2 (O):");
    
                    
                        JOptionPane.showMessageDialog(null, "O jogo será iniciado!");
                        return; // vai para o jogo
                    case '2':
                        JOptionPane.showMessageDialog(null, "Programa Finalizado");
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção Inválida");
                        break;
                }
            } while (true);
        }
    
        public static void jogoDaVelha() {

            mostrarTabuleiro();
      
    
            System.exit(0); // finaliza o programa
        }
    
        public static void mostrarTabuleiro() {
            String tab = "";
            for (int i = 0; i < 3; i++) {
                tab += " " + tabuleiro[i][0] + " | " + tabuleiro[i][1] + " | " + tabuleiro[i][2];
                if (i < 2) tab += "\n-----------\n";
            }
            JOptionPane.showMessageDialog(null, tab);
        }
    
       // public static boolean verificarVitoria(char jogador) {}
    
        public static void main(String[] args) {
            menu();        
            jogoDaVelha();  
        }
    }
    