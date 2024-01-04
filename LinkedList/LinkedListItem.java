package LinkedList;

public class LinkedListItem<E>
    {
    private E value;
    private LinkedListItem<E> next;

    public LinkedListItem(E value)
    {
        this.value = value;
        this.next = null;
    }

    public E getValue()
    {
        return value;
    }

    public void setValue(E val)
    {
        value = val;
    }
    
    public LinkedListItem<E> getNext()
    {
        return next;
    }

    public void setNext(LinkedListItem<E> val)
    {
        next = val;
    }
    }
