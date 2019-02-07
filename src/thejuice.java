public class thejuice {
    private int value;
    public thejuice() {
        this.value = (int) (Math.random() * 10000)+1;
    }
    public int compareTo(thejuice other) {
        return this.value - other.value;
    }
}

