import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class FrameMain extends JFrame {
    private JTextField textFieldWord;
    private JButton buttonGo;
    private JPanel panelMain;
    private JScrollPane jScrollPane;
    private JLabel label1;

    public FrameMain() {
        this.setLocationRelativeTo(null);
        this.setTitle("Префиксное дерево");
        this.setContentPane(panelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.pack();

        this.setSize(600, 250);

        HashMap<String,Integer> map = new HashMap<>();
        HashMap<String,Integer> map1 = new HashMap<>();
        PrefixTree trie = new PrefixTree(' ');
        PrefixTree trie1 = new PrefixTree(' ');



        buttonGo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                trie.insert(textFieldWord.getText());
                trie.getAllStrings("", map);
                System.out.println(map);

            }
        });


        textFieldWord.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                System.out.println(textFieldWord.getText());
                label1.setText(textFieldWord.getText());
                String prefix = textFieldWord.getText();

                HashMap<String,Integer> map1 = new HashMap<>();
                PrefixTree trie1 = new PrefixTree(' ');

                if (map.size() > 0) {
                    for (int i = 0; i < prefix.length(); i++) {
                        trie1 = trie.findNodeByChar(prefix.charAt(i));
                    }
                    if (trie1 != null) {
                        trie1.getAllStrings("", map1);
                        label1.setText("auto:" + map1);
                    }
                }
            }
        });
    }
}

