package chapter02.domain;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
