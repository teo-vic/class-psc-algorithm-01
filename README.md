# Divertidamente

<p align="center">
    <img src="./src/divertida-mente.jpg"><br>
</p>

"Com a mudança para uma nova cidade, as emoções de Riley, que tem apenas 11 anos de idade, ficam extremamente agitadas. <br>
Uma confusão na sala de controle do seu cérebro deixa a Alegria e a Tristeza de fora, afetando a vida de Riley radicalmente."

Faça um algoritmo que informe:

1. Se a Riley fez novas amizades na cidade, quantas amizades ela fez? <br>
  Para cada amizade feita pela Riley a emoção Alegria recebe 10 pontos por amizade.<br>
  Caso ela não tenha feito nenhuma amizade a emoção Tristeza recebe 30 pontos.

2. Na nova cidade, a Riley fez três provas na universidade: A1, A2 e A3. <br>
  Cada prova vale 10 pontos. Se a média da Riley for maior ou igual a sete, ela esta aprovada e a Alegria recebe 50 pontos.<br>
  Caso ela não alcance a média a emoção Tristeza recebe 50 pontos.

3. A Riley esta estudando programação.
  E ela tem 10 algoritmos para resolver. <br>
  Pergunte a Riley quantos exercícios ela conseguiu fazer.<br>
  Para cada exercício realizado soma-se 10 pontos para a Alegria e para cada não realizado 10 pontos para a Tristeza.

Agora, compare qual emoção possui mais pontos.
Caso a Alegria possua mais pontos que a Tristeza informe na tela:

~~~
A mudança para a nova cidade foi uma experiência incrível para a Riley.
~~~

Caso a Tristeza possua mais pontos informe:
~~~
A mudança para a nova cidade foi uma experiência desagradável para a Riley.
~~~



# -------Resolução-------
~~~~
import java.util.Scanner;

public class Divertidamente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     
        int alegria = 0, tristeza = 0, amizade, a1, a2, a3, ex, exn;
        double media;

        System.out.println("\nquantas amizades riley fez?");
        amizade = sc.nextInt();

        if(amizade <= 0){
            tristeza = tristeza + 30;
        }else{
            alegria = (amizade * 10) + alegria;
        }

        System.out.println("qual a nota na prova A1?: ");
        a1 = sc.nextInt();

        System.out.println("qual a nota na prova A2?: ");
        a2 = sc.nextInt();

        System.out.println("qual a nota da prova A3");
        a3 = sc.nextInt();

        media = (a1+ a2 + a3) / 3;

        if(media >= 7){
            alegria = alegria + 50;
        }else{
            tristeza = tristeza +50;
        }

        System.out.println("quantos exercícios conseguiu fazer?");
        ex = sc.nextInt();

        alegria = (ex * 10) + alegria;
        exn = 10 - ex;
        tristeza = (exn * 10) + tristeza;

        if(tristeza < alegria){
            System.out.println("A mudança para a nova cidade foi uma experiência incrível para a Riley.");
        }else{
            System.out.println("A mudança para a nova cidade foi uma experiência desagradável para a Riley.");

        }

        sc.close();



    




    

    }
}
