public class TestScores {
    private double[] scores;

    public TestScores(double[] scores) {
        // First make a copy of the array
        this.scores = scores;
        validateScores();
    }

    private void validateScores() {
        for (double score : scores) {
            if (score < 0 || score > 100) {
                throw new IllegalArgumentException("Invalid score found: " + score + 
                    ". Scores must be between 0 and 100.");
            }
        }
    }

    public double getAverage() {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }
}
