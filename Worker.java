public class Worker extends Person {
    private double HourlyPayRate;

    public Worker(String firstName, String lastName, String ID, String title, int YOB, double HourlyPayRate) {
        super(firstName, lastName, ID, title, YOB);
        this.HourlyPayRate = HourlyPayRate;
    }

    @Override
    public String toString() {
        return "Worker{" + super.toString() + "HourlyPayRate=" + HourlyPayRate + "}";

    }
    public double calculateWeeklyPay(double HoursWorked) {
        double TotalPay;
        if (HoursWorked >= 40) {
            double OverTime = HoursWorked - 40;
            TotalPay = (HourlyPayRate * 40) + (HourlyPayRate * 1.5 * OverTime);
        }else{
            TotalPay = (HourlyPayRate * HoursWorked);
        }
        return TotalPay;
    }

    public double getHourlyPayRate() {
        return HourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        HourlyPayRate = hourlyPayRate;
    }

    public String DisplayWeeklyPay(double HoursWorked) {
        double TotalPayRate = calculateWeeklyPay(HoursWorked);
        return "Weekly Pay: " + TotalPayRate;

    }

    @Override
    public String toCSV(){
        return super.toCSV() + "," + HourlyPayRate;
    }

    @Override
    public String toJSON(){
        return super.toJSON() + "," + HourlyPayRate;
    }

    @Override
    public String toXML(){
        return super.toXML() + "," + HourlyPayRate;
    }
}