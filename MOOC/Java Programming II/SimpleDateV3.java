public class SimpleDateV3 {
    private int day;
    private int month;
    private int year;

    //Constructors
    public SimpleDateV3(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //Methods
    public void advance(){
        this.day = this.day + 1;

        if (this.day == 30){
            this.month = this.month + 1;
            this.day = 1;

            if (this.month == 12){
                this.year = this.year + 1;
                this.month = 1;
            }
        }
    }
    public void advance(int howManyDays){
        if ((this.day + howManyDays) >= 30){
            int remaingDays = (this.day + howManyDays)%30;
            int monthsPassed = ((this.day + howManyDays) - remaingDays)/30;
            this.month = this.month + monthsPassed;
            this.day = remaingDays;

            if (this.month > 12){
                int passedYears = this.month%12;
                int yearsToMOve = (this.month - passedYears)/12;
                this.year = this.year + yearsToMOve;
                this.month = passedYears;
            }
        } else if (this.day + howManyDays < 30) {
            this.day = this.day + howManyDays;
        }
    }
    public SimpleDate afterNumberOfDays(int days){
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;
    }

    @Override
    public boolean equals(Object comparedObject) {
        // if the variables are located in the same place, they're the same
        if (this == comparedObject) {
            return true;
        }

        // if comparedObject is not of type Book, the objects aren't the same
        if (!(comparedObject instanceof SimpleDateV3)) {
            return false;
        }

        // let's convert the object to a Book-object
        SimpleDateV3 comparedDate = (SimpleDateV3) comparedObject;

        // if the instance variables of the objects are the same, so are the objects
        if (this.day == comparedDate.day &&
                this.month == comparedDate.month &&
                this.year == comparedDate.year) {
            return true;
        }

        // otherwise, the objects aren't the same
        return false;
    }

    @Override
    public int hashCode(){
        return this.day + this.month + this.year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
    public boolean before(SimpleDateV3 compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        // if the years are the same, compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // the years and the months are the same, compare days
        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }
}