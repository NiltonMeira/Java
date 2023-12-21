import java.util.*;

class Main 
{

    final static int size = 8;

    public static void main(String[] args)
    {    
        
        Random random = new Random();

        int[] nums = new int[size]; 

        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = random.nextInt(256);
        }

        for (int i = 0; i < nums.length; i++)
        {
            System.out.println(nums[i]);
        }            
        
        ArrayList<Integer> resultado = comprimirArray(nums);
        System.out.println("Comprimido: ");
        for (int i: resultado)
        {
            System.out.println(i);
        }
        
        ArrayList<Integer> descomprimido = descomprimirArray(resultado);
        System.out.println("Descomprimido: ");
        for (int i: descomprimido)
        {
            System.out.println(i);
        }        

    }   

    public static ArrayList<Integer> comprimirArray(int[] nums)
    {   
        ArrayList<Integer> final_list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++)
        {   
            if (i % 2 == 0 )
            {
                nums[i] = nums[i] >> 4; //11111111 - 00001111
                nums[i] = nums[i] << 4; //11110000          
            }

            else if (i % 2 != 0)
            {
                nums[i] = nums[i] >> 4; //00001111
            }                
        }       
        
       for (int i = 0; i < nums.length; i++)
       {
            int indice = i;
            i++;
            int result = nums[indice] + nums[i];
            final_list.add(result);
            
       }

        return final_list;        
        
    }

    public static ArrayList<Integer> descomprimirArray(ArrayList<Integer> Array)
    {
        ArrayList<Integer> decompressed_list = new ArrayList<>();
    {   
        for (int i = 0; i < Array.size(); i++)
        {
            int var1 = Array.get(i) & 0b11110000;             

            int var2 = (Array.get(i) << 4) & 0b11110000;

            decompressed_list.add(var1);
            decompressed_list.add(var2);      
        }

        return decompressed_list;
       
    }
    }
}