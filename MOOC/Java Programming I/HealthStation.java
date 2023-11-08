public class HealthStation {
    private int weighTesting;
    public HealthStation(){
        this.weighTesting = 0;
    }
    public int weigh(PersonV2 person) {
        // return the weight of the person passed as the parameter
        weighTesting++;
        return person.getWeight();
    }
    public void feed(PersonV2 person){
        int tempWeight = person.getWeight() + 1;
        person.setWeight(tempWeight);
    }

    public int weighings(){
        return weighTesting;
    }
}