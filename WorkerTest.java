import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class WorkerTest {
    private Worker worker;

    @BeforeEach
    void setUp() {
        worker = new Worker("Bilbo", "Baggins", "000001", "Esq", 1960, 20);
        System.out.println("\nTest Worker " + worker.getFirstName() + " " + worker.getLastName());
    }

    @Test
    void testToString() {
        System.out.println("Testing toString");
        String expected = worker.getFirstName() + " " + worker.getLastName();
        assertEquals(expected, worker.toString());
    }

    @Test
    void calculateWeeklyPay() {
        System.out.println("Test Calculate Weekly Pay ");
        double pay40 = worker.calculateWeeklyPay(40.0);
        System.out.println("Weekly Pay (40 HRS): " + pay40);
        assertEquals(650.00, pay40, 0.001);
    }

    @Test
    void displayWeeklyPay() {
        System.out.println("Test Display Weekly Pay ");
        String display40 = worker.DisplayWeeklyPay(40.0);
        System.out.println("Display Weekly Pay: " + display40);
        String Expected40Hours = "Hours Worked: 40.00\nRegular Pay: 650.00\nOvertime Pay: 0.00\nTotal Pay: 650.00";
    }
}



