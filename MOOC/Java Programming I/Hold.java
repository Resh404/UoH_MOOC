import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private int suitCounter;
    private int currWeight;
    private ArrayList<Suitcase> suitCas;

    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitCas = new ArrayList<>();
        this.suitCounter = 0;
        this.currWeight = 0;
    }

    public void addSuitcase(Suitcase suitcase){
        suitCounter++;
        this.currWeight += suitcase.totalWeight();
        suitCas.add(suitcase);
    }
    public void printItems(){
        if (suitCas.isEmpty()){
            return;
        }

        for(int i=0; i<suitCas.size(); i++){
            suitCas.get(i).printItems();
        }
    }

    @Override
    public String toString(){
        String suitFormat = " suitcases";
        if (this.suitCounter < 2){
            suitFormat = " suitcase";
        }

        return (suitCounter + suitFormat + " (" + this.currWeight + " kg)");
    }
}
