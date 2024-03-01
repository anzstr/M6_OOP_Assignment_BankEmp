import java.util.*;

public class BankEmpMain {
    public static void main(String[] args) {
        Manager manager = new Manager("John Smith", 1, "10.02.1975", "Toronto");

        ArrayList<Accountant> accountants = new ArrayList<Accountant>();
        accountants.add(new Accountant("Maria Smith", 2, "12.08.1979", "Toronto"));
        accountants.add(new Accountant("Vasiliy Petrov", 3, "25.08.1968", "Ottawa"));
        accountants.add(new Accountant("George Hitch", 4, "04.04.1985", "Mississauga"));
        accountants.add(new Accountant("Vasilina Ivanova", 5, "10.08.2003", "Oakville"));
        accountants.add(new Accountant("Matt Damon", 6, "08.10.1970", "Toronto"));

        ArrayList<Clerk> clerks = new ArrayList<Clerk>();
        clerks.add(new Clerk("Tony Brown", 20, "03.05.1978", "Toronto"));
        clerks.add(new Clerk("Ashley Barb", 21, "25.09.1980", "Oakville"));
        clerks.add(new Clerk("Peter Richardson", 22, "22.12.2000", "Mississauga"));

        System.out.println(manager.toString());
        for (Accountant accountant : accountants) {
            System.out.println(accountant.toString());
        }
        for (Clerk clerk : clerks) {
            System.out.println(clerk.toString());
        }
        manager.hireEmployee("Brad Pitt");
        accountants.get(3).openAccount("1456");
    }


}
