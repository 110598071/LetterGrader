import org.junit.*;
import static org.junit.Assert.*;

public class testNormalCase {

    @Test
    public void testNC(){
        letterGrade normalCase = new letterGrade();

        assertEquals('A', normalCase.getScoreLetter(100));
        assertEquals('A', normalCase.getScoreLetter(95));
        assertEquals('A', normalCase.getScoreLetter(90));
        assertEquals('B', normalCase.getScoreLetter(85));
        assertEquals('B', normalCase.getScoreLetter(80));
        assertEquals('C', normalCase.getScoreLetter(75));
        assertEquals('C', normalCase.getScoreLetter(70));
        assertEquals('D', normalCase.getScoreLetter(65));
        assertEquals('D', normalCase.getScoreLetter(60));
        assertEquals('F', normalCase.getScoreLetter(55));
        assertEquals('F', normalCase.getScoreLetter(50));
        assertEquals('F', normalCase.getScoreLetter(0));
        assertEquals('X', normalCase.getScoreLetter(101));
        assertEquals('X', normalCase.getScoreLetter(-1));
    }
}
