/**
 * Aula 06 - Estruturas Condicionais
 *
 * Conceitos abordados:
 * - Operadores relacionais: > < >= <= == !=
 * - Operadores lógicos: && (AND), || (OR), ! (NOT)
 * - Condição simples: if
 * - Condição composta: if / else
 * - Condições encadeadas: if / else if / else
 * - Operador ternário: condição ? valorSeTrue : valorSeFalse
 */
public class Condicionais {

    public static void main(String[] args) {

        System.out.println("===== OPERADORES RELACIONAIS =====");

        int a = 10;
        int b = 20;
        System.out.println("a = " + a + " | b = " + b);
        System.out.println("a > b   → " + (a > b));   // false
        System.out.println("a < b   → " + (a < b));   // true
        System.out.println("a >= b  → " + (a >= b));  // false
        System.out.println("a <= b  → " + (a <= b));  // true
        System.out.println("a == b  → " + (a == b));  // false
        System.out.println("a != b  → " + (a != b));  // true

        System.out.println("\n===== OPERADORES LÓGICOS =====");

        boolean cond1 = true;
        boolean cond2 = false;
        // && (E / AND): true somente se AMBAS forem verdadeiras
        System.out.println("true && true  → " + (true && true));
        System.out.println("true && false → " + (true && false));
        // || (OU / OR): true se PELO MENOS UMA for verdadeira
        System.out.println("true || false → " + (true || false));
        System.out.println("false || false→ " + (false || false));
        // ! (NÃO / NOT): inverte o valor lógico
        System.out.println("!true         → " + (!true));
        System.out.println("!false        → " + (!false));

        System.out.println("\n===== CONDIÇÃO SIMPLES (if) =====");

        float media = 7.5f;
        System.out.println("Média: " + media);
        if (media >= 7) {
            System.out.println("→ Aprovado!");
        }

        System.out.println("\n===== CONDIÇÃO COMPOSTA (if / else) =====");

        int anoNascimento = 2005;
        int anoAtual = 2024;
        int idadeCalculada = anoAtual - anoNascimento;
        System.out.println("Ano de nascimento: " + anoNascimento);
        System.out.println("Idade: " + idadeCalculada);

        if (idadeCalculada >= 18) {
            System.out.println("→ Maior de idade.");
        } else {
            System.out.println("→ Menor de idade.");
        }

        System.out.println("\n===== CONDIÇÕES ENCADEADAS (if / else if / else) =====");

        // Situação eleitoral baseada na idade
        int[] idades = {14, 17, 25, 72};

        for (int i : idades) {
            System.out.print("Idade " + i + ": ");
            if (i < 16) {
                System.out.println("Não vota.");
            } else if (i < 18 || i > 70) {
                System.out.println("Voto opcional.");
            } else {
                System.out.println("Voto obrigatório.");
            }
        }

        System.out.println("\n===== OPERADOR TERNÁRIO =====");

        // Sintaxe: variavel = (condição) ? valorSeVerdadeiro : valorSeFalso
        int n1 = 4;
        int n2 = 8;
        int maior = (n1 > n2) ? n1 : n2;
        System.out.println("n1 = " + n1 + " | n2 = " + n2);
        System.out.println("O maior é: " + maior); // 8

        // Ternário com String
        int nota = 6;
        String resultado = (nota >= 7) ? "Aprovado" : "Reprovado";
        System.out.println("Nota " + nota + " → " + resultado);

        System.out.println("\n===== EXEMPLO COMPLETO: CLASSIFICAÇÃO DE NOTAS =====");

        float[] notas = {4.5f, 6.0f, 7.0f, 8.5f, 10.0f};

        for (float n : notas) {
            String conceito;
            if (n < 5) {
                conceito = "Reprovado";
            } else if (n < 7) {
                conceito = "Recuperação";
            } else if (n < 9) {
                conceito = "Aprovado";
            } else {
                conceito = "Excelente";
            }
            System.out.printf("Nota %.1f → %s%n", n, conceito);
        }
    }
}
