package ex1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExercicioLayout implements ActionListener {

    private static JFrame jf;
    private static JPanel jp;
    private static JLabel jlCelsius;
    private static JLabel jlFahrenheit;
    private static JTextField jtfEntrada;
    private static JButton jbCalcular;

    public ExercicioLayout() {
        jf = new JFrame("Calculadora - Celsius to Fahrenheit");
        jp = new JPanel();
        jlCelsius = new JLabel("Temperatura em celsius");
        jtfEntrada = new JTextField();
        jlFahrenheit = new JLabel("A temperatura aparecerá aqui");
        jbCalcular = new JButton("Calcular");

        jp.setSize(600, 400);
        jp.setVisible(true);
        jp.add(jlCelsius);
        jtfEntrada.setColumns(25);
        jp.add(jtfEntrada);
        jp.add(jlFahrenheit);
        jbCalcular.addActionListener(this);
        jp.add(jbCalcular);
        jf.add(jp);
        jf.setSize(600, 400);
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == jbCalcular) {
                double temp = Integer.parseInt(jtfEntrada.getText());
                jlFahrenheit.setText(Double.toString(Utils.toFahrenheit(temp)));
            } else {
                System.out.println("Voce nao e o Dougras");
            }
        } catch (NumberFormatException nfe) {
            System.err.println("Porra.. Informe números..");
            JOptionPane.showMessageDialog(
                    jf,
                    "Entrada de dados inválida",
                    "Informe a temperatura em Celsius (apenas numeros)",
                    JOptionPane.ERROR_MESSAGE
            );
            jtfEntrada.setText("");
        }
    }
}
