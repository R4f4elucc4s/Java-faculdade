import java.text.DecimalFormat;

public class exSalario {
    public static void main(String[] args) {
       double salario = 2000;
       int porcentagem = 10;
       double valorporcentagem = (porcentagem * salario)/100;
       double novoSalario = (salario + valorporcentagem);

        System.out.println(porcentagem+"% de " + salario +" é "+ valorporcentagem +" sendo assim, o novo Salário é "+ novoSalario+" R$");
    }
}
