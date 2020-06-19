package b_3_30;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个 N 叉树，返回其节点值的前序遍历。
 * 例如，给定一个 3叉树 :
 */
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
public class Preorder {
    public List<Integer> preorder(Node root) {
        List<Integer> list=new ArrayList<>();
        get(root,list);
        return list;
    }
    public void get(Node root,List<Integer> list) {
        if(root==null)return;
        else {
            list.add(root.val);
            for(Node node:root.children){
                get(node,list);
            }

        }

    }
}
