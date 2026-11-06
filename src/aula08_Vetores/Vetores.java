/**
 * Aula 08 - Vetores (Arrays)
 *
 * Conceitos abordados:
 * - O que é um array (vetor)
 * - Declaração e inicialização de arrays
 * - Acesso por índice (começa em 0)
 * - Propriedade .length
 * - Iteração com for e for-each
 * - Arrays de String
 * - Exemplo prático: meses do ano
 */
public class Vetores {

    public static void main(String[] args) {

        System.out.println("===== DECLARAÇÃO E INICIALIZAÇÃO =====");

        // Forma 1: declarar e inicializar ao mesmo tempo
        int[] numeros = {3, 2, 8, 7, 5, 4};

        // Forma 2: declarar o tamanho e preencher depois
        int[] pares = new int[5];
        pares[0] = 2;
        pares[1] = 4;
        pares[2] = 6;
        pares[3] = 8;
        pares[4] = 10;

        System.out.println("Array 'numeros' tem " + numeros.length + " posições.");
        System.out.println("Array 'pares'   tem " + pares.length   + " posições.");

        System.out.println("\n===== ACESSO POR ÍNDICE =====");
        // O índice começa em 0 e vai até length-1

        System.out.println("numeros[0] = " + numeros[0]); // 3
        System.out.println("numeros[2] = " + numeros[2]); // 8
        System.out.println("numeros[5] = " + numeros[5]); // 4 (último)

        System.out.println("\n===== ITERAÇÃO COM FOR =====");

        System.out.println("Conteúdo de 'numeros':");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("  Posição " + i + " → " + numeros[i]);
        }

        System.out.println("\n===== ITERAÇÃO COM FOR-EACH =====");
        // Mais simples quando não precisa do índice

        System.out.print("Pares: ");
        for (int valor : pares) {
            System.out.print(valor + " ");
        }
        System.out.println();

        System.out.println("\n===== ARRAY DE STRINGS =====");

        String[] dias = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};

        System.out.println("Dias da semana:");
        for (int i = 0; i < dias.length; i++) {
            System.out.printf("  Dia %d → %s%n", i + 1, dias[i]);
        }

        System.out.println("\n===== EXEMPLO PRÁTICO: MESES DO ANO =====");

        String[] meses = {"Janeiro", "Fevereiro", "Março",    "Abril",
                          "Maio",    "Junho",     "Julho",    "Agosto",
                          "Setembro","Outubro",   "Novembro", "Dezembro"};

        int[] diasNoMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("Meses do ano e seus dias:");
        for (int i = 0; i < meses.length; i++) {
            System.out.printf("  %-10s → %d dias%n", meses[i], diasNoMes[i]);
        }

        System.out.println("\n===== OPERAÇÕES COM ARRAYS =====");

        int[] valores = {15, 42, 7, 93, 28, 61, 4};

        int soma   = 0;
        int maior  = valores[0];
        int menor  = valores[0];

        for (int v : valores) {
            soma += v;
            if (v > maior) maior = v;
            if (v < menor) menor = v;
        }

        double media = (double) soma / valores.length;

        System.out.println("Array: {15, 42, 7, 93, 28, 61, 4}");
        System.out.println("Soma:  " + soma);
        System.out.printf( "Média: %.2f%n", media);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
