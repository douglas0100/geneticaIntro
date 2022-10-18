import java.util.LinkedList;
import java.util.List;

import Individuo.Individuo;

public class Principal {
    public static void main(String[] args) {
        
        List<Individuo> populacao = criaPopulacao(10);
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


    public static void imprimePopulacao(List<Individuo> populacao){
        for (Individuo individuo : populacao) {
            System.out.println(individuo);
        }
    }

}
