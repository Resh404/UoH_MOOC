import java.util.ArrayList;

public class ChangeHistory {
    ArrayList<Double> hist;

    //Constructos
    public ChangeHistory(){
        this.hist = new ArrayList<>();
    }

    //Methods
    public void add(double status){
        this.hist.add(status);
    }

    public void clear(){
        this.hist.clear();
    }

    @Override
    public String toString(){
        return "" + this.hist;
    }

    public double maxValue(){
        double max = 0;

        if (this.hist.isEmpty()){
            return 0;
        }

        for (double in : this.hist){
            if (in > max){
                max = in;
            }
        }

        return max;
    }

    public double minValue(){
        double min = hist.get(0);

        if (this.hist.isEmpty()){
            return 0;
        }

        for (double in : this.hist){
            if (in < min){
                min = in;
            }
        }

        return min;
    }

    public double avgValue(){
        double avg = 0;
        int counter = 0;

        if (this.hist.isEmpty()){
            return 0;
        }

        for (double in : this.hist){
            avg += in;
            counter++;
        }

        return avg/counter;
    }

}
