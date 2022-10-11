package Individuo;
import java.util.Random;

public class Individuo {

    private static final double VALOR_MAXIMO = 10000;
    private static Random aleatorio = new Random();

    private double gene1;
    private double gene2;

    public Individuo(){
        this.gene1 = aleatorio.nextDouble(VALOR_MAXIMO);
        this.gene2 = aleatorio.nextDouble(VALOR_MAXIMO);
    }

    public double funcao(double gene1, double gene2){
        return 10 * gene1 - gene2 * gene2;
    }
    
}