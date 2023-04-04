
package main;
import javax.swing.JOptionPane;

public class Teste1 {
    public static void main(String []args){
      atv1(args);
        
    }
    
    public static void atv1(String []args){
        String n = JOptionPane.showInputDialog(null, "Digite a Primeira Nota");
      double nota1 = Double.parseDouble(n);
      
      n = JOptionPane.showInputDialog(null, "Digite a Segunda Nota");
      double nota2 = Double.parseDouble(n);
      
      n = JOptionPane.showInputDialog(null, "Digite a Terceira Nota");
      double nota3 = Double.parseDouble(n), t;
      
     t = (nota1+nota2+nota3)/3;
      
      JOptionPane.showMessageDialog(null, "A média das Notas é: "+t);
    }
}
