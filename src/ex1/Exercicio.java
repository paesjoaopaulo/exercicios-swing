package ex1;

import javax.swing.SwingUtilities;

public class Exercicio {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ExercicioLayout();
            }
        });
    }

}
