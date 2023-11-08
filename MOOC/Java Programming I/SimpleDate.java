public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
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
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
    public boolean before(SimpleDate compared) {
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