'''
Created on Nov 4, 2015

@author: Michael
'''

def my_min(*args, **kwargs):
#   key = kwargs.get("key", None)
    
    print(args)
    rv = list(args) 
    print(rv)
    rv.sort(key=None, reverse=False)

#   rv.sort(key=key, reverse=False)
#   rv.sort(key=key, reverse=False)
#   Any formal parameters which occur after the args parameter are keyword-only arguments.
    print(rv)

    return rv
    
     

def my_max(*args, **kwargs):
    """Docstring."""

    print("Inside my_max()")    

    keyval = kwargs.get("key", None)

    if keyval: # key is None 
        print("keyword arg key =", keyval )
    else:
        print("NO keyword arg key = ", keyval)

    
#   key=str.lower
#   print(key)

    try:
        iterator = iter(args)
        print("Iterator type")
#       print(iterator)

#       arglist = list(args)
#       arglist.sort(key=keyval)

        test = tuple()
        le= test.__len__()


        arglist = args  # unpack
        print("arglist len =",arglist.__len__())
        print(arglist)
#       arglist.sort(key=keyval)

#       retval = arglist.pop()
        
    except TypeError:
        # not iterable
        iterator = False

        print("print arglist ", arglist)
        print(arglist) 
    else:
        # iterable
        for obj in iterator:
            pass

    return 2 



if __name__ == '__main__':
    #These "asserts" using only for self-checking and not necessary for auto-testing
    
    val = my_max(3,2,5,8,key=int)
    print(val)

    my_max( [1, 2, 0, 3, 4] )


#   val2 = my_max(3,key=2)
#   print(val2)

#   assert my_max(3, 2) == 3, "Simple case max"
#   assert my_min(3, 2) == 2, "Simple case min"
#   assert my_max([1, 2, 0, 3, 4]) == 4, "From a list"
#   assert my_min("hello") == "e", "From string"
#   assert my_max(2.2, 5.6, 5.9, key=int) == 5.6, "Two maximal items"
#   assert my_min([[1, 2], [3, 4], [9, 0]], key=lambda x: x[1]) == [9, 0], "lambda key"

