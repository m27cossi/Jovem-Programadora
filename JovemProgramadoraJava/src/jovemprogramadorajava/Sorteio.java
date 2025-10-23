package jovemprogramadorajava;

import java.util.Random;


public class Sorteio {
    public static void main(String[] args) {
        Random gerador = new Random();
        String[] alunas = new String[9];
        int numeroAleatorio;
        
        alunas[0] = "Monique";
        alunas[1] = "Sara";
        alunas[2] = "Layssa";
        alunas[3] = "Layara";
        alunas[4] = "Juliana";
        alunas[5] = "Kerrolyn";
        alunas[6] = "Laura";
        alunas[7] = "Millena";
        alunas[8] = "Gabrielle";
        
        numeroAleatorio = gerador.nextInt(8);
        
        System.out.println("A sorteada foi:" + alunas[numeroAleatorio]);
    }
    
}
