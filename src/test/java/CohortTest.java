import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CohortTest {

    private Student testStudent;
    private Cohort testCohort;

    @Before
    public void setUp(){
        testStudent = new Student(11252, "John Doe");
        testCohort = new Cohort();
    }

    @Test
    public void testCohortIsNotNull(){
        assertNotNull(testCohort);
    }

    @Test
    public void testStudentIsNotNull(){
        assertNotNull(testStudent);
    }

    @Test
    public void testStudentGradeAvg(){
        testStudent.addGrade(100);
        testStudent.addGrade(100);
        testStudent.addGrade(100);
        testStudent.addGrade(100);

        assertEquals(100, testStudent.getGradeAverage(), 0.5);
    }


    @Test
    public void testAddStudentToCohort(){
        assertEquals(0, testCohort.getStudents().size());
        testCohort.addStudent(testStudent);
        assertEquals(1, testCohort.getStudents().size());
        testCohort.addStudent(testStudent);
        assertEquals(2, testCohort.getStudents().size());
        testCohort.addStudent(testStudent);
        assertEquals(3, testCohort.getStudents().size());
        testCohort.addStudent(testStudent);
        assertEquals(4, testCohort.getStudents().size());
    }

    @Test
    public void testCohortAve(){
        testStudent.addGrade(100);
        testStudent.addGrade(90);
        testStudent.addGrade(100);
        testStudent.addGrade(90);

        assertEquals(95, testStudent.getGradeAverage(), 0.5);

        testCohort.addStudent(testStudent);
        testCohort.addStudent(testStudent);
        testCohort.addStudent(testStudent);
        testCohort.addStudent(testStudent);

        assertEquals(95, testCohort.getCohortAverage(), 0.5);

    }

    @Test
    public void testCohortGetStudentsWithTestStudents(){
        List<Student> expected = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            Student x = new Student(55, "John John");
            expected.add(testStudent);
            testCohort.addStudent(testStudent);
        }

        System.out.println(expected);
        System.out.println(testCohort.getStudents());
        assertEquals(expected, testCohort.getStudents());

        assertEquals(expected.get(1).getName(), testCohort.getStudents().get(1).getName());

        assertEquals(expected.get(1).getGradeAverage(), testCohort.getStudents().get(1).getGradeAverage(), 0.5);

        assertEquals(expected.get(1).getId(), testCohort.getStudents().get(1).getId());

    }

    @Test
    public void testCohortGetStudentsWithNewStudents(){
        List<Student> expected = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            Student x = new Student(55, "John John");
            expected.add(x);
            testCohort.addStudent(x);
        }

        System.out.println(expected);
        System.out.println(testCohort.getStudents());
        assertEquals(expected, testCohort.getStudents());

        assertEquals(expected.get(1).getName(), testCohort.getStudents().get(1).getName());

        assertEquals(expected.get(1).getGradeAverage(), testCohort.getStudents().get(1).getGradeAverage(), 0.5);

        assertEquals(expected.get(1).getId(), testCohort.getStudents().get(1).getId());
    }


}
