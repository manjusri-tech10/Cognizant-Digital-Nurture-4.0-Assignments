package com.example.ormlearn.entity;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AttemptQuestionId implements Serializable {
    private int attemptId;
    private int questionId;

    public AttemptQuestionId() {}
    public AttemptQuestionId(int attemptId, int questionId) {
        this.attemptId = attemptId;
        this.questionId = questionId;
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AttemptQuestionId)) return false;
        AttemptQuestionId that = (AttemptQuestionId) o;
        return attemptId == that.attemptId && questionId == that.questionId;
    }

    @Override public int hashCode() {
        return Objects.hash(attemptId, questionId);
    }
    // getters/setters...
}
