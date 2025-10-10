package jovemprogramadorajava;

import java.util.Scanner;

      
public class Média {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double nota01, nota02, nota03, media;
        
        System.out.println("Qual eh a  nota01 do seu aluno? ");
       nota01= scan.nextDouble();
       
       System.out.println("Qual eh a  nota02 do seu aluno? ");
       nota02= scan.nextDouble();
        
        System.out.println("Qual eh a  nota03 do seu aluno? ");
       nota03= scan.nextDouble();
       media = (nota01 + nota02 + nota03) / 3;
       
       System.out.println("A media das notas eh: " + media);
    }
    
}
