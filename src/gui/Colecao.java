package gui;
import java.util.ArrayList;
import java.util.List;

public class Colecao extends Componente {
    
    private List<Componente> componentes = new ArrayList<>();

    public Colecao adicionar(Componente componente) {
        componentes.add(componente);
        return this;
    }


    @Override
    public int getTamanho() {
        int tamanho = 0;
        for (int i = 0; i < componentes.size(); i++) {
            int compTamanho = componentes.get(i).getTamanho();
            tamanho = Math.max(tamanho, compTamanho);
        }
        return tamanho + 2;
    }

    @Override
    public List<String> desenhar() {
        List<String> linhas = new ArrayList<>();

        /*
         * 
         linhas.add("+" + String.valueOf('-').repeat(getTamanho() - 2) + "+");
         for (int i = 0; i < componentes.size(); i++) {
            List<String> compLinhas = componentes.get(i).desenhar();
            int compTamanho = componentes.get(i).getTamanho();
            for (int j = 0; j < compLinhas.size(); j++) {
                linhas.add("|" + compLinhas.get(j) + String.valueOf(' ').repeat(getTamanho() - 2 - compTamanho) + "|");
            }
        }
        linhas.add("+" + String.valueOf('-').repeat(getTamanho() - 2) + "+");
        */
        
        for (int i = 0; i < componentes.size(); i++) {
            linhas.addAll(componentes.get(i).desenhar());
        }
        
        return Util.desenharBorda(linhas, getTamanho());
    }
}
