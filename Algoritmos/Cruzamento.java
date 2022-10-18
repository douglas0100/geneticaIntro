package Algoritmos;

import Individuo.Individuo;

public class Cruzamento {

    private Individuo individuo01;
    private Individuo individuo02;

    public Cruzamento(Individuo individuo01, Individuo individuo02){
        this.individuo01 = individuo01;
        this.individuo02 = individuo02;
    }

    public Individuo[] criaIndividuoPorCruzamento(){
        Individuo[] individuosCruzados = new Individuo[2];
        double gene01 = individuo01.getGene01();
        double gene02 = individuo02.getGene02();
        double geneInvertido01 = individuo02.getGene01();
        double geneInvertido02 = individuo01.getGene02();
        Individuo individuoCruzado01 = new Individuo(gene01, gene02);
        Individuo individuoCruzado02 = new Individuo(geneInvertido01, geneInvertido02);
        individuosCruzados[0] = individuoCruzado01;
        individuosCruzados[1] = individuoCruzado02;
        return individuosCruzados;
    }

}
