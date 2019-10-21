package datastruct;

import java.util.Objects;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2019/2/28
 **/
public class tree {

    private Node root;

    public class Node {
        int iData;
        double dData;
        Node leftChild;
        Node rightChild;

        public Node(int iData, double dData, Node leftChild, Node rightChild) {
            this.iData = iData;
            this.dData = dData;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }

        public void displayNode() {
            System.out.println("{" + iData + ", " + dData +  "}");
        }

        public Node find(int key) {
            if (Objects.isNull(root)) {
                return null;
            }
            Node current = root;
            while (current.iData != key) {
                if (key < current.iData) {
                    current = current.leftChild;
                } else {
                    current = current.rightChild;
                }

                if (current == null) {
                    return null;
                }
            }
            return current;
        }

        private void inOrder(Node localRoot) {
        }
    }
}
