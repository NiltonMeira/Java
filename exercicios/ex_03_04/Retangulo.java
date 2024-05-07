package exercicios.ex_03_04;

public class Retangulo {

    private Double lado1;
    private Double lado2;
    private Double area;
    private Double perimetro;

    Retangulo(Double lado1, Double lado2 )
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Double calArea()
    {   
        area = lado1*lado2;
        System.out.println("A área do retangulo é " + area);
        return area;
    }

    public Double calPerimetro()
    {   
        perimetro = 2*(lado1*lado2);
        System.out.println("O perimetro do retangulo é" + perimetro);
        return perimetro;
    }
    
}
