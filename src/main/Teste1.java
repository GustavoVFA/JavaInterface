
package main;
import javax.swing.JOptionPane;

public class Teste1 {
    public static void main(String []args){
      atv2(args);
        
    }
    
    public static void atv1(String []args){
      String n = JOptionPane.showInputDialog(null, "Digite a Primeira Nota");
      double nota1 = Double.parseDouble(n);
      
      n = JOptionPane.showInputDialog(null, "Digite a Segunda Nota");
      double nota2 = Double.parseDouble(n);
      
      n = JOptionPane.showInputDialog(null, "Digite a Terceira Nota");
      double nota3 = Double.parseDouble(n), t;
      
      t = (nota1+nota2+nota3)/3;
      
      JOptionPane.showMessageDialog(null, "A média das Notas é: " + String.format("%.2f",t));
    }
    
    public static void atv2(String []args){
        String kg = JOptionPane.showInputDialog(null, "Digite seu peso em (kgs)");
        double kgs = Double.parseDouble(kg);
        String h = JOptionPane.showInputDialog("Digite sua altura");
        double h2 = Double.parseDouble(h);
        double imc = (kgs/(h2*h2));
        
        if(imc < 18.5){
            JOptionPane.showMessageDialog(null, "Abaixo do peso Normal"
                    + "\nIMC: " + String.format("%.2f",imc), "Perigo",0);
        }else if(imc <= 24.9){
            JOptionPane.showMessageDialog(null, "Peso Normal\n"
                    + "IMC: " + String.format("%.2f",imc),"OK",1);
        }else if(imc <= 29.9){
            JOptionPane.showMessageDialog(null, "Excesso de Peso"
                    + "\nIMC: " + String.format("%.2f",imc),"Atenção",2);
        }else if(imc <= 34.9){
            JOptionPane.showMessageDialog(null, "Obesidade Classe I"
                    + "\nIMC: " + String.format("%.2f",imc),"Perigo I",0);
        }else if(imc <= 39.9){
            JOptionPane.showMessageDialog(null, "Obesidade Classe II"
                    + "\nIMC: " + String.format("%.2f",imc),"Perigo II",0);
        }else{
            JOptionPane.showMessageDialog(null, "Obesidade Classe III"
                    + "\nIMC: " + String.format("%.2f",imc),"Perigo III",0);
        }
        
    }
}
