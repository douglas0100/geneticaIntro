package Individuo;
import java.util.Random;

public class Individuo implements Comparable<Individuo> {

    private static final double VALOR_MAXIMO = 10000;
    private static Random aleatorio = new Random(0);

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

    //public double funcao(){
    //    return 10 * this.gene1 - this.gene2 * this.gene2;
    //}

    public double funcao(){
        return this.gene1 - this.gene2;
    }

    @Override
    public String toString(){
        return String.format("Individuo [X1: %.2f | X2: %.2f]", this.gene1, this.gene2);
    }

    @Override
    public int compareTo(Individuo outroIndividuo) {
        if(this.funcao() > outroIndividuo.funcao()){
            return 1;
        } 
        else if(this.funcao() < outroIndividuo.funcao()){
            return -1;
        }
        else{
            return 0;
        }
        
    }
    
}