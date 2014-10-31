
public class oNeuron extends Neuron {

	public oNeuron() {
		super();
	}

	@Override
	void train(double correctValue) {
		
	}

	@Override
	protected double delta(double correctValue) {
		return output*(1-output)*(output-correctValue);
	}

}
