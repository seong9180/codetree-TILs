#include <iostream>
#include <vector>
#include <tuple>

using namespace std;

int t, n, m;
int arr[51][51];
vector<tuple<int, int, int> > ball;

bool InRange(int x, int y){
    return x>=0 && x<n && y>=0 && y<n;
}

int DirToInt(char dir){
    if(dir=='L') return 0;
    if(dir=='U') return 1;
    if(dir=='R') return 2;
    if(dir=='D') return 3;
    return -1;
}

void Remove(){
    vector<tuple<int, int, int> > newBall;
    for(int i=0; i<ball.size(); ++i){
        int x=get<0>(ball[i]);
        int y=get<1>(ball[i]);
        if(arr[x][y]==1) newBall.push_back(ball[i]);
        else arr[x][y]=0;
    }
    ball=newBall;
}

// 충분한 시간이 흐른 후 남아있는 구슬의 갯수 리턴
int Play(){
    // 좌(0,-1) 상(-1,0) 우(0,1) 하(1,0)
    int dx[4] = {0, -1, 0, 1};
    int dy[4] = {-1, 0, 1, 0};

    // 2*n초 동안 반복(n칸을 왕복해야 하니까)
    for(int time=0; time<2*n; ++time){
        
        for(int idx=0; idx<ball.size(); ++idx){
            int x, y, dir;
            tie(x, y, dir)= ball[idx];

            int nx=x+dx[dir];
            int ny=y+dy[dir];
            if(!InRange(nx, ny)){
                dir= (dir+2)%4;
            }
            else{
                arr[x][y]--;
                x=nx;
                y=ny;
                arr[x][y]++;
            }
            ball[idx] = tie(x, y, dir);
        }
        Remove();
    }

    return ball.size();
}

int main() {
    cin >> t;
    while(t--){
        // ball 벡터 비우기
        while(!ball.empty()) ball.pop_back();
        // arr 초기화
        for(int i=0; i<n; ++i){
            for(int j=0; j<n; ++j){
                arr[i][j]=0;
            }
        }
		
        // input
        cin >> n >> m;
        for(int i=0; i<m; ++i){
            int x, y;
            char d;
            cin >> x >> y >> d;
            ball.push_back(make_tuple(x-1, y-1, DirToInt(d)));
            arr[x-1][y-1]=1;
        }
		
        // solution & output
        cout << Play() << '\n';
    }
    return 0;
}