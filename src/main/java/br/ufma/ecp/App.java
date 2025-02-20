package br.ufma.ecp;

import br.ufma.ecp.token.Token;
import br.ufma.ecp.token.TokenType;
public class App {

    // -------------TESTE UM CARACTERE
    // public static void main(String[] args) throws Exception {
    // String input = "8+5-7+9";
    // Parser p = new Parser (input.getBytes());
    // p.parse();
    // }

    // -------------TESTE DOIS CARACTERES
    // public static void main( String[] args )
    // {
    // String input = "123 + 89- 876+0";
    // Parser p = new Parser (input.getBytes());
    // p.parse();
    // }

    // -------------VERIFICANDO O SCANNER
    // public static void main(String[] args) {
    // String input = "123-692+123+0";
    // Scanner scan = new Scanner (input.getBytes());
    // System.out.println(scan.nextToken());
    // System.out.println(scan.nextToken());
    // System.out.println(scan.nextToken());
    // System.out.println(scan.nextToken());
    // System.out.println(scan.nextToken());
    // System.out.println(scan.nextToken());
    // System.out.println(scan.nextToken());

    // }

    // -------------VERIFICANDO O SCANNER COM USO DE IDENTIFICADORES
    // public static void main(String[] args) {
    // String input = "22 + preco - 103 - desconto";
    // Scanner scan = new Scanner (input.getBytes());
    // for (Token tk = scan.nextToken(); tk.type != TokenType.EOF; tk =
    // scan.nextToken()) {
    // System.out.println(tk);
    // }
    // }

    // -------------VERIFICANDO O PARSER UTILIZANDO IDENTIFICADOR

    // public static void main( String[] args )throws Exception{
    // String input = "let a = 33 + 5 - 8;";
    // Parser p = new Parser (input.getBytes());
    // p.parse();

    // }
    // }
    // }

    // -------------VERIFICANDO LET NO ANALISADOR LEXICO
    // public static void main(String[] args) {
    // String input = "let teste= 22 + 1;";
    // Scanner scan = new Scanner (input.getBytes());
    // for (Token tk = scan.nextToken(); tk.type != TokenType.EOF; tk =
    // scan.nextToken()) {
    // System.out.println(tk);
    // }
    // }

    // -------------VERIFICANDO LET NO ANALISADOR LEXICO
    // public static void main(String[] args) {
    // String input = "289";
    // Scanner scan = new Scanner (input.getBytes());
    // System.out.println(scan.nextToken());
    // }
    // }

    // -------------VERIFICANDO LET NO ANALISADOR LEXICO
    // public static void main(String[] args) {
    // String input = "45 variavel while if";
    // Scanner scan = new Scanner (input.getBytes());
    // for (Token tk = scan.nextToken(); tk.type != TokenType.EOF; tk =
    // scan.nextToken()) {
    // System.out.println(tk);
    // }
    // }
    // }

    // -------------VERIFICANDO LET NO ANALISADOR LEXICO

    public static void main(String[] args) {
        String input = """
                // é um comentario 10
                45 \"hello\" variavel + while < , if
                /*
                comentario em bloco
                */
                42 ola

                """;
        Scanner scan = new Scanner(input.getBytes());
        for (Token tk = scan.nextToken(); tk.type != TokenType.EOF; tk = scan.nextToken()) {
            System.out.println(tk);
        }
    }

}

// @Test
// void addition() {
// assertEquals(2, 1 + 1);
// }