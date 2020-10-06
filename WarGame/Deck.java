import java.util.Random;
import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> current;
    private int top = 0;

    enum Suit{

        Hearts('H'), Diamonds('D'), Spades('S'), Clubs('C');

        private char suit;
        private Suit(char s){
            this.suit = s;
        }

        public char getSuit(){
            return this.suit;
        }
    }
    enum Rank{

        Ace('A'), n2('2'), n3('3'), n4('4'), n5('5'), n6('6'), n7('7'), n8('8'),
        n9('9'), Ten('T'), Jack('J'), Queen('Q'), King('K');
        
        private char rank;

        private Rank(char r){
            this.rank = r;
        }

        public char getRank(){
            return this.rank;
        }

    }

    public Card deal(){
      Card x = current.get(top++);
      return x;
    }
    
    public int cardsLeft(){
      return (current.size() - top);
    }    

    public Deck()
    {
        current = new ArrayList<>();
        Card C1;
        for (Suit suit : Suit.values())

            for (Rank rank : Rank.values())
            {
                C1 = new Card(rank, suit);
                current.add(C1);
            }
    }


    public void shuffle(){
        Random rand = new Random();

        for(int i = 0; i < 52; i++){

            int x = rand.nextInt(52);
            int y = rand.nextInt(52);
            
            Card temp = current.get(x);
            
            current.set(x,current.get(y));
            current.set(y,temp);
        }
    }


}