public class App {
    // main method
    public static void main(String[] args) throws Exception {

        // creates new object of Employee 
        Employee emp = new Employee("lastName", "firstName", 50, "123455");

        // calls Employee function setSalary which sets the salary to 3000 in the example below
        emp.setSalary(3000);

        // calls Employee function setSupervisorId which sets the supervisorID it to "82634752" in the example below
        emp.setSupervisorID("82634752");

        // the printAll function here is to check if the next function -> increaseSalary - is working
        // here the output will be 3000 and in the next call of the printAll function it is 4000
        emp.printAll();
        emp.increaseSalary(1000);
        emp.printAll();
    }
}
