import gui.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Demonstração de padrões de design");

        Colecao menu = new Colecao();

        menu
            .adicionar(new Texto("Menu"))
            .adicionar(new Botao(new Texto("Botão 1")))
            .adicionar(new Botao(new Texto("Botão 2"), 20))
            .adicionar((new Colecao())
                .adicionar(new Texto("Sub-Menu"))
                .adicionar(new Botao(new Texto("Botao 3")))
                .adicionar(new Botao(new Texto("Botao 4"))));
        
        System.out.println(menu.desenhar().stream().reduce((a, b) -> a + '\n' + b).orElse(""));
    }
}
