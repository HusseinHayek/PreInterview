/**
 *
 * @author Hussein
 * This class represents a card
 * For simplicity, the suit and face value will be represented by numbers
 * In our case, assume for suits:
 * 0: hearts
 * 1: spades
 * 2: clubs
 * 3: diamonds
 * And for face values
 * 0: Ace
 * Numbers will be the same -1 {2-10 -> 1-9}
 * Jack: 10
 * Queen: 11
 * King: 12
 */
public class Card {
    private int suit;
    private int face_value;
    
    public Card() {};
    public Card(int s,int fv){
        this.suit=s;
        this.face_value=fv;
    }
    public int getSuit() {return suit;}
    public int getFaceValue() {return face_value;}
    public void setSuit(int s){this.suit = s;}
    public void setFaceValue(int fv) {this.face_value=fv;}
    @Override
    public String toString(){
        if(this==null)
            return "No other cards are available!";
        String s = "";
        switch (face_value) {
            case 0:
                s="Ace";
                break;
            case 10:
                s="Jack";
                break;
            case 11:
                s="Queen";
                break;
            case 12:
                s="King";
                break;
            default:
                s=(face_value-1)+"";
        }
        switch (suit) {
            case 0:
                s =s+ " of Hearts";
                break;
            case 1:
                s =s+ " of Spades";
                break;
            case 2:
                s =s+ " of Clubs";
                break;
            case 3:
                s =s+ " of Diamonds";
        }
        return s;
    }
}
