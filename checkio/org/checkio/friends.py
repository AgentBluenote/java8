'''
Created on Oct 17, 2015

@author: Michael

What I learned.  I think I should have used a set as internal data struct
                 since one requirment was not to have duplicate elements which is
                 a property of the set() data structure.

'''
class Friends():  
    def __init__(self, connections):
        # instance variable that is a list of unique sets
        self.m_connections = []  

        # create list of unique sets
#       for i in connections:
#           if i not in self.m_connections: # not in member list 
#               self.m_connections.append(i)
                
        # implement a list comprehention
        [self.m_connections.append(i) for i in connections if i not in self.m_connections]
        print(self.m_connections)

    def add(self, connection):
        # add to internal list if not there 
#       if self.m_connections.count(connection) == 0:  
        if connection not in self.m_connections:  
            self.m_connections.append(connection)
            return True
        else:
            return False

    def remove(self, connection):
        # remove from internal list if it exists. 
        
        try:
            # remove() raises exception if not there. 
            if self.m_connections.remove(connection) == None:
                return True

        except ValueError:  # remove() raises ValueError when not in list
            return False

    def names(self):
        self._has_friends = set()

        for i in self.m_connections:
            self._has_friends.update(i)
            
        return self._has_friends

    def connected(self, name):
        self._connected_name = set()

        for el in self.m_connections: 
            if name in el:
                el.discard(name)  
                self._connected_name.add(el.pop()) 

        return self._connected_name        

if __name__ == '__main__':
    #These "asserts" using only for self-checking and not necessary for auto-testing
    letter_friends = Friends(({"a", "b"}, {"b", "c"}, {"c", "a"}, {"a", "c"}))
    digit_friends = Friends([{"1", "2"}, {"3", "1"}])
    
    f = Friends(({"nikola", "sophia"}, {"stephen", "robot"}, {"sophia", "pilot"}))
    f.connected("nikola")
    

    assert letter_friends.add({"c", "d"}) is True, "Add"
    assert letter_friends.add({"c", "d"}) is False, "Add again"
    assert letter_friends.remove({"c", "d"}) is True, "Remove"
    assert digit_friends.remove({"c", "d"}) is False, "Remove non exists"
    assert letter_friends.names() == {"a", "b", "c"}, "Names"
    assert letter_friends.connected("d") == set(), "Non connected name"
    assert letter_friends.connected("a") == {"b", "c"}, "Connected name"
    
    print("passed all assert tests")

