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

def checkio(words_set):
    original = set(words_set)
    keys = set(words_set)

    while len(keys) > 0: 
        # get full set
        original = set(words_set)
        # get suffix 
        suff = keys.pop()

        # remove the suff so we don't match with it
        original.remove(suff)

        for word in original:
            if( is_suffix(word, suff) == True ):
                print("word = " + word + "   suffix = ", suff)
                return True 
    return False

def is_suffix(word, suffix):
    suffix_list = []

    suffix_len = len(suffix)
    word_len = len(word)
   
    if suffix_len <= word_len:
        endofword = word[word_len - suffix_len:]

        if endofword == suffix:
            suffix_list.append(suffix)
            suffix_list.append(word)
        
        # we fount a match
        if suffix_list.__len__() > 0:
            print(suffix_list)
            return True
        else:
            return False
    else:
        return False
          

if __name__ == '__main__':
    assert checkio({"hello", "lo", "he"}) == True, "helLO"
    assert checkio({"hello", "la", "hellow", "cow"}) == False, "hellow la cow"
    assert checkio({"walk", "duckwalk"}) == True, "duck to walk"
    assert checkio({"one"}) == False, "Only One"
    assert checkio({"helicopter", "li", "he"}) == False, "Only end"

    