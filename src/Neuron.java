import java.util.NoSuchElementException;


public abstract class Neuron {
	public Neuron(){
		id=nextID; //for use in .equals()
		nextID++;
		bias=1;
		weights=new double[0];
		inputs=new Neuron[0];
	}
	public void setInputs(Neuron[] ins){//always erases all weight values
		inputs=ins;
		weights=new double[inputs.length];
	}
	public boolean equals(Neuron n){
		return n.id()==this.id();
	}
	private static int nextID=0;
	protected int id;
	int id(){
		return id;
	}
	protected double bias; 
	double bias(){
		return bias;
	}
	private double[] weights; //same length as "inputs"
	private Neuron[] inputs; //same length as "weights"
	double weightOf(Neuron n){ //returns the weight of the specified input node
		for(int i=0;i<inputs.length;i++){
			if(n.equals(inputs[i])){ 
				return weights[i];
			}
		}
		throw new NoSuchElementException("neuron not found");
	}
	protected double output;
	double out(){
		return output;
	}
	public void update(){//feedforward, changes the value of "output"
		double x=0;
		for(Neuron n: inputs){
			x+=n.out()*this.weightOf(n);
		}
		output=sigma(x+this.bias());
	}
	private double sigma(double x){//sigmoid function, the backpropagation algorithm requires a smooth function
		return 1/(1+Math.pow(Math.E,x));
	}
	abstract void train(double correctValue);//backpropagation function to adjust weights recursively
	abstract protected double delta(double correctValue);//used in backpropagation; its formula varies between hidden and output neurons
}
