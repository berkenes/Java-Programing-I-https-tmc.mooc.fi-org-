import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (weightOfSuitcase() + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
        }
    }
    public int weightOfSuitcase() {
        int weight = 0;
        for (Suitcase e : suitcases) {
            weight += e.totalWeight();
        }
        return weight;
    }
    public void printItems(){
        for (Suitcase e: suitcases) {
            e.printItems();
        }
    }

    @Override
    public String toString() {
       String output=  "";
String weightOut = "(" + this.weightOfSuitcase() + " kg)";
if(suitcases.isEmpty()){
    output = "No suitcases";
}
if(suitcases.size() == 1){
    output = "1 Suitcase";
}
else{
    output = suitcases.size() +" suitcases";
}
return weightOut + output;
    }
}
