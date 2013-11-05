/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matthew
 */
public class Program {
        
    public static void main(String[] args) {
        NimStack four = new NimStack(4);
        NimStack three = new NimStack(3);
        NimStack two = new NimStack(2);
        NimStack one = new NimStack(1);
        
        
        NimPlayer Player1 = new NimPlayer();
        NimPlayer Player2 = new NimPlayer();
        
        boolean fourempty = false;
        boolean threeempty = false;
        boolean twoempty = false;
        boolean oneempty = false;
        
        
        
        
        
        
    }
    public static void move(NimStack x, NimPlayer p, int amount) {
        p.move(x, amount);
        x.remove(amount);
    }
    public static void StimulateNimGame(NimPlayer x, NimPlayer y, NimStack four, NimStack three, NimStack two, NimStack one) {
    {
        while ((four.getsize() != 0) || (three.getsize() != 0) || (two.getsize() != 0) || (one.getsize() != 0)) {
            int i = 0;
            boolean z = true;
            
            if(z) {
                
                move(three, x, 2);
            }
            if(!z) {
                move(three,y,2);
            }
            i++;
            z = !z;
            
        }
    }
    
    
}
}
