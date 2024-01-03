package stack;

public class Stack<E> {

    private Object[] arr;
    private Integer size;

    public Stack()
    {
    size = 0;
    arr = new Object[10];
    }

    public boolean empty()
    {
       return size == 0;
    }

    public void push(E value)
    {   
        if (size == arr.length)
        {
            Object[] newArr = new Object[2 * arr.length];
            for (int i = 0; i < arr.length; i++)            
                newArr[i] = arr[i];
            arr = newArr;
        }
        arr[size] = value;
        size++;
    }

    public E peek()
    {
       return (E)arr[size-1];
    } 
    
    public E pop()
    {
        var removedValue = arr[size];
        arr[size] = null;
        size--;
        return  (E)removedValue;
    }

    public int search(Object value) 
    {   
        int index_num = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == value)
            {
                index_num = i;                
            }
        }

        return arr.length - index_num;      
    }
}
