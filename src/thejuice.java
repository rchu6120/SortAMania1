public class thejuice implements Comparable<thejuice> {

    public int howmuchjuice;
    public thejuice() {
        this.howmuchjuice = (int) (Math.random() * 10000)+1;
    }
    public int compareTo(thejuice other) {
        return this.howmuchjuice - other.howmuchjuice;
    }
}

