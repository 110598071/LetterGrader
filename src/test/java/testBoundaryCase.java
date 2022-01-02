import org.junit.*;
import static org.junit.Assert.*;

public class testBoundaryCase {

    @Test
    public void testBC(){
        letterGrade normalCase = new letterGrade();

        assertEquals('A', normalCase.getScoreLetter(100));
        assertEquals('A', normalCase.getScoreLetter(99));
        assertEquals('A', normalCase.getScoreLetter(91));
        assertEquals('B', normalCase.getScoreLetter(89));
        assertEquals('B', normalCase.getScoreLetter(81));
        assertEquals('C', normalCase.getScoreLetter(79));
        assertEquals('C', normalCase.getScoreLetter(71));
        assertEquals('D', normalCase.getScoreLetter(69));
        assertEquals('D', normalCase.getScoreLetter(61));
        assertEquals('F', normalCase.getScoreLetter(59));
        assertEquals('F', normalCase.getScoreLetter(50));
        assertEquals('F', normalCase.getScoreLetter(0));
        assertEquals('X', normalCase.getScoreLetter(101));
        assertEquals('X', normalCase.getScoreLetter(-1));
    }
}
