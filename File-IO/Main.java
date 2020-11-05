import java.util.Scanner;
import java.io.*;


public class Main {
    public static void main(String [] args) throws IOException{

        String maxR = "";
        String minR = "";
        
        double bigComm = Double.MIN_VALUE;
        double smallComm = Double.MAX_VALUE;

        double avg = 0.0;
        double utilitiesCount = 0.0;

        Scanner scan = new Scanner(System.in);
        String fileName;

        System.out.print("\n");
        System.out.print("Please enter the data file: ");
        fileName = scan.nextLine();
        scan.close();

        BufferedReader br = new BufferedReader(new FileReader(fileName));

        while(br.readLine() != null){

            String line = br.readLine();
            double rate = Double.parseDouble(line.split(",")[6]);

            avg = rate + avg;

            if(bigComm < rate){
                maxR = line;
                bigComm = rate;
            }

            if(smallComm > rate){
                minR = line;
                smallComm = rate;
            }
            utilitiesCount++;

        }
        br.close();

        System.out.println("\nThe average commercial rate is: " + (avg / utilitiesCount));

        System.out.println("\nThe highest rate is: "+ maxR.split(",")[2]+"("+ maxR.split(",")[0]+", "+ maxR.split(",")[3]+") - $"+maxR.split(",")[6]);

        System.out.println("\nThe lowest rate is: "+ minR.split(",")[2]+"("+ minR.split(",")[0]+", "+minR.split(",")[3]+") - $"+minR.split(",")[6] + ".0");

    }
    
}
