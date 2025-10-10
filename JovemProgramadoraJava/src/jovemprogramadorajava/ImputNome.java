package jovemprogramadorajava;

import java.util.Scanner;

public class ImputNome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String nome, sobrenome;
        
        System.out.println("Qual eh o seu nome?");
        nome = scan.nextLine();
        
        System.out.println("Digite o seu sobrenome");
        sobrenome = scan.nextLine();
        
        int idade;
        
        System.out.println("Qual eh sua idade?");
        idade = scan.nextInt();
        
        System.out.println("Seu nome eh " + nome + " e sua idade eh " + idade + " anos");
        
        
        
        
    }
}
