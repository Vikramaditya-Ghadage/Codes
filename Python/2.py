from itertools import permutations
import re

minCost = float('inf')
costChanged = False

def stringPosToList(wordList, wordPos):
    stringList = []
    for w in wordPos:
        stringList.append(wordList[w])
    return stringList

def checkString(strCheck, listOfWords):
    r = re.compile("(?:"+"|".join(listOfWords)+")*$")
    if r.match(strCheck) is not None:
        return True
    return False

def combinationSum(numbers, target, partial=[], psum=0, position=[], cost=[], costsum=0, stringToCheck='', wordList=[]):
    global minCost, costChanged
    if psum==target:
        if costsum >= minCost:
            return
        else:
            if(checkString(stringToCheck, stringPosToList(wordList, partial))):
                minCost = costsum
                costChanged = True
                yield partial, costsum
    if psum>target:
        return
    for i in range(len(numbers)):
        remaining = numbers[i+1:]
        remPos = position[i+1:]
        remCos = cost[i+1:]
        yield from combinationSum(remaining, target, partial+[position[i]], psum+numbers[i], remPos, remCos, costsum+cost[i], stringToCheck, wordList)



def MinimumCost(input1, input2, input3, input4):
    if not checkString(input1, input3):
        return -1

    global minCost, costChanged
    wordLengths = [len(s) for s in input3]
    possibleCombinations = list(combinationSum(wordLengths, len(input1), stringToCheck=input1, wordList=input3, cost=input4, position=list(range(len(input3)))))

    if not costChanged:
        minCost = -1
    return minCost
    pass
    