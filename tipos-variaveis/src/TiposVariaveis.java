public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        final double VALOR_DE_PI = 3.14; // final e a caixa alta é o valor final e a variavel nao pode mudar mais tornando uma constante
        String dadoTexto = "Valor de Pi = ";
        System.out.println("Olá! " + dadoTexto + VALOR_DE_PI);
        
        String nome = "JOSHUAN";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        String doador = doadorOrgao ? "É doador de órgãos" : "Não é doador de órgãos";
        System.out.println( "Nome: " + nome + " Idade: " + idade + " Peso: " + peso + " Sexo: " + sexo + " Obs: " + doador );
        
    }
}
