import java.util.*;

class Main
{    
    public static void main(String a[])
    {
        Integer value;
        Contador contador = new Contador(5);

        value = contador.getValue();
        System.out.println(value);

        contador.zerar();
        value = contador.getValue();
        System.out.println(value);

        

        contador.incrementar();
        value = contador.getValue();
        System.out.println(value);

        contador.zerar();

        for(int i=0;i<10;i++)
        {
            contador.incrementar();
        }

        value = contador.getValue();
        System.out.println(value);

        contador.zerar();

        for(int i=0;i<100;i++)
        {
            contador.incrementar();
        }

        contador.zerar();
        value = contador.getValue();
        System.out.println(value);

        for(int i=0;i<1000;i++)
        {
            contador.incrementar();
        }
        
        value = contador.getValue();
        System.out.println(value);
    }
}

