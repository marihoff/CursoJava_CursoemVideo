/**
 * Aula 05 - Operadores Aritméticos e Classe Math
 *
 * Conceitos abordados:
 * - Operadores aritméticos: + - * / %
 * - Operadores unários: ++ e --
 * - Operadores de atribuição composta: +=, -=, *=, /=
 * - Classe Math: PI, pow, sqrt, cbrt, abs, floor, ceil, round, random
 */
public class OperadoresMath {

    public static void main(String[] args) {

        System.out.println("===== OPERADORES ARITMÉTICOS =====");

        int a = 10;
        int b = 3;

        System.out.println("a = " + a + " | b = " + b);
        System.out.println("Adição       (a + b) = " + (a + b));   // 13
        System.out.println("Subtração    (a - b) = " + (a - b));   // 7
        System.out.println("Multiplicação(a * b) = " + (a * b));   // 30
        System.out.println("Divisão      (a / b) = " + (a / b));   // 3  (inteiro!)
        System.out.println("Resto        (a % b) = " + (a % b));   // 1

        // Para obter divisão com casas decimais, usar double ou float
        double divisaoReal = (double) a / b;
        System.out.printf("Divisão real (a / b) = %.4f%n", divisaoReal); // 3.3333

        System.out.println("\n===== OPERADORES UNÁRIOS (++ e --) =====");

        int numero = 5;
        System.out.println("Valor inicial:        " + numero);
        numero++;   // numero = numero + 1
        System.out.println("Após numero++:        " + numero); // 6
        numero--;   // numero = numero - 1
        System.out.println("Após numero--:        " + numero); // 5

        // Pré-incremento vs Pós-incremento
        int x = 10;
        System.out.println("\nx = " + x);
        System.out.println("x++ (usa depois):    " + x++); // imprime 10, depois vira 11
        System.out.println("x agora vale:        " + x);   // 11
        System.out.println("++x (usa antes):     " + ++x); // vira 12 e imprime 12

        System.out.println("\n===== OPERADORES DE ATRIBUIÇÃO COMPOSTA =====");

        int n = 20;
        System.out.println("n = " + n);
        n += 5;  System.out.println("n += 5  → " + n);  // 25
        n -= 3;  System.out.println("n -= 3  → " + n);  // 22
        n *= 2;  System.out.println("n *= 2  → " + n);  // 44
        n /= 4;  System.out.println("n /= 4  → " + n);  // 11
        n %= 3;  System.out.println("n %= 3  → " + n);  // 2

        System.out.println("\n===== CLASSE MATH =====");

        // Constante PI
        System.out.printf("Math.PI             = %.10f%n", Math.PI);

        // Potenciação: Math.pow(base, expoente)
        System.out.println("Math.pow(5, 2)      = " + Math.pow(5, 2));   // 25.0
        System.out.println("Math.pow(2, 10)     = " + Math.pow(2, 10));  // 1024.0

        // Raiz quadrada
        System.out.println("Math.sqrt(25)       = " + Math.sqrt(25));    // 5.0
        System.out.println("Math.sqrt(2)        = " + Math.sqrt(2));     // 1.414...

        // Raiz cúbica
        System.out.println("Math.cbrt(27)       = " + Math.cbrt(27));    // 3.0

        System.out.println("\n--- Arredondamentos ---");

        // Valor absoluto (remove o sinal negativo)
        System.out.println("Math.abs(-10)       = " + Math.abs(-10));    // 10
        System.out.println("Math.abs(-3.7)      = " + Math.abs(-3.7));   // 3.7

        // floor → arredonda PARA BAIXO (piso)
        System.out.println("Math.floor(3.9)     = " + Math.floor(3.9));  // 3.0
        System.out.println("Math.floor(-3.1)    = " + Math.floor(-3.1)); // -4.0

        // ceil → arredonda PARA CIMA (teto)
        System.out.println("Math.ceil(4.1)      = " + Math.ceil(4.1));   // 5.0
        System.out.println("Math.ceil(-4.9)     = " + Math.ceil(-4.9));  // -4.0

        // round → arredondamento aritmético (>= .5 sobe, < .5 desce)
        System.out.println("Math.round(5.4)     = " + Math.round(5.4));  // 5
        System.out.println("Math.round(5.5)     = " + Math.round(5.5));  // 6

        System.out.println("\n--- Número Aleatório ---");

        // Math.random() gera um double entre 0.0 (inclusive) e 1.0 (exclusive)
        double aleatorio = Math.random();
        System.out.printf("Math.random()       = %.6f%n", aleatorio);

        // Gerar número inteiro aleatório entre 15 e 50
        int min = 15;
        int max = 50;
        int numeroAleatorio = (int) (min + aleatorio * (max - min));
        System.out.println("Aleatório [15-50]   = " + numeroAleatorio);
    }
}
