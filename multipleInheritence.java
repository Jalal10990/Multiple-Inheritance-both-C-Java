interface Employee {
    void work();
}

interface Student {
    void study();
}

class MultipleInheritance implements Employee, Student {

    public void work() {
        System.out.println("Employee is working.");
    }

    public void study() {
        System.out.println("Student is studying.");
    }

    public void info() {
        System.out.println("I am an intern.");
    }

    public static void main(String[] args) {
        MultipleInheritance i = new MultipleInheritance();
        i.work();    // from Employee
        i.study();   // from Student
        i.info();    // own method
    }
}
