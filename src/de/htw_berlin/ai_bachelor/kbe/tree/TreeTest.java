package de.htw_berlin.ai_bachelor.kbe.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;


public class TreeTest {
	public static void main(String... a) {
            Tree tree = new Tree<Integer> (1, new Tree<Integer> (23,new Tree<Integer>(65,null,null),null),new Tree<Integer>(42,null,null));
            System.out.println("Exportet Tree: " + export(tree));
            System.out.println("Sum: " + TreeSum.sum(tree));
            Collection<Integer> filteredElements = filterElements(new ComparePredicate<Integer>(20,50),tree);
            
            System.out.println("Filtered Elements:");
            System.out.println(Arrays.toString(filteredElements.toArray()));
        }
        
        private static  String export(Tree tree) {
            LinkedList<Tree> toRead = new LinkedList<Tree>();
            LinkedList<String> resultArray= new LinkedList<String>();
            
            toRead.add(tree);
            
            while (!toRead.isEmpty()) {
                Tree currentNode = toRead.removeFirst();
                resultArray.add(currentNode.getValue().toString());
                if (currentNode.getLeft()!=null) {
                toRead.add(currentNode.getLeft());
                }
                if (currentNode.getRight()!=null) {
                    toRead.add(currentNode.getRight());
                }
            }
            
            return Arrays.toString(resultArray.toArray());
        }
        
        private static <V extends Comparable<V>> Collection<V> filterElements(ComparePredicate<V> cp, Tree<V> tree) {
            LinkedList<Tree<V>> toRead = new LinkedList<Tree<V>>();
            Collection<V> result = new ArrayList<V>();
            toRead.add(tree);
            
            while (!toRead.isEmpty()) {
                Tree currentNode = toRead.removeFirst();
                if (cp.isOk(currentNode)) {
                    result.add((V)currentNode.getValue());
                }
                
                if (currentNode.getLeft()!=null) {
                    toRead.add(currentNode.getLeft());
                }
                if (currentNode.getRight()!=null) {
                    toRead.add(currentNode.getRight());
                }
            }
            
            return result;
        }
		
}
