public class Employee extends Person{
    // declare variables that all Employees have in common
    private String emplID;
    private String supervisorId;
    private float salary;

    // constructor
    public Employee(String lN, String fN, int a, String eId) {
        // calls construcrot of the Parent Class "Person"
        super(lN, fN, a);

        // sets employeeId to eId
        this.emplID = eId;
    }

    // sets the supervisorId to sId
    public void setSupervisorID(String sId) {
        this.supervisorId = sId;
    }

    // returns the supervisorId
    public String getSupervisorID() {
        return supervisorId;
    }

    // sets the salary to s
    public void setSalary(float s) {
        this.salary = s;
    }

    // returns the salary
    public float getSalary() {
        return salary;
    }

    // increases the salary by inc
    public void increaseSalary(float inc) {
        this.salary += inc;
    }

    // returns EmployeeId -> no setter method for employeeId because it already gets set when creating a new object of employee
    public String getEmployeeId() {
        return emplID;
    }

    // overrides the printall function because we have new data that gets displayed -> emplId, supervisorId, salary
    @Override
    public void printAll() {
        System.out.println("The Employees name is: " + fullName() + " and his age is " + this.age + ". His employeeID is " + this.emplID + " and his supervisors id is: " + this.supervisorId + ". His salary is: " + this.salary);
    }
}
