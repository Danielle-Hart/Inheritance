import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SalaryWorkerTest {
    SalaryWorker salaryWorker;

    @BeforeEach
    void setUp() {
        salaryWorker = new SalaryWorker("Frodo", "Baggins", "000002", "Esq",1980,5000);
    }

    @Test
    void calculateWeeklyPay() {
        System.out.println("Test Calculate Weekly Pay");
        double weeklyPay = salaryWorker.calculateWeeklyPay(40);
        System.out.println("Weekly Pay: " + weeklyPay);
        assertEquals(weeklyPay, 200000, 0.001);
    }

    @Test
    void displayWeeklyPay() {
        System.out.println("Test Display Weekly Pay");
        String display = salaryWorker.DisplayWeeklyPay(40);
        System.out.println("Display: " + display);

        String expectedDisplay = "Weekly Pay: ";
        assertEquals("Weekly Pay: 200000.0", salaryWorker.DisplayWeeklyPay(40));
    }
}
