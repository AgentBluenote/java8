'''
Created on Nov 27, 2015

@author: Michael
'''
import math
import re


#  Whatever (object) the checkio function returns 
#  should pass true for every comparison it is subjected to. 
#  Think class that makes everyone happy 


class MyClass:
    '''
    classdocs
    '''

    def __init__(self, param):
        '''
        Constructor
        '''
        self.param = param
#       parent = super(MyClass, self).__init__()

        print(self.__str__())
        
    def __ne__(self, param ):
        print("inside __ne__", param)

        return True

    def __gt__(self, param ):
        print("inside __gt__", param)

        return True

    def __lt__(self, param ):
        print("inside __gt__", param)

        return True
        
    def __ge__(self, param):        
        print("inside __ge__", param)

        return True

    def __le__(self, param):        
        print("inside __ge__", param)

        return True

    def __eq__(self, param):        
        print("inside __eq__", param)

        return True

def checkio(anything):
    """
        try to return anything else :)
    """
    print(type(anything))
    
    obj = MyClass(anything)
    print(type(obj))

    return obj

if __name__ == '__main__':

#   checkio({}) != []


    assert checkio({}) != [],         'You'
    assert checkio('Hello') < 'World', 'will'
    assert checkio(80) > 81,           'never'
    assert checkio(re) >= re,          'make'
    assert checkio(re) <= math,        'this'
    assert checkio(5) == ord,          ':)'

    print('NO WAY :(')


if __name__ == '__main__':
    pass