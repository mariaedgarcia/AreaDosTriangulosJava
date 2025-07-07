import java.util.Scanner;
 
    public class MetodoCalculadora {
 
    public static double somar(double n1, double n2){
        return n1 + n2;
 }
 
    public static double subtrair(double n1, double n2){
        return n1 - n2;
 }
 
     public static double multiplicar(double n1, double n2){
        return n1 * n2;
 }
 
    public static double dividir (double n1, double n2){
    if (n2 == 0){
        System.out.println("Erro na divisao por zero");
    }
        return n1 / n2;
 }
 
 public static double restoDivisao(double n1, double n2){
        return n1 % n2;
 }

 public static void main (String[] args){

    Scanner scanner = new Scanner(System.in);
    boolean continuar = true;

    while (continuar){
        System.out.println("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();

        System.out.println("\nEscolha a operação");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5- Resto da divisao");
        System.out.println("Opcao: ");
        int opcao = scanner.nextInt();
        double resultado;

        switch (opcao){
            case 1:
                resultado = somar(num1, num2);
                System.out.println("Resultado: "+resultado);
                break;
            case 2:
                resultado = subtrair(num1, num2);
                System.out.println("Resultado: "+resultado);
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                System.out.println("Resultado: "+resultado);
                break;
            case 4:
                resultado = dividir(num1, num2);
                System.out.println("Resultado: "+resultado);
                break;
            case 5:
                resultado = restoDivisao(num1, num2);
                System.out.println("Resultado: "+resultado);
                break;
            default:
                System.out.println("Opcao invalida!!");
                break;
        }
        System.out.println("\nDeseja continuar? (sim / nao)");
        String resposta = scanner.next();

        if (!resposta.equalsIgnoreCase("s")){
            continuar = false;
            System.out.println("Calculadora encerrada!");
        }
    }
    scanner.close();
  }
}