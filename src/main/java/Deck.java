import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author Hussein
 * The deck contains a list of cards and a variable indicating how many cards
 * are available
 */
public class Deck {
    private LinkedList<Card>cards;
    private int size;
    public Deck(){
        cards = new LinkedList();
        generateOrderedDeck();
        size = 52;
    }
    
    private void generateOrderedDeck(){
        for(int i=0;i<4;i++){
            for(int j=0;j<13;j++){
                cards.add(new Card(i,j));
            }
        }
    }
    
    public void suffle(){
        LinkedList<Card> temp = new LinkedList();
        for(int i=0;i<size;i++){
            Random rand = new Random();
            int nextcard = rand.nextInt(cards.size());
            temp.add(cards.remove(nextcard));
        }
        for(int i=0;i<size;i++){
            cards.add(temp.get(i));
        }
    }
    
    public Card dealOneCard(){
        if(cards.size()==0)
            return null;
        Random rand = new Random();
        int nextcard = rand.nextInt(cards.size());
        size--;
        return cards.remove(nextcard);
    }
}
