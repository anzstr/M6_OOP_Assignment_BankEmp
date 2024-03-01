public class Accountant extends Employee{

    public Accountant(String employeeName, int employeeId,  String employeeDateOfBirth, String employeeAddress) {
        super(employeeName, employeeId, Consts.ACCOUNTANT_DEFAULT_SALARY, Consts.ACCONTANT_TYPE, employeeDateOfBirth, employeeAddress);
    }

    public void openAccount(String numberOfAccount){
        System.out.println(String.format("Account %s is opened", numberOfAccount));
    }

    public void closeAccount(String numberOfAccount){
        System.out.println(String.format("Account %s is closed", numberOfAccount));

    }
    public void createReport(){
                System.out.println(String.format("Accountant %s will prepare the report", getName()));
    }
}