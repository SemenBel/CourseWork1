public class Main {
    private static final Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван Иванович", 1,37500);
        employees[1] = new Employee("Петров Петр Петрович", 2, 40000);
        employees[2] = new Employee("Сидоров Сергей Сергеевич",3, 55000);
        employees[3] = new Employee("Алексеев Петр Сергеевич",5, 80000);
        employees[4] = new Employee("Борисов Юрий Андреевич",4, 65000);
        employees[5] = new Employee("Андреев Алексей Алексеевич", 2, 55000);
        employees[6] = new Employee("Юрьев Сергей Иванович", 2, 65000);
        employees[7] = new Employee("Васильев Иван Алексеевич",1, 120000);
        employees[8] = new Employee("Иванов Юрий Юрьевич", 5,55000);
        employees[9] = new Employee("Семёнов Василий Павлович",3, 70000);
        System.out.println("Сумма затрат на зарплаты в месяц: " +calculateSumSalary());
        System.out.println("Сотрудник с максимальной зарплатой: " + getEmployeeWithMaxSalary());
        System.out.println("Сотрудник с минимальной зарплатой: " + getEmployeeWithMinSalary());
        System.out.println("Среднее значение зарплат: " +calculateSumSalary()/ employees.length);
        printEmployeesFullName();
    }

    public static int calculateSumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee getEmployeeWithMaxSalary() {
        int maxSalary = Integer.MIN_VALUE;
        Employee employeeWithMaxSalary = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }
    public static Employee getEmployeeWithMinSalary() {
        int minSalary = Integer.MAX_VALUE;
        Employee employeeWithMinSalary = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    public static void printEmployeesFullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullNameEmployee());
        }
    }
}