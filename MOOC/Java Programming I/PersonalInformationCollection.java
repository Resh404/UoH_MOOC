public class PersonalInformationCollection {
    private String firNam;
    private String lasNam;
    private int id;
    public PersonalInformationCollection(String firNam, String lasNam, int id){
        this.firNam = firNam;
        this.lasNam = lasNam;
        this.id = id;
    }

    @Override
    public String toString(){
        return (this.firNam + " " + this.lasNam);
    }
}
