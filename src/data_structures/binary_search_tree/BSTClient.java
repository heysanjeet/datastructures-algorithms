package data_structures.binary_search_tree;

public class BSTClient {
    public static void main(String[] args) {
        BSTImpl bst = new BSTImpl();

        bst.insert(4, "Shivam");
        bst.insert(3, "Tiwari");
        bst.insert(2, "Sunil");
        bst.insert(1, "Sanjeet");
        bst.remove(4);//not working


        System.out.println(bst.findMax().key);

        System.out.println(bst.findMin().key);
    }
}
