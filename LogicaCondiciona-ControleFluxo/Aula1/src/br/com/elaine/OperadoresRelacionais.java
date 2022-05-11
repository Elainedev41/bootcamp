package br.com.elaine;

public class OperadoresRelacionais {
    public static void main(String[ ] args) {
        
        int i1 = 15;
        int i2 = 35;
        float f1 = 4.6f;
        float f2 = 4.66f;
        char c1 = 'x';
        char c2 = 'y';
        double d1 = 6.3;
        double d2 = 6.5;
        String s1= "Manga";
        String s2= "uva";
        String s3 = "Manga";
        String s4 = "Uva";
        boolean b1 = true;
        boolean b2 = false;
        long l1 = 1645L;
        long l2 = 1645L;
        byte bt = 3;
        byte bt2 = 4;
        short st = 50;
        short st2 = 35;

        System.out.println("i1 igual a i2: " + (i1 == i2));
        System.out.println("i1 diferente de i2: " + (i1 != i2));
        System.out.println("i1 maior ou igual i2 " + (i2 >= i1));
        System.out.println("i1 menor que i2 " + (i1 < i2));

        System.out.println("i2 igual a short st2: " + (i2 == st2));
        System.out.println("s1 diferente de s3: " + (s1 != s3));
        System.out.println("s2 igual a s4: " + (s2 == s4));
        System.out.println("f1 menor ou igual a f2: " + (f1 <= f2));

        System.out.println("c1 maior ou igual c2: " + (c1 >= c2));
        System.out.println("d1 igual a d2: " + (d1 == d2));
        System.out.println("d2 menor ou igual a d1: " + (d2 <= d1));
        System.out.println("b1 igual a b2: " + (b1 == b2));

        System.out.println("l1 igual a l2: " + (l1 == l2));
        System.out.println("l2 maior ou igual a l1: " + (l2 >= l1));
        System.out.println("bt menor que bt2: " + (bt < bt2));
        System.out.println("bt2 maior que bt: " + (bt2 > bt ));

        System.out.println("st maior que st2:" + (st > st2));
        System.out.println("st2 menor que st1: " + (st2 < st));
    }
}
