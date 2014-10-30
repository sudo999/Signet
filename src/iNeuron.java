
public class iNeuron extends Neuron {

	public iNeuron(double d) {
		super();
		output=d;
	}
	public iNeuron(Neuron[] n){
		super();
		outputs=n;
	}
	public iNeuron(double d,Neuron[] n){
		super();
		output=d;
		outputs=n;
	}
	public void setValue(double d){
		output=d;
	}
	public void connectTo(Neuron[] n){
		outputs=n;
	}
	Neuron[] outputs;
	@Override
	public void update(){
	}

	@Override
	void train(double correctValue) {
	}

	@Override
	protected double delta(double correctValue) {
		return 0;
	}

}
