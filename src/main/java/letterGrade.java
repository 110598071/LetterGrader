public class letterGrade {
    public char getScoreLetter(int score) {
        if (score < 0 || score > 100) {
            result = 'X';
        }
        else if (score >= 90) {
            result = 'A';
        }
        else if (score >= 80) {
            result = 'B';
        }
        else if (score >= 70) {
            result = 'C';
        }
        else if (score >= 60) {
            result = 'D';
        }
        else {
            result = 'F';
        }

        return result;
    }

    private char result;
}
