package Chapter.one.five;

import java.util.Random;

/**
 * This class provides base fuction to analyse the students scores.
 * 
 * @author Chanth Miao
 */
public class Score {
    private int[][] scores;

    /**
     * Assuming each course with the same amount of students. This constructor init
     * a score table (courseNum * studentNum) with random integer.
     * 
     * @param studentNum The number of students in each course.
     * @param courseNum  The number of courses.
     */
    public Score(int studentNum, int courseNum) {
        this.scores = new int[courseNum][studentNum];
        Random randGen = new Random();
        for (int i = 0; i < courseNum; i++) {
            for (int j = 0; j < studentNum; j++) {
                this.scores[i][j] = randGen.nextInt(51) + 50;
            }
        }
    }

    /**
     * Get highest score of a course.
     * 
     * @param scoreList The score list of a course.
     * @return The higest score of the course.
     */
    private int maxElem(int[] scoreList) {
        int result = scoreList[0];
        int len = scoreList.length;
        for (int i = 0; i < len; i++) {
            if (result < scoreList[i]) {
                result = scoreList[i];
            }
        }
        return result;
    }

    /**
     * Get lowest score of a course.
     * 
     * @param scoreList The score list of a course.
     * @return The lowest score of the course.
     */
    private int minElem(int[] scoreList) {
        int result = scoreList[0];
        int len = scoreList.length;
        for (int i = 0; i < len; i++) {
            if (result > scoreList[i]) {
                result = scoreList[i];
            }
        }
        return result;
    }

    /**
     * Show basic analysis result of each course.
     */
    public void showBaseInfo() {
        int courseNum = this.scores.length;
        int[] lowestScores = new int[courseNum];
        int[] highestScores = new int[courseNum];
        for (int i = 0; i < courseNum; i++) {
            lowestScores[i] = minElem(this.scores[i]);
            highestScores[i] = maxElem(this.scores[i]);
            System.out.println("学科" + i + "\t 分值范围: " + lowestScores[i] + "`" + highestScores[i] + " 差值:"
                    + (highestScores[i] - lowestScores[i]));
        }
    }
}