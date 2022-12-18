import java.util.ArrayList;
import java.util.List;

public class PrefixTree {
    char value;
    List<PrefixTree> children;

    public PrefixTree(char value) {
        this.value = value;
    }

    public void insert(String data) {
        if (data.length() == 0)
            return;
        if (children == null) {
            children = new ArrayList<>();
        }

        char c = data.charAt(0);
        PrefixTree child = findNodeByChar(c);

        if (child == null) {
            child = new PrefixTree(c);
            children.add(child);
        }
        child.insert(data.substring(1));

    }

    private PrefixTree findNodeByChar(char c) {
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
}
