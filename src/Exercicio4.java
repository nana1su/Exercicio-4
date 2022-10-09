
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) throws Exception {
//Faça um Programa que peça as 4 notas bimestrais e mostre a média.
        Scanner teclado = new Scanner(System.in);
        
        //1 bimestre
        System.out.print("Digite a nota do 1 bimestre: ");
        double n1 = teclado.nextDouble();
        //2 bimestre
        System.out.print("Digite a nota do 2 bimestre: ");
        double n2 = teclado.nextDouble();
        //3 bimestre
         System.out.print("Digite a nota do 3 bimestre: ");
         double n3 = teclado.nextDouble();
        //4 bimestre
        System.out.print("Digite a nota do 4 bimestre: ");
        double n4 = teclado.nextDouble();

        teclado.close();

        //Variável Média
        double media = (n1 + n2 + n3 + n4) / 4;

        //Resultado
        System.out.print("A média é: " + media);
        
    }
}