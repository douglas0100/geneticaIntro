package Individuo;
import java.util.Random;

public class Individuo implements Comparable<Individuo> {

    public static final double VALOR_MAXIMO = 10000;
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

    public void setGene01(double gene1){
        if(gene1 < 0){
            this.gene1 = 0;
        }else if (gene1 > VALOR_MAXIMO){
            this.gene1 = VALOR_MAXIMO;
        }else{
            this.gene1 = gene1;
        }
    }
    
    public void setGene02(double gene2){
        if(gene2 < 0){
            this.gene2 = 0;
        }else if(gene2 > VALOR_MAXIMO){
            this.gene2 = VALOR_MAXIMO;
        }else {
            this.gene2 = gene2;
        }
    }

    //public double funcao(){
    //    return 10 * this.gene1 - this.gene2 * this.gene2;
    //}

    public double funcao(){
        return (((Math.sqrt(this.gene1) * Math.sqrt(9) - 2) * 2) - ((Math.sqrt(this.gene2) * Math.sqrt(4) + 1) * 3));
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