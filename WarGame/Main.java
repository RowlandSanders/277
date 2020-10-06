//Rowland Sanders
//CECS 277-01
//Prog 3 - War
//10/6/2020
//I certify that this program is my own original work. I did not copy any part of this program from            
//any other source. I further certify that I typed each and every line of code in this program

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;



public class Main {
  public static int menu(){
        Scanner choice = new Scanner(System.in);

        System.out.println("\n - War Menu - ");
        System.out.println("1) New Deck");
        System.out.println("2) Shuffle Deck");
        System.out.println("3) Show Deck");
        System.out.println("4) Play War");
        System.out.println("5) Exit\n");      

        System.out.print("Choice:");
        int x = choice.nextInt();
        System.out.print("\n");
        return x;
    }
    
    public static void main(String[] args) {

        Deck mainDeck = new Deck();
        Hand player1 = new Hand(mainDeck);
        Hand player2 = new Hand(mainDeck);
        int choice;

        do{
            choice = menu();
            if (choice == 1){
                mainDeck = new Deck();
                player1 = new Hand(mainDeck);
                player2 = new Hand(mainDeck);
                System.out.println("New deck has been created");
            }

            else if (choice == 2){
                mainDeck = new Deck();
                mainDeck.shuffle();
                player1 = new Hand(mainDeck);
                player2 = new Hand(mainDeck);
                System.out.println("Deck has been shuffled");
            }

            else if (choice == 3){
                System.out.println(" - Player1's Deck - ");
                player1.display();
                System.out.println("\n - Player2's Deck - ");
                player2.display();

            }

            else if (choice == 4){
                playGame();
            }

            else if (choice == 5){
                System.out.println("Closing program...");
                System.exit(0);
            }

            else{
                System.out.println("Please choose a number option from the menu.\n");
            }
        }
        while(choice != 5); 
    }

    public static void playGame(){

        Scanner input = new Scanner(System.in);
        System.out.print("What will the Max Battle Number? ");
        
        int count = input.nextInt();
        System.out.print("\n");


        Deck shuffledDeck = new Deck();
        shuffledDeck.shuffle();

        Hand player1Hand = new Hand(shuffledDeck);
        Hand player2Hand = new Hand(shuffledDeck);

        System.out.println(" - Player1's Deck - ");
        player1Hand.display();

        System.out.println("\n - Player2's Deck - ");
        player2Hand.display();

        System.out.print("\nPress any key to continue.");

        if(input.hasNext()) {
            System.out.print("\n");
            while (count != 0 && player1Hand.cardsLeft() != 0 && player2Hand.cardsLeft() != 0) {

                Card player1Card = player1Hand.deal();
                System.out.print("player 1 plays Card " );
                player1Card.display();
                
                System.out.println();
                Card player2Card = player2Hand.deal();
                System.out.print("player 2 plays Card ");
                player2Card.display();

                System.out.println();
                if(player1Card.getValue() > player2Card.getValue()){
                    System.out.println("player 1 wins the round");
                    player1Hand.add(player1Card);
                    player1Hand.add(player2Card);
                    count--;
                }
                else if(player1Card.getValue() < player2Card.getValue()){
                    System.out.println("player 2 wins the round");
                    player2Hand.add(player1Card);
                    player2Hand.add(player2Card);
                    count--;
                }
                else{
                    System.out.println("WAR TIME!");

                    if(player1Hand.cardsLeft() < 4){
                        System.out.println("player 1 does not have enough cards for war!");
                    }

                    else if(player2Hand.cardsLeft() < 4){
                        System.out.println("player 2 does not have enough cards for war!");  
                    }

                    else{
                        warGame(player1Card, player2Card, player1Hand, player2Hand);
                        count--;
                    }

                }
            }
            if(player1Hand.cardsLeft() > player2Hand.cardsLeft() || player2Hand.cardsLeft() == 0){
                System.out.println("game over");
                System.out.println("player 1 wins the game");
            }

            else if(player1Hand.cardsLeft() < player2Hand.cardsLeft() || player1Hand.cardsLeft() == 0){
                System.out.println("game over");
                System.out.println("player 2 wins the game");
            }

            else{
                System.out.println("game tied");
            }
        }
    }
    
    public static void warGame(Card first, Card second, Hand player1Hand, Hand player2Hand){
        ArrayList<Card> win = new ArrayList<>();

        win.add(first);
        win.add(second);
        
        boolean tie = true;
        while(tie == true){
          
            Card templayer1Hand = null;
            Card templayer2Hand = null;

            if(player1Hand.cardsLeft() < 4){
                System.out.println("player 1 does not hold enough cards for war!");

                player1Hand.add(first);
                player2Hand.add(second);

                tie = false;
            }
            else if(player2Hand.cardsLeft() < 4){
                System.out.println("player 2 does not hold enough cards for war!");

                player1Hand.add(first);
                player2Hand.add(second);

                tie = false;
            }
            else{
                for(int i = 0; i < 4; i++){
                    System.out.print("war card for player 1 Card is xx");
                    templayer1Hand = player1Hand.deal();

                    System.out.println();
                    win.add(templayer1Hand);

                    System.out.print("war card for player 2 Card is xx");
                    templayer2Hand = player2Hand.deal();

                    System.out.println();
                    win.add(templayer2Hand);

                }

                System.out.print("war card for player 1 is ");
                templayer1Hand.display();
                System.out.println();

                System.out.print("war card for player 2 is ");
                templayer2Hand.display();
                System.out.println();

                if(templayer1Hand.getValue() > templayer2Hand.getValue()){
                    System.out.println("player 1 wins the war round");

                    for(int i = 0; i < win.size(); i++){
                        player1Hand.add(win.get(i));
                        tie = false;
                    }
                }

                else if(templayer1Hand.getValue() < templayer2Hand.getValue()){
                    System.out.println("player 2 wins the war round");

                    for(int i = 0; i < win.size(); i++){
                        player2Hand.add(win.get(i));
                        tie = false;
                    }
                }

                else{
                    System.out.println("war round tie");
                    tie = true;
                }
            }
        }
    }
}