## Monty Hall Game - Java
Jogo de simulação do famoso problema de probabilidade conhecido como "Paradoxo de Monty Hall", implementado em Java, com duas versões: uma para ser executada no terminal e outra com uma interface gráfica de usuário (GUI) desenvolvida com Swing.

## Visualização GUI:



## Como funciona?

- O jogo simula a situação do famoso problema de probabilidade conhecido como "Paradoxo de Monty Hall". Consiste em três portas: uma contendo um prêmio valioso (a porta premiada), outra vazia (a porta vazia) e a terceira escolhida pelo jogador (a porta escolhida).
- Ao iniciar o jogo, uma das três portas é aleatoriamente designada como a porta premiada.
- O jogador então escolhe uma das três portas.
- Em seguida, o apresentador (simulado pelo jogo) revela uma das portas restantes que não contém o prêmio (a porta vazia), garantindo que sempre haja uma porta vazia revelada.
- O jogador é então dado a oportunidade de mudar sua escolha inicial para a outra porta restante.
- Após a decisão do jogador, o resultado é revelado: se a porta escolhida pelo jogador contiver o prêmio, ele ganha; caso contrário, ele perde.

## Requisitos

- OpenJDK 21.0.2 ou posterior.

## Executando a versão do terminal

1. Abra um terminal.
2. Navegue até o diretório onde se encontra o arquivo `Main.java`.
3. Compile o arquivo utilizando o comando:
    ```
    javac Main.java
    ```
4. Execute o programa utilizando o comando:
    ```
    java Main
    ```

## Executando a versão GUI Swing

1. Abra um terminal.
2. Navegue até o diretório onde se encontra o arquivo `MontyHallGUI.java`.
3. Compile o arquivo utilizando o comando:
    ```
    javac MontyHallGUI.java
    ```
4. Execute o programa utilizando o comando:
    ```
    java MontyHallGUI
    ```





