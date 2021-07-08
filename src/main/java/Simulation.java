import sun.tools.jconsole.MaximizableInternalFrame;

public class Simulation {
    int numRolls;
    int numDice;
    Bins bin;
    Dice dice;
public Simulation(int numDice,int numRolls) {
    this.numRolls = numRolls;
    this.numDice = numDice;
    this.dice = new Dice(numDice);
    this.bin = new Bins(numDice, numDice * 6);
}
public void runSimulation(){
    for (int i = 0; i < numRolls; i ++){
        bin.incrementBin(dice.rollDie());
    }
}
public void printSim(){
    String output = "";
    double lowestPercent = (double)bin.getBin(numDice)/(double)numRolls;
    for(int i = numDice; i <= numDice * 6; i++){
        double percentRolled = ((double)bin.getBin(i)/(double)numRolls);
        int numStars = (int)(percentRolled/lowestPercent);
        output += i + " : " + bin.getBin(i) + " : " + percentRolled + " % ";
        for(int j = 0; j < numStars; j++){
            output += "**";
        }
        output += "\n";
    }
    System.out.println(output);
}
public static void main(String[] arg) {
Simulation sim = new Simulation(2, 1000000);
sim.runSimulation();
sim.printSim();

}


}
