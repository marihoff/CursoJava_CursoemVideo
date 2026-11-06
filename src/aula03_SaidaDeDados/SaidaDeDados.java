/**
 * Aula 03 - Saída de Dados
 *
 * Conceitos abordados:
 * - System.out.print   → imprime sem pular linha
 * - System.out.println → imprime e pula linha
 * - System.out.printf  → imprime com formatação (igual ao format)
 * - Especificadores de formato: %s (String), %d (inteiro), %f (real), %.2f (2 decimais)
 * - Caractere de escape \n (nova linha) e \t (tabulação)
 */
public class SaidaDeDados {

    public static void main(String[] args) {

        System.out.println("===== print vs println =====");

        // print → não pula linha ao final
        System.out.print("Olá ");
        System.out.print("mundo");
        System.out.print("!\n"); // \n força a quebra de linha manualmente

        // println → pula linha automaticamente ao final
        System.out.println("Isso está em uma linha.");
        System.out.println("Isso está em outra linha.");

        System.out.println("\n===== printf com %d (inteiro) =====");

        int idade = 25;
        System.out.printf("Minha idade é %d anos.%n", idade);
        // %n é a quebra de linha compatível com todos os sistemas operacionais

        System.out.println("\n===== printf com %s (String) =====");

        String nome = "Mariana";
        System.out.printf("Meu nome é %s.%n", nome);

        System.out.println("\n===== printf com %f (real) =====");

        float nota = 8.5f;
        System.out.printf("Minha nota é %f%n", nota);           // muitas casas decimais
        System.out.printf("Minha nota é %.1f%n", nota);         // 1 casa decimal
        System.out.printf("Minha nota é %.2f%n", nota);         // 2 casas decimais

        System.out.println("\n===== printf com múltiplos valores =====");

        String aluno = "Mariana";
        float notaFinal = 9.75f;
        int turma = 3;
        System.out.printf("A nota de %s da turma %d é %.2f%n", aluno, turma, notaFinal);

        System.out.println("\n===== Caracteres de escape =====");

        System.out.println("Coluna 1\tColuna 2\tColuna 3");   // \t = tabulação
        System.out.println("Java\t\tPython\t\tC++");
        System.out.println("Linha 1\nLinha 2\nLinha 3");       // \n = nova linha
        System.out.println("Ele disse: \"Olá!\"");             // \" = aspas duplas
        System.out.println("C:\\Users\\Mariana");              // \\ = barra invertida
    }
}
