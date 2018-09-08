package test;

import main.Organization;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

/** Tester class for testing method of Organization class */
public class OrganizationTester {
    private Organization org;

    @Before
    /** Will be invoked before every test */
    public void setup() {
        org = new Organization();
        org.addEmployee("Smith", 6000, 0);
        org.addEmployee("Johnson", 6500, 1);
        org.addEmployee("Patterson", 5800, 2);
    }

    /** Tests toString() method of class Organization */
    @Test
    public void testToString() {
        String studentRes = org.toString();
        String expectedRes = "Smith, 6000.0" + System.lineSeparator() +
                "Johnson, 6500.0" + System.lineSeparator() +
                "Patterson, 5800.0" + System.lineSeparator();
        //System.out.println(studentRes);
        assertTrue("In testToString, resulting string is not as expected", studentRes.equals(expectedRes)
        );

    }

    /** Test increaseSalary method */
    @Test
    public void testIncreaseSalary() {
        org.increaseSalary(2);
        String studentRes = org.toString();
        String expectedRes = "Smith, 6120.0" + System.lineSeparator() +
                "Johnson, 6630.0" + System.lineSeparator() +
                "Patterson, 5916.0" + System.lineSeparator();
        //System.out.println(studentRes);
        assertTrue("In testIncreaseSalary, resulting string is not as expected", studentRes.equals(expectedRes)
        );
    }

    /** Test replaceEmployee */
    @Test
    public void testReplaceEmployee() {
        org.replaceEmployee(1, "Schwarz", 6550, 1);
        String studentRes = org.toString();
        String expectedRes = "Smith, 6000.0" + System.lineSeparator() +
                "Schwarz, 6550.0" + System.lineSeparator() +
                "Patterson, 5800.0" + System.lineSeparator();

        //System.out.println(studentRes);
        assertTrue("In testReplaceEmployee, resulting string is not as expected", studentRes.equals(expectedRes)
        );
    }

    /** Test replaceEmployee when trying to replace non-existing employee */
    @Test
    public void testReplaceNonExistentEmployee() {
        org.replaceEmployee(5, "Schwarz", 6550, 1);
        String studentRes = org.toString();
        // Nothing should change
        String expectedRes = "Smith, 6000.0" + System.lineSeparator() +
                "Johnson, 6500.0" + System.lineSeparator() +
                "Patterson, 5800.0" + System.lineSeparator();

        //System.out.println(studentRes);
        assertTrue("In testReplaceNonExistentEmployee, resulting string is not as expected." + System.lineSeparator()
                + "Since the employee with this id does not exist, the list of employees should not have changed", studentRes.equals(expectedRes)
        );
    }

    /** Tests haveTwoEmployeesWithSameName */
    @Test
    public void testHaveTwoEmployeesWithSameName() {
        org.addEmployee("Johnson", 7000, 3); // adding another Johnson
        org.addEmployee("Lee", 7010, 4);
        boolean studentRes = org.haveTwoEmployeesWithSameName();
        assertTrue("In testHaveTwoEmployeesWithSameName, expected true, got false.", studentRes);
    }

    /** Tests haveTwoEmployeesWithSameName, case when everybody has unique name */
    @Test
    public void testHaveTwoEmployeesWithSameNameFalseCase() {
        org.addEmployee("Lee", 7010, 4);
        org.addEmployee("Prim", 5895, 6);
        boolean studentRes = org.haveTwoEmployeesWithSameName();
        assertTrue("In testHaveTwoEmployeesWithSameNameFalseCase, expected false, got true.", !studentRes);
    }

}
