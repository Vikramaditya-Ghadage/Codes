import heapq as hq
from collections import defaultdict

def  ShortestPath(graph,src,dest):
    h=[]
    hq.heappush(h,(0,src))
    while len(h)!=0:
        current_cost,current_ver=hq.heappop(h)
        if(current_ver==dest):
            print("Path Exisits {} to {} with cost {}".format(src,dest,current_cost))
            break
        for neigh,neigh_cost in graph[current_ver]:
            hq.heappush(h,(current_cost+neigh_cost,neigh))
graph=defaultdict(list)
v,e=map(int,input().split())
for i in range(e):
    src,dest,weight=map(str,input().split())
    graph[src].append((dest,int(weight)))
src,dest=map(str,input().split())
ShortestPath(graph,src,dest)