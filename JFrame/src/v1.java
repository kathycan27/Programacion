import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class v1 {
    private JPanel panel1;
    private JButton button1;
    private JTextField altura;
    private JTextField peso;
    private JLabel labelRespuesta;
    private JLabel calcular;

    public v1() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                labelRespuesta.setText(String.valueOf(Double.parseDouble(peso.getText())));
            }
        });
        peso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double
                peso.setText(String.valueOf(Double.parseDouble(peso.getText())));
            }
        });
        altura.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                altura.setText(String.valueOf(Double.parseDouble(altura.getText())));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame =new JFrame("v1");

        frame.setContentPane(new v1().panel1);
        frame.setSize(250,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



    }
}
