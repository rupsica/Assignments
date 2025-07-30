class Employee {
    String name;
    int age;
    double salary;
    String id;

    Employee(String name, int age, double salary, String id) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.id = id;
    }

    double yearlySalary() {
        return salary * 12;
    }

    String isEligibleToVote() {

                return (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
    }

    String isAbove35() {
        
        return (age > 35) ? "Above 35" : "35 or below";
    }

    void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name          : " + name);
        System.out.println("Age           : " + age);
        System.out.println("ID            : " + id);
        System.out.println("Monthly Salary: $" + salary);
        System.out.println("Yearly Salary : $" + yearlySalary());
        System.out.println("Voting Status : " + isEligibleToVote());
        System.out.println("Age Status    : " + isAbove35());
    }
}

