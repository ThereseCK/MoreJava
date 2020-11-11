package therese;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getHours() {
      var hourTest = new Employee();
      assertEquals(40, hourTest.getHours());
    }

    @Test
    void getSalary() {
        var salaryTest = new Employee();
        assertEquals(40000.0, salaryTest.getSalary());
    }

    @Test
    void getVacationDay() {
        var vecationTest = new Employee();
        assertEquals(10, vecationTest.getVacationDay());
    }

    @Test
    void getvacationForm() {
        var vacationFormTest = new Employee();
        assertEquals("yellow", vacationFormTest.getvacationForm());
    }

    @Test
    void checkEmployee(){
        Employee Therese = new Employee();
       var test =  Therese.getHours() + " " +
        Therese.getSalary()+ " " +
        Therese.getVacationDay()+ " " +
        Therese.getvacationForm();

        assertEquals("40 40000.0 10 yellow", test);

    }
}