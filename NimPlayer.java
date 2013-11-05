/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matthew
 */
public class NimPlayer {
    int wins = 0;
    int losses = 0;
    Move[] MyMoves = new Move[50];
    int nummoves = 0;
    public NimPlayer() {
        
    }
    public void incrementwins() {
        wins++;
    }
    public void incrementlosses() {
        losses++;
    }
    public int getwins() {
        return wins;
    }
    public int getlosses() {
        return losses;
    }
    public void move(NimStack stack, int amount) {
        MyMoves[nummoves] = new Move(stack,amount);
        nummoves++;
    }
    
}
