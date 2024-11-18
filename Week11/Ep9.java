public class Ep9 {
    public static void main(String[] args) {
        char[][] answers = {
                { 'A', 'B', 'B', 'C', 'D', 'A', 'B', 'E', 'D', 'A' },
                { 'A', 'B', 'C', 'D', 'E', 'A', 'B', 'C', 'D', 'E' },
                { 'A', 'E', 'C', 'D', 'E', 'A', 'B', 'D', 'D', 'C' },
                { 'B', 'C', 'D', 'E', 'C', 'D', 'D', 'D', 'C', 'E' },
                { 'D', 'D', 'C', 'B', 'C', 'D', 'E', 'E', 'C', 'B' },
                { 'B', 'C', 'D', 'E', 'D', 'E', 'A', 'B', 'D', 'E' },
                { 'B', 'C', 'D', 'E', 'D', 'E', 'B', 'C', 'D', 'A' },
                { 'B', 'C', 'D', 'A', 'B', 'C', 'C', 'D', 'A', 'A' },
                { 'C', 'D', 'D', 'A', 'B', 'E', 'D', 'E', 'A', 'A' },
                { 'D', 'E', 'A', 'B', 'C', 'D', 'E', 'D', 'A', 'E' }
        };
        char[] keys = { 'B', 'C', 'E', 'C', 'D', 'E', 'A', 'A', 'B', 'C' };
        for (int i = 0; i < answers.length; i++) {
            int correctAnswer = 0;
            for (int j = 0; j < answers[0].length; j++) {
                if (answers[i][j] == keys[j])
                    correctAnswer++;

            }
            System.out.println("Student " + i + " has correct answers " + correctAnswer);
        }
    }
}
