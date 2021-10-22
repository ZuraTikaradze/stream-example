package map;

public class Employee {
    private int id;
    private String fullName;
    private String type;
    private int sal;

    public Employee() {
    }

    public Employee(int id, String fullName, String type, int sal) {
        this.id = id;
        this.fullName = fullName;
        this.type = type;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", type='" + type + '\'' +
                ", sal=" + sal +
                '}';
    }
}
