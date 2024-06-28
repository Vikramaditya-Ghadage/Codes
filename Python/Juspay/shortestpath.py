import heapq as hq
from collections import defaultdict

def shortestPath(graph,src,dest):
    h = []
    # keep a track record of vertices with the cost
    # heappop will return vertex with least cost
    # greedy SRC -> MIN - > MIN -> MIN -> DEST
    ans=-1
    hq.heappush(h,(0,src))
    # print(hq)
    while len(h)!=0:
        currcost,currvtx = hq.heappop(h)
        # print(currcost,currvtx)

        if currvtx == dest:
            ans=currcost
            # print("Path Exisits {} to {} with cost {}".format(src,dest,currcost))
            break
        for neigh,neighcost in graph[currvtx]:
            hq.heappush(h,(currcost+neighcost,neigh))  
    print(ans)         
        
    
 
graph = defaultdict(list)
vertices = int(input())
for i in range(vertices):
    ver = input()
edge = int(input())
# print(type(vertices),type(edge))
for i in range(edge):
    src,dis,weight = map(str,input().split())
    graph[src].append((dis,int(weight)))
# print(graph)
src=input()
dest=input()
shortestPath(graph,src,dest)




# graph = defaultdict(list)
# vertices,edge = map(int,input().split())
# for i in range(edge):
#     src,dis,weight = map(str,input().split())
#     graph[src].append((dis,int(weight)))
# print(graph)
# print(type(vertices),type(edge))
# src,dest = map(str,input().split())
# shortestPath(graph,src,dest)