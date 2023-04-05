package main;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        //Caixa de Mensagem
        // JOptionPane.showMessageDialog(null,"Olá Casada !", "", 3);
        //Caixa de Entrada
       String x = JOptionPane.showInputDialog(null, "Digite um Valor");
       double valor = Integer.parseInt(x);
       
       JOptionPane.showMessageDialog(null, "Valor digitado "+ x);
    }
}