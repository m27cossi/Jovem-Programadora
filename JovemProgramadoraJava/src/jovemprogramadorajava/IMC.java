package jovemprogramadorajava;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double peso, altura, imc;
        char sexo;
        
        System.out.println("Digite o seu genero - H para homem e M para mulher");
    sexo = scan.next().charAt(0);
    
    if(sexo != 'h' || sexo != 'm') {
        System.err.println("Voce digitou um sexo invalido");
        System.exit(0);
        
        System.out.println("Digite seu peso");
        peso = scan.nextDouble();
       
        System.out.println("Digite sua altura");
        altura = scan.nextDouble();
        
        imc = peso / (altura * altura);
    
                System.out.println("Seu imc eh: " + imc);
                if (sexo == 'M' || sexo == 'm') {
        
        if(imc > 39.0){
            System.out.println("Seu indice eh obesidade morbida");
        }else if(imc >= 30 && imc <= 39){
        System.out.println("Seu indice eh obesidade moderna");
        }else if (imc >= 25 && imc <= 24.9) {
            System.out.println("Seu indice eh obesidade leve");
        }else if (imc >= 20 && imc <= 24.9) {
            System.out.println("Seu indice eh normal");
        }else {
            System.out.println("Seu indice eh abaixo do normal");
        }
    }
                }
    }
}
