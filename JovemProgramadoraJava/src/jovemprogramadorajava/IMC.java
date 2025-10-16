package jovemprogramadorajava;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double peso, altura, imc;
        char sexo;
        
        System.out.println("Digite o seu genero - H para home e M para mulher");
    sexo = scan.next().charAt(0);
    
    if(sexo != 'h' || sexo != 'm') {
        System.out.println("Voce digitou um sexo invalido");
        System.exit(0);
    }
    }
}
