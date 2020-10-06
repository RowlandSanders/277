public class Card {

    private Deck.Suit suit;
    private Deck.Rank rank;

    public Card(Deck.Rank r, Deck.Suit s){

        rank = r;
        suit = s;

    }
    
    public void display(){
        //for case ten
        if(rank.getRank() == 'T' && suit.getSuit()=='H'){ 
            System.out.print("10 of Hearts");
        }
        else if(rank.getRank() == 'T' && suit.getSuit()=='S'){ 
            System.out.print("10 of Spades");
        }
        else if(rank.getRank() == 'T' && suit.getSuit()=='C'){ 
            System.out.print("10 of Clubs");
        } 
        else if(rank.getRank() == 'T' && suit.getSuit()=='D'){ 
            System.out.print("10 of Diamond");
        }

        //for case ace
        else if(rank.getRank() == 'A' && suit.getSuit()=='H'){ 
            System.out.print("Ace of Hearts");
        }
        else if(rank.getRank() == 'A' && suit.getSuit()=='S'){ 
            System.out.print("Ace of Spades");
        }
        else if(rank.getRank() == 'A' && suit.getSuit()=='C'){ 
            System.out.print("Ace of Clubs");
        } 
        else if(rank.getRank() == 'A' && suit.getSuit()=='D'){ 
            System.out.print("Ace of Diamond");
        }
        //for case king
        else if(rank.getRank() == 'K' && suit.getSuit()=='H'){ 
            System.out.print("King of Hearts");
        }
        else if(rank.getRank() == 'K' && suit.getSuit()=='S'){ 
            System.out.print("King of Spades");
        }
        else if(rank.getRank() == 'K' && suit.getSuit()=='C'){ 
            System.out.print("King of Clubs");
        } 
        else if(rank.getRank() == 'K' && suit.getSuit()=='D'){ 
            System.out.print("King of Diamond");
        }

        //for jack case
        else if(rank.getRank() == 'J' && suit.getSuit()=='H'){ 
            System.out.print("Jack of Hearts");
        }
        else if(rank.getRank() == 'J' && suit.getSuit()=='S'){ 
            System.out.print("Jack of Spades");
        }
        else if(rank.getRank() == 'J' && suit.getSuit()=='C'){ 
            System.out.print("Jack of Clubs");
        } 
        else if(rank.getRank() == 'J' && suit.getSuit()=='D'){ 
            System.out.print("Jack of Diamond");
        }

        //for case queen
        else if(rank.getRank() == 'Q' && suit.getSuit()=='H'){ 
            System.out.print("Queen of Hearts");
        }
        else if(rank.getRank() == 'Q' && suit.getSuit()=='S'){ 
            System.out.print("Queen of Spades");
        }
        else if(rank.getRank() == 'Q' && suit.getSuit()=='C'){ 
            System.out.print("Queen of Clubs");
        } 
        else if(rank.getRank() == 'Q' && suit.getSuit()=='D'){ 
            System.out.print("Queen of Diamond");
        }

        //for numbers
        else if(suit.getSuit()=='H'){
            System.out.print(rank.getRank()+" of Hearts"); 
        }
        else if(suit.getSuit()=='S'){
            System.out.print(rank.getRank()+" of Spades"); 
        }        
        else if(suit.getSuit()=='C'){
            System.out.print(rank.getRank()+" of Clubs"); 
        }
        else{
            System.out.print(rank.getRank()+" of Diamonds"); 
        }

    }

    public int getValue() {
        Card c = new Card(rank,suit);
        if (rank.getRank() == 'A') {
            return 1;
        }
        else if (rank.getRank() == '2') {
            return 2;

        }
        else if (rank.getRank() == '3') {
            return 3;

        }
        else if (rank.getRank() == '4') {
            return 4;

        }
        else if (rank.getRank() == '5') {
            return 5;

        }
        else if (rank.getRank() == '6') {
            return 6;

        }
        else if (rank.getRank() == '7') {
            return 7;

        }
        else if (rank.getRank() == '8') {
            return 8;
            
        }
        else if (rank.getRank() == '9') {
            return 9;

        }
        else if (rank.getRank() == 'T') {
            return 10;

        }
        else if(rank.getRank() == 'J'){
            return 11;

        }
        else if(rank.getRank() == 'Q'){
            return 12;

        }
        else if(rank.getRank() == 'K'){
            return 13;

        }
        else {
            return 0;

        }
    }
}