package main;

import java.util.ArrayList;

/** Class Organization, contains a list of Employee references,
 *  and methods to manipulate the list. Fill in code where it asks you to. */
public class Organization {
    private ArrayList<Employee> employees;

    /** Default constructor */
    public Organization() {
        employees = new ArrayList();
    }

    /**
     * Creates a new Employee with the given name, salary and id,
     * and adds him/her to the ArrayList of employees
     * @param name name of the employee
     * @param salary salary of the employee
     * @param id id of the employee
     */
    public void addEmployee(String name, double salary, int id) {
        employees.add(new Employee(name, salary, id));
    }

    /** Iterates over all employees and increases their salary by the given
     * percentage of their current salary
     * @param percentage percentage of the current salary by which to increase
     *                   each employee's salary
     */
    public void increaseSalary(double percentage) {
        // FILL IN CODE


    }

    /** Find an employee with the given id and replace him/her with the
     * new employee with the given parameters.
     * Note: do NOT just change the name, id and salary of the existing employee.
     * Create a new Employee object, and point the corresponding element
     * of employees to this object
     * @param id id of the current employee
     * @param newEmployeeName name of a new employee
     * @param newEmployeeSalary salary of a new employee
     * @param newEmployeeId id of a new employee
     */
    public void replaceEmployee(int id, String newEmployeeName, double newEmployeeSalary, int newEmployeeId ) {
        // FILL IN CODE
        // First, find the index of the employee that is going to be laid off by id


    }

    /** Checks if organization has two employees with the same name
     *
     * @return true or false, depending on whether some employees have the same name
     */
    public boolean haveTwoEmployeesWithSameName() {
        // FILL IN CODE

        return false; // replace it with your code if needed
    }


    /**
     * Returns a string that contains info about all employees
     * working for this organization.
     * Format: name, salary of each employee on a separate line
     *
     * @return string that contains info about all employees
     */
    public String toString() {
        String res = "";
        // FILL IN CODE

        return res;
    }
}
