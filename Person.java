public class Person{
// Write Your Code Here
    private String name;
    private int id;
    private String role;
    private double salary;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Person(String name, int id, String role, double salary) {
        this.name = name;
        this.id = id;
        this.role = role;
        this.salary = salary;
    }
    

    @Override
    public String toString() {
        return "Person [name=" + name + ", id=" + id + ", role=" + role + ", salary=" + salary + "]";
    }
    public Person() {
    }
    
    
    
}
