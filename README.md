Signet
==========

An abstract neural net Eclipse project.
-----------

Signet learns using a logistic sigmoid activation function because the backpropagation algorithm for this type of activation function is relatively simple compared with other
activation functions.  
The class structure is as follows.

### Neuron - an abstract class

it contains the following variables:

    * an array of Neurons corresponding to the nodes upstream of this one
    * an array of weights corresponding to those nodes
    * an ID number
    * a static integer which increments upon the creation of a new Neuron for generating ID numbers
 
Neuron also contains the following methods:

    * weightOf(Neuron n) - returns the weight of a specified input node. If the specified neuron is not an input node to this one, this throws NoSuchElementException.
    * setInputs(Neuron[] n) - sets a new array of input nodes. This also deletes the old array of weights to ensure that the two arrays are of the same length.
    * out() - returns the last value the neuron outputted
    * update() - updates the output value so that next time out() is run, it will reflect the connections at the time update() was run

some more stuff should be here too but I'm out of time so I'll do it later