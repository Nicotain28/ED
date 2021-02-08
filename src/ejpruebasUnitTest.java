import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ejpruebasUnitTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void testExercise()
    {
        assertEquals(0, exercise.determinant(new double[]{0, 0, 0}, new double[]{0, 0, 0}, new double[]{0, 0, 0}));
        assertEquals(0, exercise.determinant(new double[]{1, 1, 1}, new double[]{1, 1, 1}, new double[]{1, 1, 1}));
        assertEquals(-3, exercise.determinant(new double[]{2, 1, 3}, new double[]{-1, 1, 0}, new double[]{-2, 4, 1}));
        assertEquals(11, exercise.determinant(new double[]{2, 3, -1}, new double[]{0, 1d/2d, -1}, new double[]{-2, 1, 4}));
    }
}