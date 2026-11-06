/**
 * Aula 02 - Tipos de Dados e Variáveis
 *
 * Conceitos abordados:
 * - Tipos primitivos: int, float, double, char, boolean
 * - Wrapper Classes: Integer, Float, Double, Character, Boolean
 * - Typecast (conversão de tipos)
 * - Declaração e inicialização de variáveis
 *
 * NOTA: Os construtores new Integer(), new Float(), new Character() e new Boolean()
 * foram marcados como @Deprecated a partir do Java 9. Eles ainda funcionam e são
 * ensinados aqui para fins didáticos (entender o conceito de Wrapper Class).
 * A forma moderna preferida é: Integer.valueOf(30), Float.valueOf(1825.50f), etc.
 */
public class TiposEVariaveis {

    public static void main(String[] args) {

        System.out.println("===== TIPOS INTEIROS =====");

        // 3 formas de declarar um número inteiro
        int idade = 30;
        int idadeComCast = (int) 30;        // typecast explícito
        Integer idadeWrapper = new Integer(30); // Wrapper Class (objeto)

        System.out.println("Idade (int):         " + idade);
        System.out.println("Idade (typecast):    " + idadeComCast);
        System.out.println("Idade (Integer):     " + idadeWrapper);

        System.out.println("\n===== TIPOS REAIS (ponto flutuante) =====");

        // float precisa do sufixo 'f'
        float salario = 1825.50f;
        float salarioComCast = (float) 1825.50;    // typecast explícito
        Float salarioWrapper = new Float(1825.50); // Wrapper Class

        System.out.println("Salário (float):     " + salario);
        System.out.println("Salário (typecast):  " + salarioComCast);
        System.out.println("Salário (Float):     " + salarioWrapper);

        // double tem maior precisão que float (padrão para números reais em Java)
        double pi = 3.14159265358979;
        System.out.println("Pi (double):         " + pi);

        System.out.println("\n===== TIPO CARACTERE =====");

        // char aceita apenas 1 caractere, usa aspas simples
        char letra = 'G';
        char letraComCast = (char) 'G';       // typecast explícito
        Character letraWrapper = new Character('G'); // Wrapper Class

        System.out.println("Letra (char):        " + letra);
        System.out.println("Letra (typecast):    " + letraComCast);
        System.out.println("Letra (Character):   " + letraWrapper);

        System.out.println("\n===== TIPO LÓGICO =====");

        // boolean aceita apenas true ou false
        boolean casado = false;
        boolean casadoComCast = (boolean) false;    // typecast explícito
        Boolean casadoWrapper = new Boolean(false); // Wrapper Class

        System.out.println("Casado (boolean):    " + casado);
        System.out.println("Casado (typecast):   " + casadoComCast);
        System.out.println("Casado (Boolean):    " + casadoWrapper);

        System.out.println("\n===== TIPO TEXTO =====");

        // String não é tipo primitivo — é uma classe
        String nome = "Mariana";
        System.out.println("Nome (String):       " + nome);

        System.out.println("\n===== CONVERSÃO int → String =====");

        int numero = 42;
        String numeroTexto = Integer.toString(numero); // converte int para String
        System.out.println("Número como texto:   " + numeroTexto);
        System.out.println("Tipo após conversão: String");
    }
}
