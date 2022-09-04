package thuchanh1;

public class Main {
    public static void main(String[] args) {
        SortedList sortedList=new SortedList();
        sortedList.add("java");
        sortedList.add("php");
        sortedList.add("c++");
        sortedList.add("python");
        sortedList.setSortStrategy(new QuickSort());
        sortedList.sort();
        sortedList.setSortStrategy(new QuickSort());
        sortedList.sort();
    }
}
