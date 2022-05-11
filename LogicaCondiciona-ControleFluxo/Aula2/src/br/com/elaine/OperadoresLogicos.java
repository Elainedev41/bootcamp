package br.com.elaine;

public class OperadoresLogicos {
    public static void main(String[] args){

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = false;
        boolean b4 = true;

        System.out.println("b1 and b2:" + (b1 && b2));
        System.out.println("b1 and b4:" + (b1 && b4));
        System.out.println("b3 or b4:" + (b3 || b4));
        System.out.println("b2 or b3:" + (b2 || b3));
        System.out.println("b1 xor b4:" + (b1 ^ b4));
        System.out.println("b3 xor b1:" + (b3 ^ b1));
        System.out.println(!b1);
        System.out.println(!b2);
        System.out.println();

        int i1 = 12;
        int i2 = 8;
        float f1 = 24f;
        float f2 = 50f;

        System.out.println("((i1 + i2) < (f1 * f2)) && true:" + (((i1 + i2) < (f1 * f2)) && true));
        System.out.println("(i2 > i1) || (f2 < f1):" + ((i2 > i1) || (f2 < f1)));
        System.out.println();

        double salarioMensal = 2500.00d;
        double mediaSalarial = 1250.00;

        int quantidadeDependentes = 2;
        int mediaDependentes = 1;

        System.out.println((salarioMensal < mediaSalarial) && (quantidadeDependentes >= mediaDependentes));
        System.out.println();









    }
}
