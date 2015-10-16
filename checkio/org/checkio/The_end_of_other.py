'''
Created on Oct 15, 2015

@author: Michael
'''
# Problem Description:

#For language training our Robots want to learn about suffixes.
#In this task, you are given a set of words in lower case. Check whether there is a pair of words, 
#such that one word is the end of another (a suffix of another). 
#
# For example: {"hi", "hello", "lo"} -- "lo" is the end of "hello", so the result is True.
#Input: Words as a set of strings.
#Output: True or False, as a boolean.
#Precondition: 2 <= len(words) < 30
#all(re.match(r"\A[a-z]{1,99}\Z", w) for w in words)

import re

def checkio(words_set):
    
    original = set(words_set)
    keys = set(words_set)

#   print("print keys = " , keys)
#   print("print original = " , original)

    while len(keys) > 0: 
        original = set(words_set)
        item = keys.pop()
#       print("item - ", item)
        # remove the item so we don't match with it
        original.remove(item)
#       print("original = ", original)
        pattern = item + '$'
        print("pattern = ", pattern)

        for el in original:
        #   match = re.search('lo$', 'lo') 
#           match = re.search(pattern, 'lo') 
            print("el is", el)
            match = re.search(['lo$'], el) 
            if( match != None):
                print(match)

            

        # remove from original
#       print("print original = " , original)


    el = words_set.pop()
#   print(words_set)

    pattern = 'lo' + '$'
#   match = re.search('lo$', 'lo') 
    match = re.search(pattern, 'lo') 
    if( match != None):
        print(match)
    
    return True or False

#These "asserts" using only for self-checking and not necessary for auto-testing
if __name__ == '__main__':
#    assert checkio({"hello", "lo", "he"}) == True, "helLO"

# set of words
    words = {"hello", "lo", "he"}
    checkio(words) 


    
    
#   assert checkio({"hello", "la", "hellow", "cow"}) == False, "hellow la cow"
#   assert checkio({"walk", "duckwalk"}) == True, "duck to walk"
#   assert checkio({"one"}) == False, "Only One"
#   assert checkio({"helicopter", "li", "he"}) == False, "Only end"
