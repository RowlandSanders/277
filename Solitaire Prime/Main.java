/*

Rowland Sanders
Prog - CECS 277-01
Solitaire Prime
09/08/2020
 I certify that this program is my own original work. I did not copy any part of this program from
any other source. I further certify that I typed each and every line of code in this program

 */
//package CardGames;

import java.util.Scanner;

public class Main {
        public static boolean play(Deck d){
            System.out.println("Playing Solitaire Prime!!!");
            int stack = 0;
            int count = 0;
            for(int i=0; i < 52;i++){
               Card c = d.deal();
                c.display();
                stack += c.getValue();
                if(isPrime(stack)){
                    System.out.println("Prime: " +stack);
                    stack = 0;
                    count++;
                }
                
            }
            if (d.cardsLeft() == 0 && stack == 0){
                System.out.println("Winner in "+ count+ " piles!");
                return true;
            }
            else {
                System.out.println("Loser");
                return false;
            }
        }

        public static boolean isPrime(int num){
            if (num == 1){
                return false;
            }
            for(int i= 2; i < num; i++){
                if (num % i == 0){
                    return false;
                }
            }
            return true;
        }

        public static int menu(){
            System.out.println("  ");
            System.out.println("1) New Deck");
            System.out.println("2) Display Deck");
            System.out.println("3) Shuffle Deck");
            System.out.println("4) Play Solitaire Deck");
            System.out.println("5) Exit Deck");
            Scanner input = new Scanner(System.in);
            return input.nextInt();
        }
    public static void main(String[] args) {
        int x = menu();
        Deck d = new Deck();
        while(x!=5) {
            if (x == 1) {
                d = new Deck();
                x = menu();
            } else if (x == 2) {
                d.display();
                x = menu();
            } else if (x == 3) {
                d.shuffle();
                x = menu();
            } else if (x == 4) {
                play(d);
                x = menu();

            } else if (x == 6) {
                int win = 0;
                int lose = 0;
                for (int i = 0; i <1000; i++) {
                    d = new Deck();
                    d.shuffle();
                    if (play(d)) {
                        win++;
                    }
                    else
                        lose++;
                    }
                System.out.println("  ");
                System.out.println("In 1000 games, you won: "+ win + " and lost: "+lose);
                break;
                }

            }


            }
        }

