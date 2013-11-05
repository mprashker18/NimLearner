/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matthew
 */
public class NimStack {
    int[] Nim;
    int largestfull;
    boolean empty;
    public NimStack(int n) {
        empty = false;
        Nim = new int[n];
        largestfull = n-1;
        for(int i = 0; i < n; i++) {
            Nim[i] = 1;
        }
    }
    public void remove(int k) {
        for(int i = 0; i < k; i++) {
            Nim[largestfull - i] = 0;
        }
        largestfull = largestfull - k;
        if (largestfull == -1) {
            empty = true;
        }
        
        
    }
    
    public int getvalue(int k) {
        return Nim[k];
    }
    public boolean getisempty() {
        if(getsize() == 0) {
            return true;
        } else {
            return false;
        }
    }
    public int getsize() {
        int size = 0;
        for(int i = 0; i < Nim.length; i++) {
            if (Nim[i] == 1) {
                size++;
            }
        }
        return size;
    }
    
    
    
}
