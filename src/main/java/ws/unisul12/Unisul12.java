
package ws.unisul12;
import javax.swing.JOptionPane;
public class Unisul12 {

    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
        
        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, num1 + " é maior");
        }
        else if (num1 == num2) {
            JOptionPane.showMessageDialog(null, num1 + " é igual a " + num2);
        }
        else {
            JOptionPane.showMessageDialog(null, num2 + " é maior");
        }
    }
}
