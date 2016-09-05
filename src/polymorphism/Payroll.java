package polymorphism;

public class Payroll {

}

class Staff {
    String name;
    double salary;

    void adjustMySalary(int percent) {
        // do nothing
    }
}

class Admin extends Staff {

    @Override
    void adjustMySalary(int percent) {
        salary = salary * percent;
    }
}

class Academic extends Staff {

    @Override
    void adjustMySalary(int percent) {
        salary = salary * percent * 2;
    }
}
