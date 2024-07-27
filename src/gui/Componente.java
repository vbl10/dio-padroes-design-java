package gui;
import java.util.List;

public class Componente {
    
    public int getTamanho() { return 0; }
    public void setTamanho(int novoTamanho) { }

    public Componente contemMouse() { return null; }
    public void aoFocoMouse(boolean foco) {}
    public void aoMoverMouse(int x, int y) {}
    public void aoBotaoMouse(int x, int y, int estado) {}

    public Componente proxFocoTeclado() { return null; }
    public void aoFocoTeclado(boolean foco) {}
    public void aoEstadoTecla(int codigoTecla, int estado) {}

    public void atualizar(float dt) {}
    public List<String> desenhar() { return null; }
}
