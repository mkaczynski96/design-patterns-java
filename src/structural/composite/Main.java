package structural.composite;

public class Main {
    public static void main(String[] args) {
        Developer developer1 = new Developer(3, "Michael Kaczynski", "Junior Java Developer");
        Developer developer2 = new Developer(4, "Linus Torvalds", "Senior Bash Developer");
        EmployeeComposition developers = new EmployeeComposition();
        developers.addEmployee(developer1);
        developers.addEmployee(developer2);

        Manager manager1 = new Manager(1, "Bill Gates", "Linux Manager");
        Manager manager2 = new Manager(2, "Steve Wozniak", "Microsoft Manager");
        EmployeeComposition managers = new EmployeeComposition();
        managers.addEmployee(manager1);
        managers.addEmployee(manager2);

        EmployeeComposition company = new EmployeeComposition();
        company.addEmployee(developers);
        company.addEmployee(managers);
        company.showEmployeeDetails();
    }
}
