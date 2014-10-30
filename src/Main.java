
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* TODO
		 * abstract Neuron class
		 * 	bias value
		 *  weight value array                            |these two must be of the same length
		 *  Neuron array "inputs" (for backpropagation)   |
		 *  protected weightOf(Neuron)
		 *  	find index of Neuron in "inputs" and return weight with that index in "weights"
		 * 	output variable
		 * 	run(input array) method
		 * 		sigma(sum i*w + bias) -> output
		 * 	abstract train(correctValue) method
		 *  abstract delta(correctValue)		
		 * 	hNeuron class - hidden neurons
		 * 		Neuron array "outputs" (for feedforward) |same size as next layer
		 * 		private delta(correctValue)
		 * 			this.output*(1-this.output)* for[each output o] sum (o.delta(correctValue)*o.weightOf(this))
		 * 	oNeuron class - output neurons
		 * 		delta(correctValue)
		 * 			this.output*(1-this.output)*(this.output-correctValue)
		 * 	iNeuron class - input "neurons"
		 * 		weight array and input array are both null
		 * 		run() always does nothing
		 * 		set(value) method
		 * 			value -> output	
		 */

	}
	public static void neuronTest(){
		
	}
}
