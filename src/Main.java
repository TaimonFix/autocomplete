import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;


public class Main {
    public static void main(String[] args) {
//        Locale.setDefault(Locale.ROOT);
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrameMain().setVisible(true);
//            }
//        });
//        Map<String, Integer> map = new TreeMap<>();
//        map.put("adafd", 1);
//        System.out.println(map);
        PrefixTree root = new PrefixTree(' ');

        root.insert("fafa");


        Map<String, Integer> extracted = new HashMap<>();

        root.getAllStrings("", extracted);
        System.out.println(extracted);

        root.insert("bncg");
        root.insert("fafa");
        root.insert("fhbc");



        root.getAllStrings("", extracted);
        System.out.println(extracted);

    }
}