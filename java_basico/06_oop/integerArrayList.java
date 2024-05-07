
public class integerArrayList
{
    private Integer[] vector;
    private Integer size;

    public integerArrayList(int size)
    {
        this.vector =  new Integer[size];
        this.size = size;
    }

    public void add(int value)
    {   
        int index = 0;

        for (int i = 0; i < this.vector.length; i++)
        {
            if (this.vector[i] != null)
            {
                index = i;
                
                if (index > this.size)
                {
                    Integer[] expanded_array = new Integer[2*this.size];
                    for (int j = 0; j < this.vector.length; i++)
                    {
                        expanded_array[j] = this.vector[i];
                        this.vector = expanded_array;
                        this.size = 2* this.size;
                    }
                }

                break;
            }
        }

        if (index == 0)
        {
            System.out.println("Invalid index");
        }
        else 
        {
            this.vector[index] = value;
        }   
        
        
    }


    public int size()
    {
        int count_size = 0;

        for (int i = 0; i < this.vector.length; i++)
        {
            if (this.vector[i] != null)
            {
                count_size++;
            }
        }

        return count_size;
    }

    public Integer get(int index)
    {   
        try
        {
            return this.vector[index];
        }
        catch(ArrayIndexOutOfBoundsException e)
        {   
            System.out.println("Index out of range");
            return -1;
        }
        
    }

    public void set(int index, Integer value)
    {
        try
        {
            this.vector[index] = value;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {   
            System.out.println("Index out of range");            
        } 
    }

    public void clear()
    {
        Integer[] new_list = new Integer[size];
        this.vector = new_list;
    }

    public boolean isEmpty()
    {   
        int count = 0;
        boolean verification = true;
        for (int i = 0; i < this.vector.length; i++)
        {
            if (this.vector[i] != null)
            {
                count++;
            }            
        }

        if (count == 0)
            {   
                verification = true;
            }
            else if (count > 0)
            {
                verification = false;
            }

        return verification;
    }

    public boolean contains(Integer value)
    {
        int count = 0;
        boolean verification = true;

        for (int i = 0; i < this.vector.length; i++)
        {
            if (this.vector[i] == value)
            {
                count++;
            }
        }

        if (count == 0)
            {   
                verification = true;
            }
            else if (count > 0)
            {
                verification = false;
        }

        return verification;
    }

    public int indexOf(int value) 
    {   
        int count = 0;
        int index = 0;
        boolean verification = true;

        for (int i = 0; i < this.vector.length; i++)
        {

            if (this.vector[i] == value)
            {
                index = i;
                count++;
            }                  
        }

        if (count == 0)
            {
                System.out.println("Value out of range");
                return -1;
            }
            else if (count > 0)
            {
                return index;
            }  

    }

    public Integer[] clone()
    {
        Integer[] new_list = new Integer[size];

        for (int i = 0; i < this.vector[i])
        {
            new_list[i] = this.vector[i];
        }

        return new_list;
    }

}
