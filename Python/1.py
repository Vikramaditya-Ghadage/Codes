from math import pow
import numpy
from itertools import permutations
input1=[25]
input2=1
input3=[20]

# input1=[12,5]
# input2=2
# input3=[10,15]
# Write code here
power = numpy.array([pow(2,x) for x in range(input2)])
print(power)
l1 = list(permutations(input1, input2))
print(l1)
profits = []
for i in l1:
    profit = numpy.sum(numpy.divide(numpy.array(i), power))
    profits.append(int(profit))

#   print(profits)
total_cost = []
for i in input3:
    total_cost.append(len([pro for pro in profits if pro >= i]))

# print(returnProfits)
print(total_cost)
