import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Menu extends JFrame {

    JMenuBar barra = new JMenuBar();

    JMenu menu1 = new JMenu("File");
    JMenu menu2 = new JMenu("Edit");
    JMenu menu3 = new JMenu("Exit");

    public JButton botao1 = new JButton("Criar nova conta");
    public JButton botao2 = new JButton("Dados da conta");
    public JButton botao3 = new JButton("Sacar");
    public JButton botao4 = new JButton("Depositar");
    public JButton botao5 = new JButton("Dados da Conta");
    public JButton botao6 = new JButton("Sair");
    

    JLabel label = new JLabel("Digite o numero da sua conta");

   


    JMenuItem item1 = new JMenuItem("Sair");

    public Menu() {

        setJMenuBar(barra);

        /*barra.add(menu1);
        barra.add(menu2);
        barra.add(menu3);
        menu3.add(item1);*/

        

        barra.add(botao1);
        barra.add(botao2);
        barra.add(botao3);
        barra.add(botao4);
        barra.add(botao5);
        barra.add(botao6);


        botao1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
              
                

            }
        });

        setTitle("Menu");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Menu();
    }
}
