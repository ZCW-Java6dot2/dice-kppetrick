public class Dice {
    private int numDice;
    public Dice(int numDice) {
        this.numDice = numDice;
    }
public int rollDie() {
    int totalSum = 0;
    for (int i = 0; i < numDice; i++) {
        totalSum += (int) (Math.random() * 6)+ 1;
    }
    return totalSum;
}

}
