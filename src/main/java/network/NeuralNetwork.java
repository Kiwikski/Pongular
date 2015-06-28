package network;

public class NeuralNetwork {

	float[] inputs = {};
	float[] weights = {};
	
	private void sumWeights() {
		float sum = 0;
		for(int i=0;i<inputs.length;i++) {
			sum += inputs[i]*weights[i];
		}
	}
	
}
