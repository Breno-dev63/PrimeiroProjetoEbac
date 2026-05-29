import java.util.Scanner;


public class PrimeiroProjeto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       System.out.println("opa, Digite seu nome completo:");
       String nome  = scanner.nextLine();

        System.out.println("Sua  idade:");
        int idade = scanner.nextInt();

        System.out.println("Fale sua altura:");
        double altura = scanner.nextDouble();

        System.out.println("Seu peso:");
        double peso = scanner.nextDouble();

        System.out.println("Seu Estado Civil:");
        String  estadoCivil = scanner.next();

        System.out.println("Seu Cpf:");
        double cpf = scanner.nextDouble();



        scanner.close();
        System.out.println("Seu nome é " + nome + ",Sua Idade " + idade + ",Sua alturta " + altura + ",Sua peso " + peso +  ",Sua cpf " + cpf + "estado civil" + estadoCivil);

    }
}