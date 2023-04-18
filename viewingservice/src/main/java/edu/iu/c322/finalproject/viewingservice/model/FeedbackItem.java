package edu.iu.c322.finalproject.viewingservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class FeedbackItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int feedbackItemId;

    private int sumOfItemScores = 0; // sum of all feedback scores (0-5)
    private int numOfItemScores = 0; // number of reviews given (used to calculate average score)


    public int getFeedbackItemId() {
        return feedbackItemId;
    }

    public void setFeedbackItemId(int feedbackItemId) {
        this.feedbackItemId = feedbackItemId;
    }

    public int getSumOfItemScores() {
        return sumOfItemScores;
    }

    public void setSumOfItemScores(int sumOfItemScores) {
        this.sumOfItemScores = sumOfItemScores;
    }

    public int getNumOfItemScores() {
        return numOfItemScores;
    }

    public void setNumOfItemScores(int numOfItemScores) {
        this.numOfItemScores = numOfItemScores;
    }
}
