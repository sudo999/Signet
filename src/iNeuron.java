
public class iNeuron extends Neuron {

	public iNeuron(double d) {
		super();
		output=d;
	}
	public iNeuron(Neuron[] n){
		super();
		outNodes=n;
	}
	public iNeuron(double d,Neuron[] n){
		super();
		output=d;
		outNodes=n;
	}
	public void setValue(double d){
		output=d;
	}
	public void connectTo(Neuron[] n){
		outNodes=n;
	}
	Neuron[] outNodes;
	@Override
	public void setInputs(Neuron[] ins){
	}
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
