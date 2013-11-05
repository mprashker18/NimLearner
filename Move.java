/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matthew
 */
public class Move {
    NimStack MyNS;
    int myamount;
    public Move(NimStack Ns, int amount) {
        MyNS = Ns;
        myamount = amount;
    }
    public NimStack getNimStack() {
        return MyNS;
    }
    public int getamount() {
        return myamount;
    }
    
}
