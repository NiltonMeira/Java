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
        if(queue.getSize() == 0)
        {
            queue.addLast(data);
        }
        else
        {
            int index = 0;
            while (index < queue.getSize() && cmp.compare(data, queue.get(index)) >= 0 ) 
            {
                index++;
            }
            if (index != queue.getSize()-1)
                queue.add(index, data);
            else
                queue.addLast(data);    
        }
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


    
