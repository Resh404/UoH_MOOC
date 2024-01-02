import java.util.HashMap;

public class Abbreviations {
    HashMap<String, String> abbNam;

    //Constructors
    public Abbreviations(){
        this.abbNam = new HashMap<>();
    }

    //Methods
    public void addAbbreviation(String abbreviation, String explanation){
        String saniAbb = sanitizedString(abbreviation);
        String sanExpl = sanitizedString(explanation);

        if (hasAbbreviation(saniAbb)){
            System.out.println("Abbreviation already exists.");
            return;
        }

        this.abbNam.put(saniAbb, sanExpl);
    }

    public boolean hasAbbreviation(String abbreviation){
        String saniAbb = sanitizedString(abbreviation);

        if (this.abbNam.containsKey(abbreviation)){
            return true;
        }

        return false;
    }

    public String findExplanationFor(String abbreviation){
        String saniAbb = sanitizedString(abbreviation);

        return this.abbNam.get(saniAbb);
    }

    public static String sanitizedString(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }
}
