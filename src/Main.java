import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrameMain().setVisible(true);
//            }
//        });
        FrameMain frame = new FrameMain();
        frame.setVisible(true);
//        frame.setSize(600, 200);
//        Map<String, Integer> map = new TreeMap<>();
//        map.put("adafd", 1);
//        System.out.println(map);
        PrefixTree root = new PrefixTree(' ');
        root.insert("fafa");
        root.insert("fafa");
        root.insert("fafc");

        HashMap<String, Integer> map = new HashMap<>();

        root.getAllStrings("", map);
        System.out.println(map);
        System.out.println(root.containString("fafb"));
    }
}