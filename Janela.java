import java.awt.Color;
import java.awt.Font;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;

public class Janela{
    public static void main(String[]args){

        JButton button = new JButton("Clique aqui se vc for gay");
        JLabel label = new JLabel("Primeira interface",JLabel.CENTER);
        label.setFont(new Font("Calibri",Font.BOLD, 50));
        //label.setForeground(Color.white); --> Cor da fonte
        

        //Janela
        JFrame janela = new JFrame();
        janela.add(label);
        //janela.add(button);
        janela.setVisible(true);
        janela.setSize(800,500);
        janela.getContentPane().setBackground(new Color(30,30,50));
    }
}