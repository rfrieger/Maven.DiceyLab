import java.util.ArrayList;
import java.util.Arrays;

public class Bins {
    public int [] results;
    private int die = 0;
    private int rolls = 0;


    public Bins() {
        results = new int[1];

    }

    public Bins(int dice, int roll) {
        this.die = dice;
        this.rolls = roll;
        Dice rollDieResults = new Dice(die);
        results = new int[(die * 6 + 1)];


        for (int i = 0; i < rolls ; i++) {

            int diceRollNum = rollDieResults.rollAndSum();
            results[diceRollNum] ++;

        }
    }


    public int getResults(int query) {
        for (int i = die ; i < results.length ; i++) {

        }
        return results[query];
    }


    public void increment (int index) {
        results[index]++;
    }

    public void printReslults() {

        System.out.println("***");
        System.out.printf("Simulation of %2d dice tossed for %2d times. \n" , die, rolls);
        System.out.println("***" );
        System.out.println(" ");

        for (int i = die ; i < results.length ; i++) {
            double rate = (double)results[i]/(double)rolls;
           // System.out.printf(i + ": " +results[i] + ": " + rate);

            String star = "";
            double starNum = rate*100;
            for (int j = 0; j <starNum ; j++) {

                star += "*";
            }

           System.out.printf("%2d : %9d : %1.2f %s \n", i, results[i], rate, star );
        }
    }
}


