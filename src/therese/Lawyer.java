package therese;

public class Lawyer extends Employee {
    //overrides getVacationDays from Employee class
    public int getVacationDay(){
        return 15;
    }
    //overrides getVacationForm from employee class
    public String getvacationForm(){
        return "pink";
    }

    //this is the lawyers added behavior
    public void sue(){
        System.out.println("I'll see you in court!");
    }
}
