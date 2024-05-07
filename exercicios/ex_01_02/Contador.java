public class Contador
{
    private Integer count;

    Contador (Integer num)
    {
        this.count = num;
    }

    public void zerar()
    {
        count = 0;
    }

    public void incrementar()
    {
        count ++;
    }

    public Integer getValue()
    {
        return count;
    }
}