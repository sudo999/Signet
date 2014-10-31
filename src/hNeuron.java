
public class hNeuron extends Neuron {

	public hNeuron() {
		super();
		outNodes=new Neuron[0];
	}
	private Neuron[] outNodes;
	public void connectTo(Neuron[] n){
		outNodes=n;
	}

	@Override
	void train(double correctValue) {
		// TODO Auto-generated method stub

	}

	@Override
	protected double delta(double correctValue) { 
		double sum=0;
		for(Neuron n: outNodes){
			sum+=n.delta(correctValue)*n.weightOf(this);
		}
		return output*(1-output)*sum;
	}

}
