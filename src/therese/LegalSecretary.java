package therese;

public class LegalSecretary extends Secretary {
    //overrides getSalary from Employee class
    public double getSalary(){
        return 45000.0;
    }

    // new behavor of LegalSecretary object
    public void fileLegalBriefs(){
        System.out.println("I could file all day!");
    }

}
