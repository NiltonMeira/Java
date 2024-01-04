package LinkedList;

public class LinkedList<E>{

    private LinkedListItem<E> first;
    private LinkedListItem<E> last;
    private int size;

    public LinkedList()
    {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public LinkedListItem<E> getItem(int index)
    {
       LinkedListItem<E> current = first;
        for (int i=0; i < index; i++)
        {
            current = current.getNext();
        }
        return current;     
    }
    
    public E get(int index)
    {
        LinkedListItem<E> current = first;
        for (int i=0; i < index; i++)
        {
            current = current.getNext();
        }
        return current.getValue();
    }

    public void add(int index, E data)
    {
        if (first == null) 
        {
            addFirst(data);
        } 
        else if (index == size -1)  
        {   
            addLast(data);
        }
        else 
        {   
            LinkedListItem<E> newItem = new LinkedListItem<E>(data);
            LinkedListItem<E> previews = getItem(index-1);
            LinkedListItem<E> current = previews.getNext();

            previews.setNext(newItem);            
            newItem.setNext(current);
        } 
            
        size++;
    }

    public void remove(int index)
    {
        LinkedListItem<E> current = first;
        for (int i = 0; i < index - 1; i++) 
        {
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        size--;
        // return current.getValue();   
    }

    public int getSize()
    {
        return size;
    }

    public E getFirst()
    {
        return first.getValue();
    }

    public E getLast()
    {
        return last.getValue();
    }

    public void addFirst(E data)
    {
        LinkedListItem<E> newItem = new LinkedListItem<>(data);
        if (first == null) {
            first = newItem;
            last = newItem;
        } 
        else 
        {
            newItem.setNext(first);
            first = newItem;
        }
        size++;
    } 

    public void addLast(E data)
    {   
        LinkedListItem<E> newItem = new LinkedListItem<>(data);
        if(last == null)
        {
            first = newItem;
            last = newItem;
        }
        else
        {
            last.setNext(newItem);
            last = newItem;
        } 
        size++;       
    }

    public E removeFirst()
    {   
        E value = first.getValue();
        if(first == last)
        {
            first = null;
            last = null;
        }
        else
        {
            first = first.getNext();            
        }
        size --;
        return value;
        
    }

    public E removeLast()
    {    
        E value = first.getValue();
        if(first == last)
        {
            first = null;
            last = null;
        }
        else
        {   
            LinkedListItem<E> current = first;
            for (int i = 0; i < size - 2; i++) 
            {
                current = current.getNext();               
            }
            last = current;
        }
        size--;
        return value;     
    }
}



