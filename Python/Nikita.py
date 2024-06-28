import hashlib  
import json  
from time import time  
class Client:
   def __init__(self):
      random = Crypto.Random.new().read
      self._private_key = RSA.generate(1024, random)
      self._public_key = self._private_key.publickey()
      self._signer = PKCS1_v1_5.new(self._private_key)

   @property
   def identity(self):
      return



class Transaction:
    def __init__(self, sender, recipient, value):
        self.sender = sender
        self.recipient = recipient
        self.value = value
        self.time = datetime.datetime.now()


transactions = []
def display_transaction(transaction):
   #for transaction in transactions:
   dict = transaction.to_dict()
   print ("sender: " + dict['sender'])
   print ('-----')
   print ("recipient: " + dict['recipient'])
   print ('-----')
   print ("value: " + str(dict['value']))
   print ('-----')
   print ("time: " + str(dict['time']))
   print ('-----')


Dinesh = Client()
Ramesh = Client()
Seema = Client()
Vijay = Client()


t1 = Transaction(
   Dinesh,
   Seema.identity,
   6.0
)
t1.sign_transaction()
transactions.append(t1)

t2 = Transaction(
   Dinesh,
   Seema.identity,
   6.0
)
t2.sign_transaction()
transactions.append(t2)
t3 = Transaction(
   Ramesh,
   Vijay.identity,
   2.0
)
t3.sign_transaction()
transactions.append(t3)
t4 = Transaction(
   Seema,
   Ramesh.identity,
   4.0
)
t4.sign_transaction()
transactions.append(t4)

for transaction in transactions:
   display_transaction (transaction)
   print ('--------------')