package br.com.elaine;

public class operadores {

    public static void main(String[] args) {
        
        System.out.println("PrePos");
        prePos();
        System.out.println("Aritimético");
        artimetico();
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("Precedência");
        precedencia();
    }
    private static void prePos() {
        int x = 15;

        int i = ++x;
        int j = x--;
        int k = x;

        System.out.println("I: " + i);
        System.out.println("J: " + j);
        System.out.println("K: " + k);
    }

    private static void artimetico() {
        int a = 10;
        int b = 15;
        int c = 20;
        int d = 25;
        int e = 30;

        int r1 = a + b;
        int r2 = c - b;
        int r3 = d * a;
        int r4 = e / b;
        int r5 = e % c;


        System.out.println("Soma= " + r1);
        System.out.println("Subtração= " + r2);
        System.out.println("Multiplicação= " + r3);
        System.out.println("Divisão= " + r4);
        System.out.println("Resto= " + r5);
    }
    private static void atribuicao() {
        int i = 1000;
        short j = 15;
        long l = 500L;
        int k = 45;
        float f = 5.5f;
        double d = f;

        System.out.println("D: " + d);

        i += 5; // i = i + 5
        j -= 4;
        l *= 5;
        d /= 2.5;
        k %= 4;

        System.out.println("I:" + i);
        System.out.println("J:" + j);
        System.out.println("L:" + l);
        System.out.println("D:" + d);
        System.out.println("K:" + k);

        i = k = j;
        System.out.println("K:" + k);
        System.out.println("I:" + i);
    }
    private static void precedencia() {
        int i = 10;
        int k = 20;
        int j = 30;

        int a = i++ + --k * j;

        System.out.println("Resposta 1=" + a);
        System.out.println("Resposta 2=" + i);

        int b = j / --i %3 + 1;

        System.out.println("Resposta 3=" + b);
        System.out.println("Resposta 4=" + i);

        int c = 2;
        c *=i +=5;

        System.out.println("Resposta 5=" + c);
    }

}
