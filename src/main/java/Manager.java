public class Manager extends Employee{

    public Manager(String employeeName, int employeeId,  String employeeDateOfBirth, String employeeAddress) {
        super(employeeName, employeeId, Consts.MANAGER_DEFAULT_SALARY, Consts.MANAGER_TYPE, employeeDateOfBirth, employeeAddress);
    }
        public void hireEmployee(String employeeName) {
            System.out.println(String.format("The employee %s was hired", employeeName));
        }

        public void fireEmployee(String employeeName){
            System.out.println(String.format("The employee %s was fired", employeeName));

        }
    }
