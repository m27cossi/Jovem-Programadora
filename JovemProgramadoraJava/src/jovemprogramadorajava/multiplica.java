package jovemprogramadorajava;

import java.util.Scanner;


public class multiplica {
    public static double multiplicar(double num1, double num2){
 return num1 * num2; 
   }
public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Digite o primeiro numero: ");
    double numero1 = entrada.nextDouble();
    
System.out.println("Digite o segundo numero: ");
double numero2 = entrada.nextDouble();

double resultado = multiplicar(numero1, numero2);

System.out.println("O resultado da multiplicacao eh: " + resultado);
}

}

