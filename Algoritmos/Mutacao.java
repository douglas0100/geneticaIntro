package Algoritmos;

import java.util.Random;
import Individuo.Individuo;

public class Mutacao {
    
    public static Random aleat = new Random();
    public static final double VALOR_MAXIMO = Individuo.VALOR_MAXIMO;

    public static void mutacao(Individuo individuo){
        int valorAleat = aleat.nextInt(2);

        if(valorAleat > 0){
            valorAleat = aleat.nextInt(2);
            if (valorAleat > 0) {
                individuo.setGene01(individuo.getGene01() - aleat.nextDouble(100));
            }
            else{
                individuo.setGene01(individuo.getGene01() + aleat.nextDouble(100));
            }
        } 

        else{
            valorAleat = aleat.nextInt(2);
            if (valorAleat > 0) {
                individuo.setGene02(individuo.getGene02() - aleat.nextDouble(100));
            }
            else{
                individuo.setGene02(individuo.getGene02() + aleat.nextDouble(100));
            }
        }
    }


}
