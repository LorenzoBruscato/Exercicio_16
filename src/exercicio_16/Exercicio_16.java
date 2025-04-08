package exercicio_16;

import javax.swing.JOptionPane;


public class Exercicio_16 {

    public static void main(String[] args) {
        int controle;
        int r, x, y;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite o  segundo numero"));
        controle = Integer.parseInt(JOptionPane.showInputDialog("Você concorda com os termos?" + "\n 1 - adição \n 2 - subtração \n 3 - Multiplicação \n 4 - Divisão"));
        switch (controle) {
            case 1:
                r = x + y;
                JOptionPane.showMessageDialog(null, "A sua soma deu: " + r);
                break;
            case 2:
                r = x - y;
                JOptionPane.showMessageDialog(null, "A sua subtração deu: " + r);
                break;
            case 3:
                r = x * y;
                JOptionPane.showMessageDialog(null, "A sua multiplicação deu: " + r);
                break;
            case 4:
                r = x / y;
                JOptionPane.showMessageDialog(null, "A sua divisão deu: " + r);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção invalida");
                break;
        }

    }
}