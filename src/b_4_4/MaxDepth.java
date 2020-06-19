package b_4_4;

import com.sun.org.apache.xpath.internal.objects.XNodeSet;

import java.util.ArrayList;
import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
public class MaxDepth {
    int res=0;
    public int maxDepth(Node root) {
        get(root,1);
        return res;
    }
    public void get(Node node,int len){
        if(node==null)return;
        else {
            len++;
            for(Node tem:node.children){
                get(tem,len);
            }
            System.out.println(len+" "+res);
            if(len>res)res=len;
        }
    }
}
