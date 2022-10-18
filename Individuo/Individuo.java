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

    public Individuo(double gene1, double gene2){
        this.gene1 = gene1;
        this.gene2 = gene2;
    }

    public double getGene01(){
        return this.gene1;
    }

    public double getGene02(){
        return this.gene2;
    }

    public double funcao(double gene1, double gene2){
        return 10 * gene1 - gene2 * gene2;
    }

    @Override
    public String toString(){
        return String.format("Individuo [X1: %.2f | X2: %.2f]", this.gene1, this.gene2);
    }
    
}