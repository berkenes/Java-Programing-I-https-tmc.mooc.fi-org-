
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ExerciseManagementTest {
    private ExerciseManagement management = new ExerciseManagement();

    @Test
    public void exerciseListEmptyAtBeginning() {
       // ExerciseManagement management = new ExerciseManagement();
        assertEquals(0, management.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne() {
        //ExerciseManagement management = new ExerciseManagement();
        management.add("Write a test");
        assertEquals(1, management.exerciseList().size());
    }

    @Test
    public void addedExerciseIsInList() {
        //ExerciseManagement management = new ExerciseManagement();
        management.add("Write a test");
        assertTrue(management.exerciseList().contains("Write a test"));
    }
    @Test
    public void exerciseCanBeMarkedAsCompleted(){
        management.add("New Exercise");
        management.markAsCompleted("Exercise");
        assertFalse(management.isCompleted("Some exercise"));
        assertTrue(management.isCompleted("Exercise"));
        assertTrue(management.isCompleted("Exercise"));

    }
}
