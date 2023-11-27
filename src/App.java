import java.util.Scanner;

public class App {
    public static void main(String[] args){
       
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem vindos ao cadstro");
        System.out.println("Seu primeiro nome: ");
        String nome = scan.next();
        System.out.println("Seu sobrenome: ");
        String sobrenome = scan.next();
        System.out.println("Sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua altura: ");
        double altura = scan.nextDouble();

        System.out.println("Você digitou as seguintes informações: ");
        System.out.println("Nome: " + nome + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Cadastro finalizado com sucesso!");
    }
}
