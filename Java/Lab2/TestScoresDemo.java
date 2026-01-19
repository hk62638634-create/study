public class TestScoresDemo {
    public static void main(String[] args) {
        //  bad scores 
        double[] badScores = {97.5, 66.7, 88.0, 101.0, 99.0};
        System.out.println("Testing with bad scores:");
        try {
            TestScores badTest = new TestScores(badScores);
            System.out.println("Average: " + badTest.getAverage());
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        
        System.out.println();
        
        // good scores
        double[] goodScores = {97.5, 66.7, 88.0, 100.0, 99.0};
        System.out.println("Testing with good scores:");
        try {
            TestScores goodTest = new TestScores(goodScores);
            System.out.println("Average: " + goodTest.getAverage());
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}