import javax.swing.*;
import java.awt.*;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMain().setVisible(true);
            }
        });
//        Map<String, Integer> map = new TreeMap<>();
//        map.put("adafd", 1);
//        System.out.println(map);
        PrefixTree root = new PrefixTree(' ');
        root.insert("fafa");
        root.insert("fafb");
        root.insert("fafc");
        System.out.println(root.containString("fafb"));
    }
}