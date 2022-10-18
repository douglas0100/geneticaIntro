import java.util.LinkedList;
import java.util.List;

import Algoritmos.Cruzamento;
import Individuo.Individuo;

public class Principal {
    public static void main(String[] args) {
        
        List<Individuo> populacao = criaPopulacao(10);
        imprimePopulacao(populacao);

        cruzaPopulacao(populacao);

        System.out.println("");
        System.out.println("");

        imprimePopulacao(populacao);
        
    }

    public static List<Individuo> criaPopulacao(int qtdIndividuos){
        List<Individuo> populacao = new LinkedList<>();
        for (int i = 0; i < qtdIndividuos; i++) {
            Individuo novoIndividuo = new Individuo();
            populacao.add(novoIndividuo);
        }
        return populacao;
    }

    public static void cruzaPopulacao(List<Individuo> populacao){

        int qtdIndividuos = populacao.size();

        for (int i = 1; i <= qtdIndividuos/2; i++) {
            Individuo individuo01 = populacao.get(i - 1);
            Individuo individuo02 = populacao.get(qtdIndividuos - i);

            Cruzamento cruzamento = new Cruzamento(individuo01, individuo02);

            Individuo individuoCruzado01 = cruzamento.criaIndividuoPorCruzamento()[0];
            Individuo individuoCruzado02 = cruzamento.criaIndividuoPorCruzamento()[1];

            populacao.remove(i - 1);
            populacao.add(i - 1, individuoCruzado01);

            populacao.remove(qtdIndividuos - i);
            populacao.add(qtdIndividuos - i, individuoCruzado02);
            
        }
    }


    public static void imprimePopulacao(List<Individuo> populacao){
        for (Individuo individuo : populacao) {
            System.out.println(individuo);
        }
    }

}
