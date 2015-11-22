'''
Created on Nov 22, 2015

@author: Michael
'''
# signiture can acually be changed to def min(*args, lambda x: x): 

def min(*args, **kwargs): 
    key = kwargs.get("key", lambda x: x)  # make key here 
    length = len(args)
    if length == 1:
        values = args[0]   # doesn't use list whichis cool
    else:
        values = args
    min_value = next(iter(values)) # good use of iter()
    for value in values:
        if key(value) < key(min_value):
            min_value = value
    return min_value


def max(*args, **kwargs):
    key = kwargs.get("key", lambda x: x)
    length = len(args)
    if length == 1:
        values = args[0]
    else:
        values = args
    max_value = next(iter(values))
    for value in values:
        if key(value) > key(max_value):
            max_value = value
    return max_value

if __name__ == '__main__':
    #These "asserts" using only for self-checking and not necessary for auto-testing
    assert max(3, 2) == 3, "Simple case max"
    assert min(3, 2) == 2, "Simple case min"
    assert max([1, 2, 0, 3, 4]) == 4, "From a list"
    assert min("hello") == "e", "From string"
    assert max(2.2, 5.6, 5.9, key=int) == 5.6, "Two maximal items"
    assert min([[1, 2], [3, 4], [9, 0]], key=lambda x: x[1]) == [9, 0], "lambda key"
    assert min(abs(i) for i in range(-10, 10)) == 0, "iterator"
