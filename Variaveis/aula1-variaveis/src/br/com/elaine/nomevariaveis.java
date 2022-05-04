package br.com.elaine;

public class nomevariaveis {

        public static void main(String[] args) {

            int i;
            //int i; - variável com nome repetido
            int I;
            //int 1a; - não se ode iniciar nome de variável com números
            int _1a;
            int $aq; //É permitido, mas deve ser evitado.


            i = 5;
            I = 10;
            _1a = 20;
            $aq = 7;

            final int j = 10;
            //j = 15; - erro pois não se pode alterar valor de constante
            int asrn24678md;
            //int asrn246 78mf; - não se pode ter espaço em nome de variáveis
            int asrn2$4678_md =10;
            //int asrn246%78md = 15; - o caracter "%" é inválido em nome de variáveis.

            asrn24678md = 100;
            asrn2$4678_md = 10;

            int quantidadeProduto = 50;
            //int QuantidadeProduto; - primeira nome da variável sempre inicia com letra minúscula
            final int NUMERO_TENTATIVAS = 5;
            //final int numeroTentativas = 5; - deve se evitar, melhor representação acima
            int QUANTIDADE_OPCOES = 25; //somente variáveis final devem ser representadas assim, apesar de não dar erro.
            //int qtdProd; - apenas comentada por não ser um nome expressivo.

            System.out.println(i);
            System.out.println(I);
            System.out.println(_1a);
            System.out.println($aq);

            System.out.println(j);
            System.out.println(asrn24678md);
            System.out.println(asrn2$4678_md);

            System.out.println(quantidadeProduto);
            System.out.println(NUMERO_TENTATIVAS);
            System.out.println(QUANTIDADE_OPCOES);
        }
}
