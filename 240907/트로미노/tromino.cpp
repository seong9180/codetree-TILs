#include <iostream>
#include <algorithm>
#include <vector>
#include <algorithm>

using namespace std;

int n,m;
int boards[210][210];

//tetris가 할 수 있는 모든 경우.
//테트리스 => [6][3][2]
vector<vector<vector<int> > > tetris = {
    {{0,0},{1,0},{1,1}},
    {{0,0},{0,1},{1,1}},
    {{0,1},{1,0},{1,1}},
    {{0,0},{0,1},{1,0}},
    {{0,0},{0,1},{0,2}},
    {{0,0},{1,0},{2,0}}
};

bool inRange(int x, int y){
    if(x >= 0 && x < n && y >= 0 && y < m){
        return true;
    }
    return false;
}

int maxCheck(int x, int y, int k){
    int score = 0;
    for(int i = 0;i<3;i++){
        int nextX = x + tetris[k][i][0];
        int nextY = y + tetris[k][i][1];
        if(inRange(nextX,nextY) == false) {
            return -1;
        }
        score += boards[nextX][nextY];
    }
    return score;
}

int main() {
    cin>>n>>m;
    for(int i = 0;i<n;i++){
        for(int j = 0;j<m;j++){
            cin>>boards[i][j];
        }
    }

    int answer = 0;
    for(int i = 0;i<n;i++){
        for(int j = 0;j<m;j++){
            //테트리스 종류.
            for(int k = 0;k<6;k++){
                answer = max(answer, maxCheck(i,j,k));
            }
        }
    }
    cout<<answer<<endl;
    return 0;
}