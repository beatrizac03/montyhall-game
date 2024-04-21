import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MontyHallGUI extends JFrame {
    private JFrame frame = new JFrame("Monty Hall Game");
    private JPanel panel = new JPanel();

    public MontyHallGUI() {
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        configurarComponentes();
        frame.setVisible(true);
    }

    public void configurarComponentes() {
        panel.setSize(500,500);
        panel.setLayout(null);

        JLabel labelDesc = new JLabel("Bem-vindo ao Monty Hall Game!");
        labelDesc.setBounds(140, 50, 500, 40);
        labelDesc.setFont(new Font("Roboto", Font.BOLD, 16));

        JButton buttonJogar = new JButton("Jogar");
        buttonJogar.setBounds(150, 200, 200, 40);

        JButton buttonExplic = new JButton("Como funciona?");
        buttonExplic.setBounds(150, 250, 200, 45);

        buttonJogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jogar();
            }
        });

        buttonExplic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comoJogar();
            }
        });

        panel.add(labelDesc);
        panel.add(buttonJogar);
        panel.add(buttonExplic);
        frame.add(panel);
    }

    public void jogar() {
        String portaEscolhida = JOptionPane.showInputDialog(null, "Escolha uma porta (1, 2 ou 3): ");
        int portaEscolhidaInt = Integer.parseInt(portaEscolhida);

        if(portaEscolhidaInt < 1 || portaEscolhidaInt > 3) {
            JOptionPane.showMessageDialog(null, "Porta escolhida inválida.");
        } else {
            Random random1 = new Random();
            int portaPremiada = random1.nextInt(3) + 1;
            int portaVazia = 6;

            for(int i = 1; i <= 3; i++){
                if(portaEscolhidaInt != i && portaPremiada != i) {
                    portaVazia = i;
                }
            }

            JOptionPane.showMessageDialog(null, "O apresentador abriu a porta " + portaVazia + " que está vazia.");
            String opcao = JOptionPane.showInputDialog(null, "Você gostaria de trocar de porta? (s/n): ");
            if ("s".equals(opcao)) {
                for(int j = 1; j <= 3; j++) {
                    if(portaVazia != j && portaEscolhidaInt != j) {
                        portaEscolhidaInt = j;  //
                    }
                }

                if(portaEscolhidaInt == portaPremiada) {
                    JOptionPane.showMessageDialog(null, "Você ganhou! Porta premiada: " + portaPremiada);
                } else {
                    JOptionPane.showMessageDialog(null, "Você perdeu! A porta premiada era a " + portaPremiada);
                }
            } else {
                if(portaEscolhidaInt == portaPremiada) {
                    JOptionPane.showMessageDialog(null, "Você ganhou!");
                } else {
                    JOptionPane.showMessageDialog(null, "Você perdeu! A porta premiada era a " + portaPremiada);
                }
            }
        }

    }

    public void comoJogar() {
        String message = "O jogo envolve 3 portas: a premiada (que está com o prêmio), " +
                "e outras duas portas. A porta premiada é escolhida aleatoriamente, depois, o usuário escolhe uma porta, e então, " +
                "é aberta uma porta vazia (não é a escolhida e nem a premiada). Em seguida, o jogador pode escolher trocar sua" +
                "escolha inicial pela outra porta ainda fechada.";

        JLabel labelMessage = new JLabel("<html>" + message + "</html>");
        labelMessage.setPreferredSize(new Dimension(400, 150));
        labelMessage.setHorizontalAlignment(SwingConstants.LEFT);
        labelMessage.setVerticalAlignment(SwingConstants.TOP);

        JOptionPane.showMessageDialog(null, labelMessage);
    }

    public static void main(String[] args) {
        new MontyHallGUI();
    }

}
