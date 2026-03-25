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
