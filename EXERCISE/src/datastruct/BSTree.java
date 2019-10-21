package datastruct;

import org.omg.CORBA.OBJ_ADAPTER;

import java.rmi.Remote;
import java.util.Objects;

/**
 * @description: 二叉查找树
 * @author: YF.Mao
 * @create: 2019/3/6
 **/
public class BSTree<K extends Comparable> {
    private BSTreeNode<K> root;

    static class BSTreeNode<K extends Comparable> {
        final K key;
        BSTreeNode<K> left;
        BSTreeNode<K> right;
        BSTreeNode<K> parent;

        public BSTreeNode(K key, BSTreeNode<K> left, BSTreeNode<K> right, BSTreeNode<K> parent) {
            this.key = key;
            this.left = left;
            this.right = right;
            this.parent = parent;
        }

        public K getKey() {
            return key;
        }
    }

    public void put(K key) {
        root = putNode(root, null, key);
    }

    private BSTreeNode putNode(BSTreeNode node, BSTreeNode parentNode, K key) {
        if (Objects.isNull(node)) {
            return new BSTree.BSTreeNode(key, null, null, parentNode);
        }
        if (node.key.compareTo(key) > 0) {
            node.left = putNode(node.left, node, key);
        } else if (node.key.compareTo(key) < 0) {
            node.right = putNode(node.right, node, key);
        }
        return node;
    }

    private void preOrderBSTree(BSTreeNode node) {
        if (!Objects.isNull(node)) {
            System.out.println(node.key.toString() + "  " + (Objects.isNull(node.parent) ? "根节点" : "父节点：" + node.parent.key));
            preOrderBSTree(node.left);
            preOrderBSTree(node.right);
        }
    }

    public void printBStree() {
        System.out.println("前序遍历");
        preOrderBSTree(root);
    }

    public void printInOrder() {
        System.out.println("中序遍历");
        inOrderBSTree(root);

    }

    /**
     * 创建有序的数据序列
     *
     */
    private void inOrderBSTree(BSTreeNode node) {
        if (!Objects.isNull(node)) {
            inOrderBSTree(node.left);
            System.out.println(node.key.toString() + "  " + (Objects.isNull(node.parent) ? "根节点" : "父节点：" + node.parent.key));
            inOrderBSTree(node.right);
        }
    }

    private boolean findNodeKey(BSTreeNode node, K key) {
        if (node != null) {
            if (node.key.compareTo(key) > 0) {
                return findNodeKey(node.left, key);
            } else if (node.key.compareTo(key) < 0) {
                return findNodeKey(node.right, key);
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public boolean findKey(K key) {
        return findNodeKey(root, key);
    }

    public static void main(String[] args) {
        BSTree<Integer> b = new BSTree<>();
        //System.out.println(args[0]);
        b.put(6);
        b.put(5);
        b.put(3);
        b.put(4);
        b.put(2);
        b.put(7);
        b.put(1);
        b.printBStree();
        b.printInOrder();
        System.out.println(b.findKey(6));
    }
}
