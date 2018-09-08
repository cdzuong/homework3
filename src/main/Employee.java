package main;

/** Class Employee represents and employee in an Organization.
 *  This class has been provided to you, do not modify it.
 */
public class Employee {
    private String name; // name
    private double salary; // monthly salary
    private int id; // id

    /**
     * Constructor for class Employee
     * @param name name of the employee
     * @param salary monthly salary of the employee
     * @param id id of the employee
     */
    public Employee(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    /**
     * Return the id of the employee
     * @return id
     */
    public int getId() {
        return this.id;
    }

    /** Return the name of the employee
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Increase this employee's salary by the given percentage of the
     * current salary
     * @param percentage percentage of the current salary by which to increase
     *                   salary
     */
    public void increaseSalary(double percentage) {
        this.salary  = this.salary + this.salary * percentage / 100.0;
    }

    /**
     * Returns a string representing employee's info.
     * Format: name, salary
     * Note: id is not included in this string.
     * @return string that contains name and salary, separated by comma
     * and a white space
     */
    public String toString() {
        return name + ", " + salary;
    }

}
