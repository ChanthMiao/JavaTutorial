package Chapter.one.five;

import java.util.Random;

public class Score {
    private int[][] scores;

    public Score(int studentNum, int classNum) {
        this.scores = new int[classNum][studentNum];
        Random randGen = new Random();
        for (int i = 0; i < classNum; i++) {
            for (int j = 0; j < studentNum; j++) {
                this.scores[i][j] = randGen.nextInt(51) + 50;
            }
        }
    }

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

    public void showBaseInfo() {
        int classNum = this.scores.length;
        int[] lowestScores = new int[classNum];
        int[] highestScores = new int[classNum];
        for (int i = 0; i < classNum; i++) {
            lowestScores[i] = minElem(this.scores[i]);
            highestScores[i] = maxElem(this.scores[i]);
            System.out.println("学科" + i + "\t 分值范围: " + lowestScores[i] + "`" + highestScores[i] + " 差值:"
                    + (highestScores[i] - lowestScores[i]));
        }
    }
}