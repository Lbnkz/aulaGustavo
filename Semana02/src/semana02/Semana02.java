package semana02;

import java.util.Scanner;
import javax.swing.JOptionPane;
import views.PomodoroAdvanced;


public class Semana02 {


    public static void main(String[] args) {
        new PomodoroAdvanced().setVisible(true);
    }
    
    public static void metodoJoption(){
        String nome = JOptionPane.showInputDialog("Informe seu nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a sua idade?", "Idade", JOptionPane.INFORMATION_MESSAGE));
        
        int compartilhar = JOptionPane.showConfirmDialog(null, "Deseja compartilhar suas informações");
        switch (compartilhar) {
            case JOptionPane.YES_OPTION:
                System.out.println("Você vai compartilhar suas informações");
                break;
            case JOptionPane.NO_OPTION:
                System.out.println("Suas informações não serão compartilhadas");
                break;
            case JOptionPane.CANCEL_OPTION:
                System.out.println("Você nao autorizou compartilhamento, finalizamos por aqui!");
                System.exit(0);
            default:
                break;
        }
        
        
        int confirmar = JOptionPane.showConfirmDialog(null, "Deseja confirmar cadastro!", "Cadastro", JOptionPane.YES_NO_OPTION);
        if(confirmar == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "SEU CADASTRO DEU CERTO " + nome);
        }else if(confirmar == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "DEU BO, A CASA CAIU", "ERRROUUU", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void metodoScanner(){
        Scanner leitor = new Scanner(System.in);
        
        String nomeAlunos[] = new String[5];
        boolean situacaoAlunos[] = new boolean[5];
        Double alturaAlunos[] = new Double[5];
        int idadeAlunos[] = new int[5];
        
        
        for(int i = 0; i < 2; i++){
        
            System.out.print("Qual o seu nome: ");
            nomeAlunos[i] = leitor.nextLine();

            System.out.print("Voce estuda? ");
            situacaoAlunos[i] = leitor.nextBoolean();

            System.out.print("Qual a sua altura? ");
            alturaAlunos[i] = leitor.nextDouble();

            System.out.print("Qual a sua idade? ");
            idadeAlunos[i] = leitor.nextInt();
        }
        for(int i = 0; i < nomeAlunos.length; i++){
            System.out.println("Nome: "+nomeAlunos[i]+" Estuda: "+situacaoAlunos[i]+" Altura: "+alturaAlunos[i]+" Idade: "+idadeAlunos[i]);
        }
    }
}
