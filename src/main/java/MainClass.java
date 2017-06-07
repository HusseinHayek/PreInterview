
import java.util.Scanner;

public class MainClass {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Deck deck = new Deck();
        Card card;
        Scanner scan = new Scanner(System.in);
        int choice;
        System.out.println("A new deck was generated in order!");
        System.out.println("Select the apropriate function:");
        System.out.println("1- Suffle the deck");
        System.out.println("2- Deal one card from the deck");
        System.out.println("3- Create a new deck");
        System.out.println("4- Exit");
        loop:while(true){
            choice = scan.nextInt();
            switch (choice) {
            case 1:
                deck.suffle();
                System.out.println("Deck Shuffled!");
                break;
            case 2:
                card = deck.dealOneCard();
                if(card==null)
                    System.out.println("Deck is empty!");
                else
                    System.out.println(card.toString()+" was dealt!");
                break;
            case 3:
                deck = new Deck();
                System.out.println("A new deck was generated in order!");
                break;
            case 4:
                break loop;
            default:
                System.out.println("Invalid Choice!");
        }
        }
    }
}
