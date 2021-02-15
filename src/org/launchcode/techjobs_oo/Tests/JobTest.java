package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job job1;
    Job job2;
    Job job3;
    Job job4;
    Job job5;

    @Before
    public void testCases() {
        job1 = new Job();
        job2 = new Job();
        job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }

    @Test
    public void testSettingJobId() {
        assertEquals(1, job2.getId() - job1.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals("Product tester", job3.getName());
        assertEquals("ACME", job3.getEmployer().toString());
        assertEquals("Desert", job3.getLocation().toString());
        assertEquals("Quality control", job3.getPositionType().toString());
        assertEquals("Persistence", job3.getCoreCompetency().toString());
        assertNotNull(job3.getEmployer());
        assertNotNull(job3.getLocation());
        assertNotNull(job3.getPositionType());
        assertNotNull(job3.getCoreCompetency());
        int expectedId = job3.getId();
        assertEquals(expectedId, job3.getId());
    }

    @Test
    public void testJobsForEquality(){
                assertNotEquals(job4, job5);
    }

    @Test
    public void testToStringMethod(){
        Job job6 = new Job("", new Employer(""), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expect = "\nID:  " + job6.getId() + "  \n"
                + "Name:  " + job6.getName() + "  \n"
                + "Employer:  " + job6.getEmployer() + "  \n"
                + "Location:  " + job6.getLocation() + "  \n"
                + "Position Type:  " + job6.getPositionType() + "  \n"
                + "Core Competency:  " + job6.getCoreCompetency() + "  \n";

        assertEquals(expect, job6.toString());

    }
}