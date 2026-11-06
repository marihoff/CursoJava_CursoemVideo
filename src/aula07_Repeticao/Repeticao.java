/**
 * Aula 07 - Estruturas de Repetição
 *
 * Conceitos abordados:
 * - while  → repete enquanto a condição for verdadeira (testa ANTES)
 * - do-while → repete enquanto a condição for verdadeira (testa DEPOIS)
 * - for    → repetição com variável de controle
 * - break  → interrompe e sai do laço completamente
 * - continue → interrompe a iteração atual e volta ao topo do laço
 */
public class Repeticao {

    public static void main(String[] args) {

        System.out.println("===== WHILE =====");
        // Testa a condição ANTES de executar o bloco.
        // Se a condição começar falsa, o bloco nunca executa.

        int cc = 0;
        while (cc < 4) {
            System.out.println("Cambalhota " + (cc + 1));
            cc++;
        }

        System.out.println("\n===== DO-WHILE =====");
        // Executa o bloco PELO MENOS UMA VEZ, depois testa a condição.

        int tentativa = 0;
        do {
            System.out.println("Tentativa " + (tentativa + 1));
            tentativa++;
        } while (tentativa < 4);

        System.out.println("\n===== FOR =====");
        // Sintaxe: for (inicialização; condição; incremento)
        // Ideal quando se sabe quantas vezes vai repetir.

        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteração " + i);
        }

        System.out.println("\n===== FOR DECRESCENTE =====");

        for (int i = 5; i >= 1; i--) {
            System.out.println("Contagem regressiva: " + i);
        }
        System.out.println("Fim!");

        System.out.println("\n===== CONTINUE =====");
        // continue → pula o restante do bloco e volta para a condição do laço

        System.out.println("Números de 1 a 10, pulando 5 e 7:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5 || i == 7) {
                continue; // pula o println abaixo para i=5 e i=7
            }
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\n===== BREAK =====");
        // break → sai completamente do laço

        System.out.println("Procurando o número 6 (para ao encontrar):");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            if (i == 6) {
                System.out.println("\n→ Encontrei o 6! Parando o laço.");
                break;
            }
        }

        System.out.println("\n===== LAÇOS ANINHADOS =====");
        // Um for dentro de outro for — útil para tabelas e matrizes

        System.out.println("Tabuada do 1 ao 5:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%2d x %2d = %3d%n", i, j, i * j);
            }
            System.out.println("---");
        }

        System.out.println("\n===== EXEMPLO COMPLETO: SOMATÓRIO =====");

        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma += i;
        }
        System.out.println("Soma de 1 a 100 = " + soma); // 5050
    }
}
