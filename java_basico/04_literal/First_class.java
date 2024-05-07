import java.util.*;


class Main 
{
    public static void main(String[] args)
    {   
        // byte b; // 8
        // short s; // 16
        // int i; // 32
        // long l; // 64

        // float f; // 32
        // double d; // 64    

        // char c;
        
        byte[] bytes = new byte[256];
        var rand = new Random();
        rand.nextBytes(bytes);

        for (int i=0; i<bytes.length;i++)
        {
            System.out.println(bytes[i]);
        }   

        // var sc = new Scanner(System.in); //Leitura de dados com Scanner
        // var n = sc.nextInt();        
        // System.out.println(2 * n);//Print em java         
        // sc.close(); //Fecha o scanner após a utilização        
    }
}