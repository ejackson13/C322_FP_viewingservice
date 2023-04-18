package edu.iu.c322.finalproject.viewingservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class FeedbackSeller {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int feedbackSellerId;

    private int sumOfSellerScores = 0; // sum of all feedback scores (0-5)
    private int numOfSellerScores = 0; // number of reviews given (used to calculate average score)


    public int getFeedbackSellerId() {
        return feedbackSellerId;
    }

    public void setFeedbackSellerId(int feedbackSellerId) {
        this.feedbackSellerId = feedbackSellerId;
    }

    public int getSumOfSellerScores() {
        return sumOfSellerScores;
    }

    public void setSumOfSellerScores(int sumOfSellerScores) {
        this.sumOfSellerScores = sumOfSellerScores;
    }

    public int getNumOfSellerScores() {
        return numOfSellerScores;
    }

    public void setNumOfSellerScores(int numOfSellerScores) {
        this.numOfSellerScores = numOfSellerScores;
    }
}
