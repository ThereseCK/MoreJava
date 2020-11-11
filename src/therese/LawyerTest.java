package therese;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LawyerTest {
    @Test
    void getHours() {
        var hourTest = new Lawyer();
        assertEquals(40, hourTest.getHours());
    }

    @Test
    void getSalary() {
        var salaryTest = new Lawyer();
        assertEquals(40000.0, salaryTest.getSalary());
    }

    @Test
    void getVacationDay() {
        var vacayDay = new Lawyer();
        assertEquals(15, vacayDay.getVacationDay());
    }

    @Test
    void getvacationForm() {
        var vacayForm = new Lawyer();
        assertEquals("pink", vacayForm.getvacationForm());
    }

    @Test
    String sue() {
        return "I'll see you in court!";
    }

    @Test
    void checkEmployee(){
        Lawyer Therese = new Lawyer();
        var test =  Therese.getHours() + " " +
                Therese.getSalary()+ " " +
                Therese.getVacationDay()+ " " +
                Therese.getvacationForm();
        String test2 = sue();

        assertEquals("40 40000.0 15 pink", test);
        assertEquals("I'll see you in court!", test2);
    }
}