'''
Created on Nov 4, 2015

@author: Michael
'''

def my_min(*args, **kwargs):
    """Docstring."""

    print("Inside my_min()")    

    key = kwargs.get("key", None)
    #   D.get(k[,d]) -> D[k] if k in D, else d.  d defaults to None.
    
    if key: # has "key" keyword argument 
        print("keyword arg key =", key )
    else: # key is None
        # lets make keyword argument so we can treat logic to find min 
        # in a generic fasion 
        key = lambda x: x 
        print("NO keyword arg key = ", key)

    print("args = ",  len(args))

    if len(args) > 1:   # positional arguments packed in tuple 
        arglist = list(args)
    else:  
        arglist = args[0]  # pull sequence out of tuple

    print("arglist = " , arglist)

    minval = key(arglist[0])  # initial value

    print("minval init = ", minval)

    index = 0
    rv = arglist[0]
    for i in arglist:   # goes through sequence: could be 1,2,3 or [1,2],[4,5]
        mapvalue = key(i)
        print("mapvalue - ", mapvalue)

        if key(i) < minval:
            minval = key(i)
            rv = arglist[index]
            print("rv = 1", rv)

        print("index: ",index)
        print("i:",i)
        print("minval = ", minval)

        index = index + 1 

    return rv

    
def my_max(*args, **kwargs):
    """Docstring."""

    print("Inside my_max()")    

    key = kwargs.get("key", None)
    #   D.get(k[,d]) -> D[k] if k in D, else d.  d defaults to None.
    
    if key: # has "key" keyword argument 
        print("keyword arg key =", key )
    else: # key is None
        # lets make keyword argument so we can treat logic to find max 
        # in a generic fasion 
        key = lambda x: x 
        print("NO keyword arg key = ", key)

    print("args = ",  len(args) ) 

    if len(args) > 1:   # positional arguments packed in tuple 
        arglist = list(args)
    else:  
        arglist = args[0]  # pull sequence out of tuple

    print("arglist = " , arglist)

    maxval = key(arglist[0])  # initial value

    print("maxval init = ", maxval)

    index = 0
    rv = arglist[0]
    for i in arglist:   # goes through sequence: could be 1,2,3 or [1,2],[4,5]
        mapvalue = key(i)
        print("mapvalue - ", mapvalue)

        if key(i) > maxval:
            maxval = key(i)
            rv = arglist[index]
            print("rv = 1", rv)

        print("index: ",index)
        print("i:",i)
        print("maxval = ", maxval)

        index = index + 1 

    return rv

if __name__ == '__main__':
    #These "asserts" using only for self-checking and not necessary for auto-testing
    
    val = my_max(3,2,5,8,key=int)
    print("*****************************")
    print("*****************************")
    print("*****************************")

    my_max( [1, 2, 0, 3, 4] )
    print("*****************************")
    print("*****************************")
    print("*****************************")
    my_max("hello")

    print("*****************************")
    print("*****************************")
    print("*****************************")
    my_max( [[1, 2], [3, 4], [9, 0]] )


    assert my_max(3, 2) == 3, "Simple case max"
    assert my_min(3, 2) == 2, "Simple case min"
    assert my_max([1, 2, 0, 3, 4]) == 4, "From a list"
    assert my_min("hello") == "e", "From string"
    assert my_max(2.2, 5.6, 5.9, key=int) == 5.6, "Two maximal items"
    assert my_min([[1, 2], [3, 4], [9, 0]], key=lambda x: x[1]) == [9, 0], "lambda key"
    assert my_max([[1, 2], [3, 4], [9, 0]], key=lambda x: x[1]) == [3, 4], "lambda key"

