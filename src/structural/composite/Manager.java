package structural.composite;

public class Manager implements Employee{
    private long id;
    private String name;
    private String position;

    public Manager(long id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("ID: " + id + " name: " + name + " position: "+position);
    }
}
