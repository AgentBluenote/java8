'''
Created on Nov 4, 2015

@author: Michael
'''

def min(*args, **kwargs):  
    """Docstring."""

    key = kwargs.get("key", None)
    
    # lets make keyword argument so we can treat logic to find min value 
    # in a generic fashion 
    if not key: 
        key = lambda x: x 
        
    print(args)    
        
    if len(args) > 1:   # positional arguments packed in tuple 
        arglist = list(args)
    else:  
        arglist = list(args[0])  # pull sequence out of tuple
        
    print("arglist = " , arglist)
    
    # initial values 
    minval = key(arglist[0])  
    rv = arglist[0]

    for i_dex,el in enumerate(arglist):   # goes through sequence: could be 1,2,3 or [1,2],[4,5]
        if key(el) < minval:
            minval = key(el)
            rv = arglist[i_dex]

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
        arglist = list(args[0])  # pull sequence out of tuple

    print("arglist = " , arglist)

    # initialize values
    maxval = key(arglist[0])  # initial value
    rv = arglist[0]

    for i_dex,el in enumerate(arglist):   # goes through sequence: could be 1,2,3 or [1,2],[4,5]
        if key(el) > maxval:
            maxval = key(el)
            rv = arglist[i_dex]

    return rv

if __name__ == '__main__':
    #These "asserts" using only for self-checking and not necessary for auto-testing
    
    
    assert max(3, 2) == 3, "Simple case max"
    assert min(3, 2) == 2, "Simple case min"
    assert max([1, 2, 0, 3, 4]) == 4, "From a list"
    assert min("hello") == "e", "From string"
    assert max(2.2, 5.6, 5.9, key=int) == 5.6, "Two maximal items"
    assert min([[1, 2], [3, 4], [9, 0]], key=lambda x: x[1]) == [9, 0], "lambda key"
    assert max([[1, 2], [3, 4], [9, 0]], key=lambda x: x[1]) == [3, 4], "lambda key"
    assert min(abs(i) for i in range(-10, 10)) == 0, "Generator"
    assert max(abs(i) for i in range(-10, 10)) == 10, "Generator"
