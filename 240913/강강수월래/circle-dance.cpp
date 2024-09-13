#include <iostream>
#include <unordered_map>
#include <cmath>
using namespace std;

int stCount =0;		// 학생 수 세기 (인덱스)
unordered_map<int,int> umap;	// 학생 인덱스와 학생 번호 연결
int num[100002];
int arr[100002][2];
int n, m, q;
int a, b, com;

void func_1(int a, int b){
    // B의 좌측 노드 -> A의 우측 노드를 연결
    // A->B 연결
    
    int ar = arr[a][1]; int bl = arr[b][0];
    arr[a][1] = b;
    arr[b][0] = a;

    arr[ar][0] = bl;
    arr[bl][1] = ar;
}

void func_2(int a, int b){
    // B의 좌측 노드 -> A 연결
    // A의 좌측 노드 -> B 연결

    int al = arr[a][0]; int bl = arr[b][0];

    arr[bl][1] = a;
    arr[a][0] = bl;

    arr[al][1] = b;
    arr[b][0] = al;
}

	// Output
void func_3(int a){

	// 사이클이 있으므로 bool을 사용하여 한 바퀴만 출력하도록 합니다.
    // index와 번호는 엄연히 다르므로 주의해야 합니다.
    bool once = false;
    int _min = num[a];
    int cur = a;
    while(cur != a || !once){
        _min = min(_min, num[cur]);
        cur = arr[cur][1];
        once = true;
    }

    once = false;
    cur = umap[_min];
    while(cur != umap[_min] || !once){
        cout << num[cur] << ' ';
        cur = arr[cur][0];
        once = true;
    }
}

int main() {
    cin.tie(0);
    ios::sync_with_stdio(0);

    int pre = -1;
    int start;
    cin >> n >> m >> q;
    for(int i=0; i<m; i++){
        cin >> a;
        
        pre = -1;
        for(int j= 0; j<a; j++){
            cin >> b; 
            num[stCount] = b;		// umap과 num배열에 정보 저장
            umap[b] = stCount++;
            if(j==0) start = umap[b];
            arr[umap[b]][0] = pre;
            if(pre != -1) arr[pre][1] = umap[b];
            pre = umap[b];
        }
        arr[pre][1] = start;
        arr[start][0] = pre;
    }

    for(int i=0; i<q; i++){
        cin >> com;
        switch(com){
            case 1:
            cin >> a >> b;
            func_1(umap[a], umap[b]);
            break;
            case 2:
            cin >> a >> b;
            func_2(umap[a], umap[b]);
            break;
            case 3:
            cin >> a;
            func_3(umap[a]);
            break;
        }
    }
    
    return 0;
}