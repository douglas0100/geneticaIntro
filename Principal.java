import java.util.LinkedList;
import java.util.List;

import java.util.Random;

import Algoritmos.Cruzamento;
import Algoritmos.Selecao;
import Individuo.Individuo;

public class Principal {

    public static Random aleat = new Random();

    public static void main(String[] args) {
        
        List<Individuo> populacao = criaPopulacao(100);
        imprimePopulacao(populacao);

        int i = 0;
        while(i < 5){

            Selecao selecao = new Selecao(populacao);

            Individuo eleito = selecao.eletismo(populacao);
            Individuo eleito2 = selecao.eletismo(populacao);
    
            System.out.println("Individuo eleito = " + eleito);
    
            List<Individuo> novaGeracao = new LinkedList<>();
            novaGeracao.add(eleito);
            novaGeracao.add(eleito2);
    
            List<Individuo> selecionados = selecao.torneio();
            imprimePopulacao(selecionados);
    
            cruzaPopulacao(novaGeracao, selecionados);
            imprimePopulacao(novaGeracao);

            populacao = novaGeracao;

            i++;

        }

      

        
    }

    public static List<Individuo> criaPopulacao(int qtdIndividuos){
        List<Individuo> populacao = new LinkedList<>();
        for (int i = 0; i < qtdIndividuos; i++) {
            Individuo novoIndividuo = new Individuo();
            populacao.add(novoIndividuo);
        }
        return populacao;
    }


    public static void cruzaPopulacao(List<Individuo> novaGeracao, List<Individuo> selecionados){

        int qtdIndividuos = selecionados.size();

        for (int i = 1; i <= qtdIndividuos/2; i++) {
            Individuo individuo01 = selecionados.get(i - 1);
            Individuo individuo02 = selecionados.get(i);

            Cruzamento cruzamento = new Cruzamento(individuo01, individuo02);

            Individuo individuoCruzado01 = cruzamento.criaIndividuoPorCruzamento()[0];
            Individuo individuoCruzado02 = cruzamento.criaIndividuoPorCruzamento()[1];

            if(i != (qtdIndividuos/2) - 1){

                if(i == (qtdIndividuos/2) - 2){
                    mutacao(individuoCruzado01);
                }

                novaGeracao.add(individuoCruzado01);
                novaGeracao.add(individuoCruzado02);
            }
            
        }

    }

    public static void mutacao(Individuo individuo){
        if(aleat.nextInt(50) > 25){
            individuo.setGene01(aleat.nextInt(1000));
        } else{
            individuo.setGene02(aleat.nextInt(1000));
        }
    }

    public static void imprimePopulacao(List<Individuo> populacao){
        int i = 1;
        for (Individuo individuo : populacao) {
            System.out.println(i + "º " + individuo);
            i++;
        }
        System.out.println("");
        System.out.println("");
    }

}
