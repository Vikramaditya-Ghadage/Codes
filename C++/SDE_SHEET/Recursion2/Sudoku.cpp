#include <bits/stdc++.h>
using namespace std;


bool isValid(int i,int j,char ch,vector<vector<char>> & board)
{
    for(int k=0;k<9;k++)
    {
        if(board[k][j]==ch || board[i][k]==ch)
        return false;
          if (board[3 * (i / 3) + k / 3][3 * (j / 3) + k % 3] == ch)
          return false;
    }
    
    return true;
}


//Time Complexity: O(9(n ^ 2)), in the worst case, for each cell in the n2 board, we have 9 possible numbers.
bool solveSudoku(vector < vector < char >> & board) {
 
 for(int i=0;i<board.size();i++)
 {
     for(int j=0;j<board[0].size();j++)
     {
         if(board[i][j]=='.')
         {
             for(char ch='1';ch<='9';ch++)
             {
                 if(isValid(i,j,ch,board))
                 {
                     board[i][j]=ch;
                     
                     if(solveSudoku(board))
                     return true;
                     else
                     board[i][j]='.';
                     
                 }
             }
            return false;
         }
     }
 }
 return true;   
}






int main() {
    vector<vector<char>>board{
        {'9', '5', '7', '.', '1', '3', '.', '8', '4'},
        {'4', '8', '3', '.', '5', '7', '1', '.', '6'},
        {'.', '1', '2', '.', '4', '9', '5', '3', '7'},
        {'1', '7', '.', '3', '.', '4', '9', '.', '2'},
        {'5', '.', '4', '9', '7', '.', '3', '6', '.'},
        {'3', '.', '9', '5', '.', '8', '7', '.', '1'},
        {'8', '4', '5', '7', '9', '.', '6', '1', '3'},
        {'.', '9', '1', '.', '3', '6', '.', '7', '5'},
        {'7', '.', '6', '1', '8', '5', '4', '.', '9'}
    };
   
    solveSudoku(board);
        	
    for(int i= 0; i< 9; i++){
        for(int j= 0; j< 9; j++)
            cout<<board[i][j]<<" ";
            cout<<"\n";
    }
    return 0;
}
