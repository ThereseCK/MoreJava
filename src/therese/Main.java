package therese;

public class Main {

    public static void main(String[] args) {
        //printer ut Employee og Secretary
        System.out.print("Employee: ");
        Employee edna = new Employee();
        System.out.print(edna.getHours() + ", ");
        System.out.printf("$%.2f, ", edna.getSalary());
        System.out.print(edna.getVacationDay() + ", ");
        System.out.println(edna.getvacationForm());

        System.out.print("secretary: ");
        Secretary stan = new Secretary();
        System.out.print(stan.getHours() + ", ");
        System.out.printf("$%.2f, ", stan.getSalary());
        System.out.print(stan.getVacationDay() + ", ");
        System.out.println(stan.getvacationForm());
        stan.takeDictation("Hello");
        //printer ut lawyer og legal secretary

        System.out.print("Lawyer: ");
        Lawyer lucy = new Lawyer();
        System.out.print(lucy.getHours() + ", ");
        System.out.printf("$%.2f, ", lucy.getSalary(), ", ");
        System.out.print(lucy.getVacationDay() + ", ");
        System.out.println(lucy.getvacationForm());
        lucy.sue();

        System.out.print("Legal Secretary: ");
        LegalSecretary leo = new LegalSecretary();
        System.out.print(leo.getHours() + ", ");
        System.out.printf("$%.2f, ", leo.getSalary());
        System.out.print(leo.getVacationDay() + ", ");
        System.out.println(leo.getvacationForm());
        leo.takeDictation("neato");
        leo.fileLegalBriefs();

    }
}
