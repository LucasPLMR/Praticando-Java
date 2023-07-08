
public class Main {
    public static void main(String[] args) {

        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun Maverick");
        
        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        //média calculada das notas do filme
        double media = (9.8 + 6.9 + 8.3)/3;
        System.out.println("Nota do Filme: " + media);

        String sinopse;
        sinopse = """
                Filme: Top Gun
                Sinopse: Filme de aventura com galã dos anos 80
                Muito Bom!
                Ano de Lançamento:
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media)/2;
        System.out.println(classificacao);

    }
}