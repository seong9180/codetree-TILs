#include <iostream>
#include <unordered_set>
#include <vector>
using namespace std;

int n, g, m, t;
vector<unordered_set<int>> group;	// 각 인원의 포함된 그룹 정보
vector<unordered_set<int>> people;	// 각 그룹의 그룹원 정보
unordered_set<int> q;				// BFS를 위한 q

int main(){

    cin.tie(0);
    ios::sync_with_stdio(0);

	// Input
    cin >> n >> g;
    people.resize(g);
    group.resize(n);
    for(int i=0; i<g; i++){
        cin >> m;
        for(int j=0; j<m; j++){
            cin >> t;
            people[i].insert(t-1);
            group[t-1].insert(i);
        }
    }

	// BFS 구현
    int ans = 0;
    q.insert(0);
    while(!q.empty()){
        int v = *q.begin(); q.erase(v);
        ans++;
		
        // 0번 사람 -> 포함하는 그룹을 순회하면서 erase
        // erase 후에 size()가 1만 남으면 해당 인원이 초대장을 받을 수 있으므로 지우고 q에 insert
        for(auto k : group[v]){
               people[k].erase(v);
               if(people[k].size() == 1){
                    int v2 = *people[k].begin(); people[k].erase(v2);
                    group[v2].erase(k);
                    q.insert(v2);
               }
        }
    }
    
    // Output
    cout << ans;

    return 0;
}