public class SalaryWorker extends Worker{
    private double annualSalary;

    public SalaryWorker(String firstName, String lastName, String ID, String title, int YOB, double HourlyPayRate) {
        super(firstName, lastName, ID, title, YOB, HourlyPayRate);
    }
    public double getAnnualSalary() {
        return annualSalary;
    }
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double HoursWorked) {
        return super.calculateWeeklyPay(HoursWorked);
    }

    @Override
    public String DisplayWeeklyPay(double HoursWorked) {
        return super.DisplayWeeklyPay(HoursWorked);
    }

    @Override
    public String toCSV() {
        return super.toCSV();
    }

    @Override
    public String toJSON() {
        return super.toJSON();
    }

    @Override
    public String toXML() {
        return super.toXML();
    }
}

