package com.example.ormlearn.entity;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AttemptOptionId implements Serializable {
    private int attemptQuestionId;
    private int optionId;

    public AttemptOptionId() {}
    public AttemptOptionId(int attemptQuestionId, int optionId) {
        this.attemptQuestionId = attemptQuestionId;
        this.optionId = optionId;
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AttemptOptionId)) return false;
        AttemptOptionId that = (AttemptOptionId) o;
        return attemptQuestionId == that.attemptQuestionId && optionId == that.optionId;
    }

    @Override public int hashCode() {
        return Objects.hash(attemptQuestionId, optionId);
    }
}
