package  ru.job4j.condition;

public class Max {
    /**
     * @param left
     * @param right
     * @return
     */
    public int max(int left, int right) {
        int result = left;
        return result < right ? left : right;
    }

}