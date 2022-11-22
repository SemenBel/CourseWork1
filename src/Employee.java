public class Employee {
    private final String fullNameEmployee;
    private final int id;
    private static int counter = 0;
    private int department;
    private int salary;


    public Employee(String fullNameEmployee, int department, int salary) {
        this.fullNameEmployee = fullNameEmployee;
        this.id = ++counter;
        this.department = department;
        this.salary = salary;
    }

    public String getFullNameEmployee() {
        return fullNameEmployee;
    }

    public int getId() {
        return id;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "id=" + id +
                " - Сотрудник: " + fullNameEmployee +
                "; Отдел №: " + department +
                "; Зарплата: " + salary;
    }
}
