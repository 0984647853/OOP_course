public class Dice {
    public int value;

    public void RollIt() {
        this.value = (int)(Math.random() * 6) + 1;
    }
}
