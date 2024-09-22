import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();

        Worker Fred = new Worker("Fred", "Flinstone", "000001", "Mr.", 1960, 64);

        workers.add(new Worker("Bugs", "Bunny", "000002", "Mr.", 1930, 89));
        workers.add(new Worker("Spongebob", "SquarePants","000003", "Mr.", 1950, 50 ));
        workers.add(new Worker("Charlie", "Brown", "000004", "Mr.", 1950, 98));
        workers.add(new Worker("Pink", "Panther", "000005", "Mr.", 1963, 78));
        workers.add(new Worker("Jerry", "Mouse", "000006", "Mr.", 1988, 90));
        workers.add(new Worker("Jessica", "Rabbit", "000007", "Ms.", 1990, 150));
        workers.add(new Worker("Betty", "Boop", "000008", "Ms.", 1995, 40));

        int [] weeklyHours = {40,50,40};

        for (int week = 0; week < weeklyHours.length; week++) {
            System.out.println("Weekly Hours" + week + (week + 1) + ": " + weeklyHours[week]);
            for (Worker worker : workers) {
                double hoursWorked = weeklyHours[week];
                System.out.println(worker.fullName() + ": " + hoursWorked + "hours, Pay: $" + worker.DisplayWeeklyPay(hoursWorked));
            }
            System.out.println();
        }
    }
}