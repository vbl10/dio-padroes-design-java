package gui;
import java.util.List;
import java.util.ArrayList;

public class Texto extends Componente {
    
    private String conteudo;

    public Texto(String conteudo) { this.conteudo = conteudo; }

    @Override
    public int getTamanho() { return conteudo.length(); }

    @Override
    public List<String> desenhar() { 
        List<String> linhas = new ArrayList<>();
        for (int i = 0, j = 0; j < conteudo.length(); i = j + 1) {
            j = conteudo.indexOf('\n', i);
            if (j == -1) j = conteudo.length();
            linhas.add(conteudo.substring(i, j));
        }
        return linhas;
    }
}
