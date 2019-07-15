package comp2100.jml;

public class BinarySearchTree {

    private /*@ spec_public; nullable @*/ Node root;    // Root node
    private /*@ spec_public @*/ int height;

    public class Node{
        protected /*@ spec_public @*/ int _value;      // Node value
        protected /*@ spec_public; nullable @*/ Node _left;      // Left child
        protected /*@ spec_public; nullable @*/ Node _right;     // Right child
        protected /*@ spec_public; nullable @*/ Node _parent;    // Parent node

        public Node(int key){
            this._value = key;
            this._left = null;
            this._right = null;
            this._parent = null;
        }

        /*@ pure @*/
        public int getKey() {
            return _value;
        }

        public String toString() {
            return Integer.toString(_value);
        }
    }

    public BinarySearchTree() {
        root = null;
        height = 0;
    }

    /*@ 
        normal_behaviour
            requires key >= 0 && key <= 100;
        also
        exceptional_behaviour
            requires key > 100 || key < 0;
            signals (IllegalArgumentException) true;
    @*/
    public boolean find(int key) throws IllegalArgumentException {
        // TODO: implement find function which satisfies JML specification
        return false;
    }

    // TODO: write pre-condition of _insert
    /*@
    @*/
    private void _insert(BinarySearchTree bst, Node z) {
        /*@ nullable @*/ Node y = null;
        /*@ nullable @*/ Node x = bst.root;

        // find the position to insert.
        while (x != null) {
            y = x;
            
            if (z._value < x._value)
                x = x._left;
            else
                x = x._right;
        }

        z._parent = y;
        if (y==null)
            bst.root = z;
        else {
            if (z._value < y._value)
                y._left = z;
            else
                y._right = z;
        }
    }

    // TODO: write post-condition of insert
    /*@
    @*/
    public void insert(int key) {
        _insert(this, new Node(key));
        height = computeHeight(root);
    }
    
    //@ pure;
    private static int max(int a, int b) {
        return a > b ? a : b;
    }
    
    //@ measured_by \not_specified;
    //@ requires true;    
    private int computeHeight(Node tree) {
        if (tree != null)
            return 1 + max(computeHeight(tree._left), computeHeight(tree._right));
        return 0;
    }

    //@ pure;
    public int getHeight() {
        return height;
    }

    //@ measured_by height;
    //@ requires true;
    private String nlr(Node tree) {
        if(tree != null) {
            String result = Integer.toString(tree._value);
            String leftResult = nlr(tree._left);
            String rightResult = nlr(tree._right);
            if(!leftResult.equals("")) {
                result += " " + leftResult;
            }
            if(!rightResult.equals("")) {
                result += " " + rightResult;
            }
            return result;
        }
        return "";
    }

    public String nlr() {
        return nlr(root);
    }

}
