package LinkedList;

import java.util.Comparator;

public class Main {

    public static void main(String[] args)
    {   
        Comparator<Integer> joao = Comparator.naturalOrder();
        PriorityQueue<Integer> trevis = new PriorityQueue<>(joao);
        trevis.add(15);
        trevis.add(3);
        trevis.add(8);
        while (trevis.size() > 0) {
            System.out.println(trevis.pool());
          }
       
    }
    
}
