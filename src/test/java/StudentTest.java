import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    private Student testStudent;
    public long id;
    public String name;

    @Before
    public void setUp(){
        id = 156151684;
        name = "John Doe";
        testStudent = new Student(id, name);
    }

    @Test
    public void testIfStudentIsInitalized(){
        assertNotNull(testStudent);
    }
    @Test
    public void testIfAStudentGradeCanBeAddedAndAvgReturnIsCorrect(){
        assertEquals(0,testStudent.getGradeAverage(), 0.5);
        testStudent.addGrade(100);
        assertEquals(100, testStudent.getGradeAverage(), 0.5);
        testStudent.addGrade(90);
        assertEquals((double)(100+90)/2, testStudent.getGradeAverage(), 0.5);
    }

    @Test
    public void testGetStudentName(){
        assertEquals(name, testStudent.getName());
    }

    @Test
    public void testGetStudentID(){
        assertEquals(id, testStudent.getId());
    }

    @Test
    public void testUpdatingStudentName(){
        String newName = "Jane Doe";
        assertNotEquals(newName, testStudent.getName());
        testStudent.setName(newName);
        assertEquals(newName, testStudent.getName());
        assertNotEquals(name, testStudent.getName());
        testStudent.setName(name);
        assertEquals(name, testStudent.getName());
        assertNotEquals(newName, testStudent.getName());
    }

    @Test
    public void testUpdateStudentID(){
        long newID = 55555555;
        assertNotEquals(newID, testStudent.getId());
        testStudent.setId(newID);
        assertEquals(newID, testStudent.getId());
        assertNotEquals(id, testStudent.getId());
        testStudent.setId(id);
        assertEquals(id, testStudent.getId());
        assertNotEquals(newID, testStudent.getId());
    }

}
