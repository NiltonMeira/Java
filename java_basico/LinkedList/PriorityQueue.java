package LinkedList;

import java.util.Comparator;

public class PriorityQueue<E> {

    private LinkedList<E> queue;
    private Comparator<E> cmp;
    private Integer size;


    public PriorityQueue(Comparator<E> comparator)
    {
        this.queue = new LinkedList<>();
        this.cmp = comparator;
        this.size = 0; 

    }

    public void add(E data)
    {
        int listSize = queue.getSize();

        if(listSize == 0)
        {
            queue.addFirst(data);
            return;
        }

        for (int i = 0; i < listSize; i++)
        {
            if (cmp.compare(data, queue.get(index)) >= 0)
            {
                queue.add(i, data);
                return;
            }
        }
        queue.addLast(data);

        size++;
    }

    public E peek()
    {
        return queue.getFirst();
    }

    public E pool()
    {   
        
        return queue.removeFirst();
        
    }

    public Integer size()
    {
        return queue.getSize();
    }   

    
}


    
