//package CardGames;
import java.util.Random;
import java.util.ArrayList;

public class Deck{
    private int top;
    private ArrayList<Card> storage;
    
    public Deck(){
        top = 0;
        char [] suits = {'H', 'D', 'S', 'C'};
        char [] ranks = {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};
        storage = new ArrayList<Card>();

        Card C1;
        for (int s = 0; s < suits.length; s++)
            for (int r = 0; r < ranks.length; r++)
            {
                C1 = new Card(ranks[r], suits[s]);
                storage.add(C1);
            }
    
    }
    public void display() 
    {
        for(int i=0;i<52;i++){

        if(i % 13 == 0){
            System.out.println();
        }
        storage.get(i).display();
        System.out.print(", ");
    }
    // need to complete
    }

public void shuffle()
{
        Random rand = new Random();
        for(int i=0;i<52;i++){
            Card ogCard = storage.get(i);
            int newDeck = rand.nextInt(52);
            storage.set(i,storage.get(newDeck));
            storage.set(newDeck,ogCard);
    }
}

public Card deal()
{
        Card t = storage.get(top);
        top++;
        return t;
    }

public int cardsLeft() // how many cards are left in the deck
    {
        return 52-top;
    }
}

    
