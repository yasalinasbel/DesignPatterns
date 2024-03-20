package StrategyPattern;

public class SorterContext {
    private SortingStrategy strategy;
    public SorterContext(SortingStrategy strategy) {
        this.strategy = strategy;
    }
    public void setStrategy(SortingStrategy strategy){
        this.strategy=strategy;
    }
    public void sortArray(int[] arr){
        strategy.sort(arr);
    }
}
