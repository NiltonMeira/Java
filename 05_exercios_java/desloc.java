import java.util.*;

class Main 
{
    public static void main(String[] args)
    {    
        
        Random random = new Random();

        int[] nums = new int[2]; 

        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = random.nextInt(256);
        }

        for (int i = 0; i < nums.length; i++)
        {
            System.out.println(nums[i]);
        }
        
        for (int i = 0; i < nums.length; i++)
        {   
            if (nums[i] % 2 == 0 || nums[i] == 0)
            {
                nums[i] = nums[i] >> 4; 
                nums[i] = nums[i] << 4;    
            }

            else if (nums[i] % 2 != 0)
            {
                nums[i] = nums[i] >> 4; 
            }               
        }

        for (int i = 0; i < nums.length; i++)
        {
            System.out.println(nums[i]);
        }   
        
        String resultado = comprimirArray(nums);
        System.out.println("Resultado: ");
        System.out.println(resultado);
    }   

    public static String comprimirArray(int[] array)
    {   
        String[] string_bins = new String[2]; 

        for (int i = 0; i < array.length; i++)
        {  

            if (i % 2 == 0 || array[i] == 0)
            {
                String binario = Integer.toBinaryString(array[i]);
                String parte1 = binario.substring(0,4);  
                System.out.println(parte1);
                string_bins = append(string_bins, parte1);
            }

            else if (i % 2 != 0)
            {
                String binario = Integer.toBinaryString(array[i]);
                String parte2 = binario.substring(binario.length()-4);
                string_bins = append(string_bins, parte2);
                System.out.println("teste2: ");
            }        
        }  
        
        for(int i = 0 ; i < 2; i++)
        {
            System.out.println(string_bins[i]);
        }
        String resultado = string_bins[0].concat(string_bins[1]);

        return resultado;        
        
    }

    public static String[] append(String[] array, String elemento) 
    {
    int novoTamanho = array.length + 1;
    String[] novoArray = new String[novoTamanho];

    // Copiar os elementos do array original para o novo array
    for (int i = 0; i < array.length; i++) {
        novoArray[i] = array[i];
    }

    // Adicionar o novo elemento ao final do novo array
    novoArray[novoTamanho - 1] = elemento;

    return novoArray;
    }

   
}