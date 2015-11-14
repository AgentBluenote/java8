'''
Created on Nov 4, 2015

@author: Michael
'''

def min(*args, **kwargs):
    """Docstring."""

    key = kwargs.get("key", None)
    
    # lets make keyword argument so we can treat logic to find min value 
    # in a generic fasion 
    if not key: 
        key = lambda x: x 

    if len(args) > 1:   # positional arguments packed in tuple 
        arglist = list(args)
    else:  
        arglist = args[0]  # pull sequence out of tuple
        
    print("arglist = " , arglist)

    # initial values 
    index = 0 
    minval = key(arglist[index])  
    rv = arglist[index]

    for i in arglist:   # goes through sequence: could be 1,2,3 or [1,2],[4,5]
        if key(i) < minval:
            minval = key(i)
            rv = arglist[index]
        index = index + 1 

    return rv

    
def max(*args, **kwargs):
    """Docstring."""

    key = kwargs.get("key", None)
    
    # lets make keyword argument so we can treat logic to find min value 
    # in a generic fasion 
    if not key: 
        key = lambda x: x 

    if len(args) > 1:   # positional arguments packed in tuple 
        arglist = list(args)
    else:  
        arglist = args[0]  # pull sequence out of tuple

    print("arglist = " , arglist)

    # initialize values
    index = 0
    maxval = key(arglist[index])  # initial value
    rv = arglist[index]

    for i in arglist:   # goes through sequence: could be 1,2,3 or [1,2],[4,5]
        if key(i) > maxval:
            maxval = key(i)
            rv = arglist[index]

        index = index + 1 

    return rv

if __name__ == '__main__':
    #These "asserts" using only for self-checking and not necessary for auto-testing
    
    val = max(3,2,5,8,key=int)
    print("*****************************")
    print("*****************************")
    print("*****************************")

    max( [1, 2, 0, 3, 4] )
    print("*****************************")
    print("*****************************")
    print("*****************************")
    max("hello")

    print("*****************************")
    print("*****************************")
    print("*****************************")
    max( [[1, 2], [3, 4], [9, 0]] )


    assert max(3, 2) == 3, "Simple case max"
    assert min(3, 2) == 2, "Simple case min"
    assert max([1, 2, 0, 3, 4]) == 4, "From a list"
    assert min("hello") == "e", "From string"
    assert max(2.2, 5.6, 5.9, key=int) == 5.6, "Two maximal items"
    assert min([[1, 2], [3, 4], [9, 0]], key=lambda x: x[1]) == [9, 0], "lambda key"
    assert max([[1, 2], [3, 4], [9, 0]], key=lambda x: x[1]) == [3, 4], "lambda key"
#   assert min(abs(i) for i in range(-10, 10)) == 0, "Generator"
#   assert max(abs(i) for i in range(-10, 10)) == 10, "Generator"
