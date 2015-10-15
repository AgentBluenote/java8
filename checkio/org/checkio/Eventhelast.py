'''
Created on Oct 12, 2015

@author: Michael
'''

# You are given an array of integers. You should find the sum of the elements with 
# even indexes (0th, 2nd, 4th...) then multiply this summed number and the final 
# element of the array together. Don't forget that the first element has an index of 0.

def checkio(array):
    """
        sums even-indexes elements and multiply  the last
    """
    msum = 0 
    eventhelast = 0
    
    if len(array) == 0:
        eventhelast = 0 
    else:
        #  add up all the elements
        for element in array[0:len(array):2]:
            msum = (msum + element)

        print(msum)

        # get last element
        last_element = ( array[len(array)-1])

        eventhelast = msum * last_element

    return eventhelast 

# 

# better solutions

#def checkio(array):
#   """
#       sums even-indexes elements and multiply at the last
#   """
#   if len(array) == 0: return 0
#   return sum(array[0::2]) * array[-1]


if __name__ == '__main__':
    assert checkio([0, 1, 2, 3, 4, 5]) == 30, "(0+2+4)*5=30"
    assert checkio([1, 3, 5]) == 30, "(1+5)*5=30"
    assert checkio([6]) == 36, "(6)*6=36"
    assert checkio([]) == 0, "An empty array = 0"