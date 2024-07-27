package gui;
import java.util.*;
public class Util {
    public static List<String> desenharBorda(List<String> conteudo, int tamanho) {
        List<String> linhas = new ArrayList<>();
        linhas.add("+" + String.valueOf('-').repeat(tamanho - 2) + "+");
        for (int j = 0; j < conteudo.size(); j++) {
            linhas.add("|" + conteudo.get(j) + String.valueOf(' ').repeat(tamanho - 2 - conteudo.get(j).length()) + "|");
        }
        linhas.add("+" + String.valueOf('-').repeat(tamanho - 2) + "+");
        return linhas;
    }
}
