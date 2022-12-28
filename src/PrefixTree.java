import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PrefixTree {
    char value;
    int k;
    List<PrefixTree> children;

    public PrefixTree(char value) {
        this.value = value;
    }

    public void insert(String word) {
        int length = word.length();

        if (length == 0) {
            k++;
            return;
        }

        if (children == null) {
            children = new ArrayList<>();
        }

        char c = word.charAt(0);

        PrefixTree child = findNodeByChar(c);

        if (child == null) {
            child = new PrefixTree(c);
            children.add(child);
        }
        child.insert(word.substring(1));
    }

    protected PrefixTree findNodeByChar(char c) {
        if (children != null) {
            for (PrefixTree node : children) {
                if (node.value == c) {
                    return node;
                }
            }
        }
        return null;
    }


    protected boolean containString(String str) {
        PrefixTree current = this;
        for (int i = 0; i < str.length(); i++) {
            current = current.findNodeByChar(str.charAt(i));
            if (current == null) {
                return false;
            }
        }
        return true;
    }

    public void getAllStrings(String path, Map<String, Integer> result) {

        if (value != ' ') {
            path = path + value;
        }
        if (children != null) {
            for (PrefixTree node: children) {
                node.getAllStrings(path, result);
            }
        } else {
            result.put(path, k);
        }
    }

//    List<String> autoComplete(String prefix) {
//        PrefixTree node = this;
//        List<String> res = new ArrayList<String>();
//        for (char ch: prefix.toCharArray()) {
//            node = children.get(ch);
//            if (node == null)
//                return new ArrayList<String>();
//        }
//        helper(node, res,  prefix.substring(0, prefix.length()-1));
//        return res;
//    }
//
//    private void helper(PrefixTree node, List<String> res, String prefix) {
//        if (node == null ) //base condition
//            return;
//        if (children == null)
//            res.add(prefix + node.value);
//        for (PrefixTree child: children)
//            helper(child, res, prefix + node.value);
//    }
}
