import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // recebe input do primeiro e segundo parâmetro
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scanner.nextInt();

        try{ // chama o método contar e verifica se a exceção se aplica
            contar(parametroUm, parametroDois);
        }catch(Exception ParametrosInvalidosException){ // dispara a mensagem de erro para o usuário
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        // verifica se o primeiro parâmetro é maior que o segundo, True dispara a Exception
        if(parametroDois < parametroUm){
            throw new ParametrosInvalidosException();
        }

        // variável contagem obtém o valor da subtração entre os parâmetros
        int contagem = parametroDois - parametroUm;

        // cria um contador para que os números impressos sejam em ordem crescente
        int numero = 1;
        // laço que usa como parâmetro o valor da variável contagem até zerar
        for( ; contagem > 0 ; contagem--){
            System.out.println("Imprimindo o número " + numero);
            numero++;
        }
    }
}
