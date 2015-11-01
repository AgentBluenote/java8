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
    # mike,  variable declared here are not "instance"
    
    def __init__(self, connections):
        """Docstring."""
         
        self.connections = connections
        self.m_connections = []  # instance variable that is a list of unique sets
        
        # create list of unique sets
        for i in self.connections:
            if self.m_connections.count(i) == 0: # not in member list 
                self.m_connections.append(i)
#               print("initializing " , i)
                
        print("After __init__" , self.m_connections)    

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

    def remove(self, connection):
        """Remove a connection from the instance. 
    
        "connection" is a set of two names (strings). 
        Returns True if this connection exists. 
        Returns False if this connection is not in the instance.
        """
        self.connection = connection

        print("Inside remove()", connection )

        # remove from internal list if it exists. 
        try:
            print("remove = self.connection = ", self.connection)
            # remove() raises exception if not there. 
            if self.m_connections.remove(self.connection) == None:
                print("After remove = self.connection = ", self.m_connections)
                return True

        except ValueError:  # remove() raises ValueError when not in list
            print("inside ValueError exception")
            return False

    def names(self):
        """ Returns a set of names."""
        
        """The set contains only names which are connected with somebody."""
        self._has_friends = set()

        print("Inside names()" )

        for i in self.m_connections:
            self._has_friends.update(i)
            
        return self._has_friends

    def connected(self, name):
        """Returns a set of names which is connected with the given "name".

        If "name" does not exist in the instance, then return an empty set.
        """
        self.name = name
        self._connected_name = set()

        print("Inside connected()")
        print("m_connections = ", self.m_connections)
        
        print("len = ", len(self.m_connections))

        for el in self.m_connections: 
#           print(el)
            if self.name in el:
                print("el = ", el)
                print("name = ", self.name)
                el.discard(self.name)  # 
                self._connected_name.add(el.pop()) 

        print(self._connected_name)

        return self._connected_name        

if __name__ == '__main__':
    #These "asserts" using only for self-checking and not necessary for auto-testing
#   letter_friends = Friends(({"a", "b"}, {"b", "c"}, {"c", "a"}, {"a", "c"}))
#   digit_friends = Friends([{"1", "2"}, {"3", "1"}])
    
    f = Friends(({"nikola", "sophia"}, {"stephen", "robot"}, {"sophia", "pilot"}))
    f.connected("nikola")

#   assert letter_friends.add({"c", "d"}) is True, "Add"
#   assert letter_friends.add({"c", "d"}) is False, "Add again"
#   assert letter_friends.remove({"c", "d"}) is True, "Remove"
#   assert digit_friends.remove({"c", "d"}) is False, "Remove non exists"
#   assert letter_friends.names() == {"a", "b", "c"}, "Names"
#   assert letter_friends.connected("d") == set(), "Non connected name"
#   assert letter_friends.connected("a") == {"b", "c"}, "Connected name"

