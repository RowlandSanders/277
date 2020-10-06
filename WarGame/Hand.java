import java.util.ArrayList;

public class Hand extends Deck {
  
    private ArrayList<Card> player;
    
    public Hand(Deck d){ //generates and stores for hand

        ArrayList<Card> temp = new ArrayList<>();
        this.player = temp;
        for(int i = 0; i < 26; i++){
            temp.add(d.deal());
        }
    }

    public int cardsLeft(){ //checks how many cards are left in hand
        return player.size();
    }

    public Card deal(){ //deals card

        Card card = player.get(0);
        player.remove(0);
        return card;
    }    

    public void add(Card card){ //adds card 
        player.add(card);
    }

    public void display(){ //for display deck in main
        for(int i = 0; i < player.size(); i++){
            if (i != 0 && i%26==0){
                System.out.print("\n");
            }
            player.get(i).display();
            System.out.print("\n");
        }
        System.out.println();

    }
}