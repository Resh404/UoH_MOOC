public class Agent {
    private String firNam;
    private String lasNam;
    public Agent(String firNam, String lasNam){
        this.firNam = firNam;
        this.lasNam = lasNam;
    }
    public void print(){
        System.out.println("My name is " + this.lasNam + ", " + firNam + " " + lasNam);
    }
    @Override
    public String toString(){
        return "My name is " + this.lasNam + ", " + firNam + " " + lasNam;
    }
}
