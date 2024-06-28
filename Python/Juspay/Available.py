import heapq as hq
from collections import defaultdict


def shortestPath(graph,src,dest):
    h = []
    flag=0

    hq.heappush(h,(0,src))
    while len(h)!=0:
        currcost,currvtx = hq.heappop(h)
        # print(currcost,currvtx)

        if currvtx == dest:
            flag=1
            break
        for neigh,neighcost in graph[currvtx]:
            # print(neigh,neighcost)
            hq.heappush(h,(currcost+neighcost,neigh))
    print(flag)

    
    
graph = defaultdict(list)
vertices = int(input())
for i in range(vertices):
    ver = input()
edge = int(input())
# print(type(vertices),type(edge))
for i in range(edge):
    src,dis = map(str,input().split())
    graph[src].append((dis,int(1)))
# print(graph)
src=input()
dest=input()
shortestPath(graph,src,dest)