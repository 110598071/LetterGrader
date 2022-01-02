import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class letterGrade {
    public void main(String[] args) {
        int score;
        System.out.print("Enter the score = ");
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            score = Integer.parseInt(br.readLine());
            char grade = getScoreLetter(score);
            System.out.println("The grade of " + score + " is " + grade);
        } catch (NumberFormatException ex) {
            System.out.println("Not an Integer!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public char getScoreLetter(int score) {
        char grade;
        if (score < 0 || score > 100) {
            grade = 'X';
        }
        else if (score >= 90) {
            grade = 'A';
        }
        else if (score >= 80) {
            grade = 'B';
        }
        else if (score >= 70) {
            grade = 'C';
        }
        else if (score >= 60) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }

        return grade;
    }
}
