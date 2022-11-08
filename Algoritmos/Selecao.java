package Algoritmos;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import Individuo.Individuo;

public class Selecao {

    public static Random aleat = new Random();

    private List<Individuo> populacao;

    public Selecao(List<Individuo> populacao){
        this.populacao = populacao;
    }

    public List<Individuo> torneio(){
        List<Individuo> selecionados = new LinkedList<>();

        while(selecionados.size() < this.populacao.size()){
            List<Individuo> tresAleat = new LinkedList<>();

            for (int i = 0; i < 3; i++) {
                int indiceAleat = aleat.nextInt(this.populacao.size() - 1);
                Individuo individuoAleat = this.populacao.get(indiceAleat);
                tresAleat.add(individuoAleat);
            }
            
            Individuo melhor = eletismo(tresAleat);
            selecionados.add(melhor);
        }
        return selecionados;
    }

    public static Individuo eletismo(List<Individuo> populacao){
        Individuo melhor  = populacao.get(0);
        for (int i = 1; i < populacao.size(); i++) {
            Individuo atual = populacao.get(i);

            if(atual.compareTo(melhor) == 1){
                melhor = atual;
            }
        }
        return melhor;
    }




}
