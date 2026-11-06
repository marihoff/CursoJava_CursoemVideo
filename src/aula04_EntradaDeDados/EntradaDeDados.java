import java.util.Scanner;

/**
 * Aula 04 - Entrada de Dados com Scanner
 *
 * Conceitos abordados:
 * - Classe Scanner para leitura do teclado (System.in)
 * - nextInt()    → lê número inteiro
 * - nextFloat()  → lê número real
 * - nextLine()   → lê texto (String)
 * - next()       → lê uma palavra
 * - Conversão de tipos (Integer.toString, String.valueOf)
 *
 * ATENÇÃO: Este programa aguarda você digitar valores no console.
 */
public class EntradaDeDados {

    public static void main(String[] args) {

        // Criamos um objeto Scanner ligado à entrada padrão (teclado)
        // System.in é a entrada, assim como System.out é a saída
        Scanner teclado = new Scanner(System.in);

        System.out.println("===== LEITURA DE DADOS DO TECLADO =====\n");

        // --- Lendo um número inteiro ---
        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt();
        System.out.println("Você tem " + idade + " anos.\n");

        // --- Lendo um número real ---
        System.out.print("Digite seu salário: ");
        float salario = teclado.nextFloat();
        System.out.printf("Seu salário é R$ %.2f%n%n", salario);

        // nextInt() e nextFloat() deixam o '\n' no buffer.
        // Precisamos consumir essa sobra antes de usar nextLine().
        teclado.nextLine();

        // --- Lendo uma String (linha completa) ---
        System.out.print("Digite seu nome completo: ");
        String nome = teclado.nextLine();
        System.out.println("Olá, " + nome + "!\n");

        // --- Lendo uma única palavra ---
        System.out.print("Digite sua cidade: ");
        String cidade = teclado.next();
        System.out.println("Você mora em: " + cidade + "\n");

        // --- Conversão de tipos ---
        System.out.println("===== CONVERSÃO DE TIPOS =====");

        int numero = 100;
        String numeroComoTexto = Integer.toString(numero);   // int → String
        System.out.println("Número inteiro:   " + numero);
        System.out.println("Como texto:       " + numeroComoTexto);

        String textoNumero = "250";
        int textoComoNumero = Integer.parseInt(textoNumero); // String → int
        System.out.println("Texto '250':      " + textoNumero);
        System.out.println("Como inteiro:     " + textoComoNumero);

        // Fechamos o Scanner ao terminar de usar
        teclado.close();
        System.out.println("\nPrograma finalizado!");
    }
}
