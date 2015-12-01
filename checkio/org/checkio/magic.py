'''
Created on Nov 27, 2015

@author: Michael

Description:
   Whatever (object) the checkio function returns 
   should pass true for every comparison it is subjected to. 
'''
import math
import re

class WrapperClass:
    '''
    classdocs
    '''

    def __init__(self, value):
        '''
        Constructor
        '''
        self.value = value
        
    def __ne__(self, value ):
        print("inside __ne__", value)
        return True

    def __gt__(self, value ):
        print("inside __gt__", value)
        return True

    def __lt__(self, value ):
        print("inside __gt__", value)
        return True
        
    def __ge__(self, value):        
        print("inside __ge__", value)
        return True

    def __le__(self, value):        
        print("inside __ge__", value)
        return True

    def __eq__(self, value):        
        print("inside __eq__", value)
        return True

def checkio(anything):
    """
        try to return anything else :)
    """
    obj = WrapperClass(anything)

    return obj

if __name__ == '__main__':

    assert checkio({}) != [],         'You'
    assert checkio('Hello') < 'World', 'will'
    assert checkio(80) > 81,           'never'
    assert checkio(re) >= re,          'make'
    assert checkio(re) <= math,        'this'
    assert checkio(5) == ord,          ':)'

    print('NO WAY :(')


if __name__ == '__main__':
    pass