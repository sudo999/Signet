Signet
==========

### An abstract neural net Eclipse project.

Signet learns using a logistic sigmoid activation function because the backpropagation algorithm for this type of activation function is relatively simple compared with other activation functions.  
The class structure is as follows.

Neuron - an abstract class
-------

it contains the following variables:

    * an array of Neurons corresponding to the nodes upstream of this one
    * an array of weights corresponding to those nodes
    * an ID number
    * a static integer which increments upon the creation of a new Neuron for generating ID numbers
    * a variable storing the output value of the latest updated configuration
    * a bias value

Neuron also contains the following methods:

    * weightOf(Neuron n) - returns the weight of a specified input node. If the specified neuron is not an input node to this one, this throws NoSuchElementException.
    * setInputs(Neuron[] n) - sets a new array of input nodes. This also deletes the old array of weights to ensure that the two arrays are of the same length.
    * out() - returns the last value the neuron outputted
    * update() - updates the output value so that next time out() is run, it will reflect the connections at the time update() was run
    * equals(Neuron n) - a simple comparator which compares the ID numbers
    * train(double correctValue) - an abstract training method to be implemented for backpropagation
    * delta(double correctValue) - a core helper method for train(double correctValue) containing the recursive element to the algorithm

### iNeuron

This is one of three subclasses of Neuron. It is a "dummy" input neuron whose list of input nodes is always empty and whose output is always the same fixed value. train(), update(), and setInputs() all do nothing. Like hNeuron, it has an array of output nodes and a connectTo() method which sets which nodes the array contains. It also has a setValue() method to control what its fixed inout value is. out() always returns this value until it is manually changed, no matter what.

### hNeuron

This is the second of three subclasses of Neuron and the most complex. It is a hidden node with both an array of input nodes with a matching array of associated weights, and, like iNeuron, it also has an array of output nodes and a connectTo() method which sets which nodes that array contains. Its delta() method contains the key recursive elements that are central to the backpropagation algorithm. 

### oNeuron

This is the final of the three subclasses of Neuron. It closely resembles Neuron in every way except that it implements train() and delta(), the latter of which being the base case for train()'s recursive element. 

TODO: 
=======

    * code layer- and network-level classes to better manage network organization.
    * implement train() and backpropagation
    * create tests for functionality of networks
    * proof-of-concept applications like inequality solution mappers
    * full demonstration application such as character recognition