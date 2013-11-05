/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matthew
 */
import java.util.Random;
public class Perceptron {
        int perceptronnumber;
	float weights[];
        Perceptron(int n) {
                weights = new float[n];
		setperceptronnumber(n);
		Random generator = new Random();
		boolean sign1;
		int sign;
                for (int i = 0; i < weights.length; i++) {
	    	sign1 = generator.nextBoolean();
	    	
	    	if (sign1 == true) {
	    		sign = -1;
	    	} else {
	    		sign = 1;
	    	}
	    	
	        weights[i] = generator.nextFloat()*sign;
            
                }
                
                
      
}
        public void setperceptronnumber(int x) {
		perceptronnumber = x;
	}
	public int getperceptronnumber() {
		return perceptronnumber;
	}
	public int feedfoward(float[] inputs) {
		float weightedsum = 0;
		for (int i = 0; i < weights.length; i++) {
			weightedsum = weightedsum + inputs[i]*weights[i];
		}
		return activate(weightedsum);
		
	}
	public int activate(float n) {
		Random generator = new Random();
		float x = generator.nextFloat();
		float y = generator.nextFloat();
		float yline = f(x);
		if (y < yline) {
			return -1;
		} else {
			return 1;
		}
		
		
	}
        public void train(float[] inputs, int desired, int c) {
		int guess = feedfoward(inputs);
		float error = desired - guess;
		for(int i = 0; i < weights.length; i++) {
			weights[i] += c*error*inputs[i];
		}
		
		
	}
	public float f(float x) {
		return 2*x + 1;
	}
        
}
