import java.util.ArrayList;

public class Bins {
    private ArrayList<Integer> results = new ArrayList<Integer>();
    private Integer die = 0;
    private Integer rolls = 0;


    public Bins() {

    }

    public Bins(Integer dice, Integer roll ) {
        this.die = dice;
        this.rolls = roll;
        Dice rollDieResults = new Dice(die);

        for (int i = 0; i < rolls ; i++) {
            ///
            
            results.add(rollDieResults.rollAndSum());
        }
    }


    public Integer getResults(Integer query) {
        Integer counter = 0;
        for (int i = 0; i <results.size() -1 ; i++) {
            if(results.get(i) == (query)) {
                counter++;
            }
        }
        return counter;
    }

}
