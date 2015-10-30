'''
Created on Oct 17, 2015

@author: Michael
'''
class Friends:
    """Returns a new Friends instance. 
    
    "connections" is an iterable of sets with two elements in each. 
    Each connection contains two names as strings. 
    Connections can be repeated in the initial data, but inside it's stored once. 
    Each connection has only two states - existing or not.
    """ 
    # mike
    
    def __init__(self, connections):
        """Docstring."""
         
        self.connections = connections
        self.m_connections = []  # instance variable that is a list of unique sets
        
        # create list of unique sets
        for i in connections:
            if self.m_connections.count(i) == 0: # not in member list 
                self.m_connections.append(i)
                print("initializing " , i)
                
        print(self.m_connections)    

#       raise NotImplementedError

    def add(self, connection):
        ''' Add a connection in the instance. "connection" is a set of two names (strings). 

        Returns True if this connection is new. Returns False if this connection exists already.
        '''
        self.connection = connection 
        
        print("Inside add()", connection )

        # add to internal list if not there 
        if self.m_connections.count(connection) == 0:  
            self.m_connections.append(connection)
            print("m_connection after add()", self.m_connections )
            return True
        else:
            return False

#       raise NotImplementedError

    def remove(self, connection):
        """Remove a connection from the instance. 
    
        "connection" is a set of two names (strings). 
        Returns True if this connection exists. 
        Returns False if this connection is not in the instance.
        """
        
        self.connection = connection

        print("Inside remove()", connection )

        # remove from internal list if it exists. 
        # .romove(arg) raises exception if not there. 
        try:
            print("m_connections = ", self.m_connections)
            print("remove = self.connection = ", self.connection)
            if self.m_connections.remove(self.connection) == None:
                print(self.m_connections)
                print("After remove = self.connection = ", self.connection)
                return True
#           else:
#               return False
        except ValueError:  # remove() raises ValueError when not in list
            print("inside ValueError exception")
            return False

#       raise NotImplementedError

    def names(self):
        raise NotImplementedError

    def connected(self, name):
        raise NotImplementedError

if __name__ == '__main__':
    #These "asserts" using only for self-checking and not necessary for auto-testing
    letter_friends = Friends(({"a", "b"}, {"b", "c"}, {"c", "a"}, {"a", "c"}))
    digit_friends = Friends([{"1", "2"}, {"3", "1"}])

    assert letter_friends.add({"c", "d"}) is True, "Add"
    assert letter_friends.add({"c", "d"}) is False, "Add again"
    assert letter_friends.remove({"c", "d"}) is True, "Remove"
    assert digit_friends.remove({"c", "d"}) is False, "Remove non exists"
#   assert letter_friends.names() == {"a", "b", "c"}, "Names"
#   assert letter_friends.connected("d") == set(), "Non connected name"
#   assert letter_friends.connected("a") == {"b", "c"}, "Connected name"
