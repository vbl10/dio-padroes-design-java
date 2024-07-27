package gui;

import java.util.List;

public class Botao extends Componente {
    
    private Texto texto;
    private int tamanho;

    public Botao(Texto texto, int tamanho) { 
        this.texto = texto;
        this.tamanho = tamanho;
    }
    public Botao(Texto texto) { 
        this.texto = texto;
        this.tamanho = 0;
    }

    @Override
    public int getTamanho() { return Math.max(tamanho - 2, texto.getTamanho()) + 2; }
    @Override
    public void setTamanho(int tamanho) { this.tamanho = tamanho; }

    @Override
    public List<String> desenhar() {
        return Util.desenharBorda(texto.desenhar(), getTamanho());
    }
}
