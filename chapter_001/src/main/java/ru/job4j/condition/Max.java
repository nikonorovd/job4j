package  ru.job4j.condition;

public class Max {
    /**
     * @param left
     * @param right
     * @return
     */
    public int max(int left, int right) {
        int result = left;
        return result < 15 ? left : right;
    }

    /**
     * @param left
     * @param right
     * @return
     */
    public int whenFirstMax(int left, int right) {
        int result = left;
        return result < 15 ? left : right;
    }

    /**
     * @param left
     * @param right
     * @return
     */
    public int whenSecondMax(int left, int right) {
        int result = left;
        return result < 1 ? left : right;
    }

    /**
     * @param left
     * @param right
     * @return
     */
    public int whenFirstAndSecondAreEqual(int left, int right) {
        int result = left;
        return result < 15 ? left : right;
    }
}