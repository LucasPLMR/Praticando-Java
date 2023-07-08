import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int random = new Random().nextInt(100);
        int tries = 0;
        while(tries < 5){
            System.out.println("Advinhe um número!");
            int guess = in.nextInt();
            tries++;
            if(guess == random) {
                System.out.println("Você acertou em " + tries + "tentativas!Parabéns");
                break;
            } else if (random < guess){
                System.out.println("Você errou, tente um número menor!");
                break;
            } else {
                System.out.println("Você errou, tente um número maior!");
            }
        }
        if (tries == 5){
            System.out.println("Você perdeu, o número era " + random);
        }
    }
}
