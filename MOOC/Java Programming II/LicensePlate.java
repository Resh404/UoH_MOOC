public class LicensePlate {

    // these instance variables have been defined as final, meaning
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    //Constructors
    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    //Methods
    @Override
    public boolean equals(Object compare){
        if (this == compare){
            return true;
        }

        if (!(compare instanceof LicensePlate)){
            return false;
        }

        LicensePlate comparePlates = (LicensePlate) compare;

        if (this.country.equals(comparePlates.country) &&
                this.liNumber == comparePlates.liNumber){
            return true;
        }

        return false;
    }

    @Override
    public int hashCode(){
        return this.liNumber.hashCode() + this.country.hashCode();
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }
}