/*
Rowland Sanders
CECS 277-01
Prog 6 - Memento
11/24/2020

I certify that this program is my is my own work. I did not copy any part of this program from any other source. I further certify that I typed each and every line of code in this program.
*/



import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
      
        Originator originator = new Originator();
        CareTaker CareTaker = new CareTaker();

        long beginning, ending;
        double totalTime;

        BigInteger f;
        BigInteger i = BigInteger.ZERO; //static BigInteger ZERO CONSTANT
        BigInteger j = BigInteger.ONE; //static BigInteger ONE CONSTANT

        while ( i.compareTo(BigInteger.valueOf(1001)) < 0) {

            beginning = System.nanoTime();
            ////////////////////////////////
            f = fibo(i, CareTaker);
            originator.setState(f);
            CareTaker.add(originator.saveStateToMemento());
            ///////////////////////////////
            ending = System.nanoTime();

            totalTime = (ending - beginning) ;
            System.out.printf("Fibo(%d): %12d (NanoSecs: %5.3f)\n", i, f, totalTime);
            i = i.add(j); 
        }
    }
    public static BigInteger fibo(BigInteger n, CareTaker CareTaker) 
    {
        BigInteger i = BigInteger.ZERO; //static BigInteger ZERO CONSTANT
        BigInteger j = BigInteger.ONE; //static BigInteger ONE CONSTANT
        BigInteger k = BigInteger.TWO; //static BigInteger TWO CONSTANT

        if(CareTaker.getSize()<=1)
        {
          if (n.equals(i) || n.equals(j))
            return j;

          else
            return fibo(n.subtract(j),CareTaker).add(fibo(n.subtract(k),CareTaker));
        }
        else
        {
            return CareTaker.get(CareTaker.getSize()-1).getState().add(CareTaker.get(CareTaker.getSize()-2).getState());
        }

    }

}
