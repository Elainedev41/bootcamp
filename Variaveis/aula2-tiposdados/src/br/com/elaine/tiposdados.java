package br.com.elaine;

public class tiposdados {
    public static void main(String[] args) {

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        //short s2 = 40000; - valor declarado maior que o suportado

        //int i1 = -1000000000; valor negativo maior que um int suporta
        int i2 = 29800;

        long l1 = 5000690000000000L;
        long l2 = 2000000894780009L;

        //float f1 = 4.5; faltou colocar a letra f ao final e indicar que é um float, o java interpreta como um double
        float f2 = 10.68f;

        double d1 = 85.69;
        double d2 = 100.04d;

        char c1 = 'W';
        //char c2 = 'Tm'; Representado somente por 1 caracter
        char c3 = '\u1057';

        String st1 = "Marcos";
        String st2 = "Thiago";
        String st3 = "rua 25 Enseada dos Pássaros Espirito Santo";

        //String dt1 = "16/12/1980"; não é a melor forma de representar

        boolean b01 = true;
        boolean b02 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(b01);
        System.out.println(b02);
    }

}
