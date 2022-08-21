 import java.util.Scanner;

public class exTrianguloRetangulo {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Digite a base: ");
        int base = input.nextInt();
        System.out.println(base);

        System.out.println("Digite um altura: ");
        int altura = input.nextInt();

        int area = ((base * altura)/2);
        System.out.println("A área do triângulo retângulo é: "+ area + " cm²");
    }
}

