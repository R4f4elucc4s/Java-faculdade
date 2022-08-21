    import java.util.Scanner;

    public class OlaMundo2 {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Digite um número: ");
            int number1 = input.nextInt();
            System.out.println(number1);

            System.out.println("Digite um número: ");
            int number2 = input.nextInt();

            System.out.println(number1 + number2);
            System.out.println(number1 - number2);
            System.out.println(number1 * number2);
            System.out.println(number1 / number2);

            if (number1 == number2){
                System.out.println("É igual!!");
            }
            if (number1 != number2){
                System.out.println("É Diferente!!");
            }
            if (number1 > number2){
                System.out.println("É Maior!!");
            }
            if(number1 < number2){
                System.out.println("É menor!!!");
            }
            if (number1 >= number2){
                System.out.println("Maior igual!!");
            }
            if (number1 <= number2){
                System.out.println("Menor igual!!!");
            }


        }
    }


