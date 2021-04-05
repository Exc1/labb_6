package unbalance;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();

        long time = System.nanoTime();
        fillStep(tree);
        System.out.println("Час заповннення послідовними - " + (System.nanoTime() - time));

        Tree tree1 = new Tree();
        time = System.nanoTime();
        fillRandom(tree1);
        System.out.println("Час заповнення випадковими - " + (System.nanoTime() - time));

        time = System.nanoTime();
        tree.findNodeByValue(10225);
        System.out.println("Час пошуку елемента - " + (System.nanoTime() - time));

        time = System.nanoTime();
        tree.deleteNode(10225);
        System.out.println("Час видалення елемента - " + (System.nanoTime() - time));

    }

    public static void fillStep(Tree tree){
        for(int i = 0; i < 1000; i++){
            tree.insertNode(i);
        }
    }

    public static void fillRandom(Tree tree){
        Random rand = new Random();
        for (int i = 0; i < 1000; i++) {
            tree.insertNode(rand.nextInt(100000));
        }
    }
}
