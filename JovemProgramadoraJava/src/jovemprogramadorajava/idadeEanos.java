
package jovemprogramadorajava;

import java.util.Scanner;

public class idadeEanos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        
        System.out.println("Digite o numero que voce quer verificar");
        numero = scan.nextInt();
        
       double resultado = numero % 2;
       if(numero % 2 == 0){
       System.out.println("Seu numero eh par");
       }
       else{
           System.out.println("Seu numero eh impar");
       }
       
    }
   
}
