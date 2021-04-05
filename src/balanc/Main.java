package balanc;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	RedBlackTree<Integer> tree = new RedBlackTree<>();

	long time = System.nanoTime();
	fillStep(tree);
	System.out.println("Час заповнення послідовними - " + (System.nanoTime() - time));


	RedBlackTree<Integer> tree1 = new RedBlackTree<>();

	time = System.nanoTime();
	fillRandom(tree1);
	System.out.println("Час заповнення випадковими - " + (System.nanoTime() - time));

	time = System.nanoTime();
	tree1.contains(67);
	System.out.println("Час пошуку елемента - " + (System.nanoTime() - time));

	time = System.nanoTime();
	tree1.remove(67);
	System.out.println("Час видалення елемента - " + (System.nanoTime() - time));

}





	public static void fillStep(RedBlackTree<Integer> a){
		for(int i = 0; i < 1000; i++){
			a.add(i);
		}
	}

	public static void fillRandom(RedBlackTree<Integer> a){
		Random rand = new Random();
		for (int i = 0; i < 1000; i++) {
			a.add(rand.nextInt(100000));
		}
	}
}
