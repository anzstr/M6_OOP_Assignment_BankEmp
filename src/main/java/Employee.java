public abstract class Employee {
    private String name;
    private int id;
    private double salary;
    private String title;
    private String dateOfBirth;
    private String address;
    public Employee(String employeeName, int employeeId, double  employeeSalary, String employeeTitle, String employeeDateOfBirth, String employeeAddress){
        this.name = employeeName;
        this.id = employeeId;
        this.salary = employeeSalary;
        this.title = employeeTitle;
        this.dateOfBirth = employeeDateOfBirth;
        this.address = employeeAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

        public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void receiveSalary(){
        System.out.println("The salary was sent to the employee bank account");
    }
    public String toString(){
        String txt = String.format("Employee name: %s, title: %s, salary: %f, date of birth: %s,address: %s", name, title, salary, dateOfBirth, address);
        return txt;
    }
}
