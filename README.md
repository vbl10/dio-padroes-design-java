# Padrões de Design com Java
Este é um projeto para demonstrar alguns padrões de design no contexto da programação orientada a objetos. 

Neste caso, foram explorados os padrões "Strategy" e "Builder", para simular um sistema de renderização de interface gráfica no console.

<hr>

Na classe principal é descrita a estrutura gráfica desejada:
```java
Colecao menu = new Colecao();

menu
    .adicionar(new Texto("Menu"))
    .adicionar(new Botao(new Texto("Botão 1")))
    .adicionar(new Botao(new Texto("Botão 2"), 20))
    .adicionar((new Colecao())
        .adicionar(new Texto("Sub-Menu"))
        .adicionar(new Botao(new Texto("Botao 3")))
        .adicionar(new Botao(new Texto("Botao 4"))));
```

Então, os resultados são impressos no console:
``` java
System.out.println(
    menu
    .desenhar()
    .stream()
    .reduce((a, b) -> a + '\n' + b)
    .orElse("")
);
```
Para esse exemplo, obtém-se a saída:
```
+--------------------+
|Menu                |
|+-------+           |
||Botão 1|           |
|+-------+           |
|+------------------+|
||Botão 2           ||
|+------------------+|
|+---------+         |
||Sub-Menu |         |
||+-------+|         |
|||Botao 3||         |
||+-------+|         |
||+-------+|         |
|||Botao 4||         |
||+-------+|         |
|+---------+         |
+--------------------+
```