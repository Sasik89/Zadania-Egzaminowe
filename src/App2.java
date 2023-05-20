public class App2 {

    public static void main(String[] args) {

        Tree binnaryTree = new Tree();
        binnaryTree.add(6);
        binnaryTree.add(4);
        binnaryTree.add(8);
        binnaryTree.add(3);
        binnaryTree.add(5);
        binnaryTree.add(7);
        binnaryTree.add(9);

        System.out.println(binnaryTree.max());
        System.out.println(binnaryTree.min());
        System.out.println(binnaryTree.contains(3));


    }

}
