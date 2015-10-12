'''
Created on Oct 10, 2015

File Name: pangram.py

@author: Michael
'''

import string

# A pangram ("every letter") or holoalphabetic sentence for a 
# given alphabet is a sentence using every letter of the alphabet at least once. 
# Perhaps you are familiar with the well known pangram "The quick brown fox jumps over the lazy dog".

# For this mission, we will use the latin alphabet (A-Z). You are given a text with latin 
# letters and punctuation symbols. You need to check if the sentence is a pangram or not. 
# Case does not matter.


# check that user inputs valid data for this excersize 
def is_validate_input(text):
    # latin alphabet (A-Z)  and punctuation  
    goodInput = (all(ch in (string.punctuation + string.ascii_letters + " ") for ch in text) and len(text) > 0 )

    if (goodInput == False ):
        print("input is not latin alphabet (A-Z) good")
        return False
    else:
        print("input is good")
        return True

def check_pangram(user_pangram):
    # make uppercase
    user_pangram = user_pangram.upper()    

    # make a set that contains all input: characters and punctuation
    allInputSet = set(user_pangram)

    isPangram = allInputSet.issuperset(string.ascii_uppercase) 
    return isPangram 
     
text = "The quick brown fox jumps over the lazy dog." 

#text = text.upper() 

# make a set that contains all input: characters and punctuation
allInputSet = set(text)
#print(allInputSet)

#print( allInputSet.issuperset(string.ascii_uppercase) )




if check_pangram(text) == True:
    print("the input was a pangram")
else:
    print("the input was not a pangram")


if __name__ == '__main__':
    pass



