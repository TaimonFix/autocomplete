import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Objects;

public class FrameMain extends JFrame {
    private JTextField textFieldWord;
    private JButton buttonGo;
    private JPanel panelMain;
    private JScrollPane jScrollPane;

    public FrameMain() {
        this.setLocationRelativeTo(null);
        this.setTitle("Префиксное дерево");
        this.setContentPane(panelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.pack();

        this.setSize(600, 250);
        buttonGo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HashMap<String,Integer> map = new HashMap<>();
                map.put("asefa", 1);
                System.out.println(textFieldWord.getText());
                jScrollPane.add(textFieldWord);

            }
        });


        jScrollPane.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (textFieldWord.getText().length() > 1) {
                    System.out.println(textFieldWord.getText());
                }
                super.keyTyped(e);


            }
        });
    }
}

