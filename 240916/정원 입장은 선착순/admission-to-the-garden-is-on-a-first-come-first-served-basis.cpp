#include <iostream>
#include <queue>
#include <tuple>
#include <vector>
#include <set>
#include <cmath>
using namespace std;

int n, a, b;
priority_queue<tuple<int,int,int>, vector<tuple<int,int,int>>, greater<tuple<int,int,int>>> pq;
set<tuple<int,int,int>> oset;
tuple<int,int,int> tp, tp1;

int main() {
    cin.tie(0);
    ios::sync_with_stdio(0);

	// Input
    cin >> n;
    for(int i=0; i<n; i++){
        cin >> a >> b;
        oset.insert(make_tuple(a, i+1, b));
    }
    	
    // 처음에 도착하는 시간이 같은 사람이 여러명인 경우
    // 전부 pq에 넣고 시작해야함
    int rem = get<0>(*oset.begin());
    while(!oset.empty()){
        tp = *oset.begin(); 
        if(get<0>(tp) != rem) break;

        oset.erase(tp);
        // 1, 0, 2 순으로 넣습니다.
        pq.push(make_tuple(get<1>(tp), get<0>(tp), get<2>(tp)));
    }

    int pre = 0;	// 경과한 시간
    int _max = -1;	// 기다린 시간의 최댓값
    
    while(!pq.empty()){
        tp1 = pq.top(); pq.pop();
        if(pre <= get<1>(tp1)){
        	// 기다리지 않아도 되는 경우
            // 제시간에 들어가서 get<2>(tp1) 만큼 사용하고 나옵니다.
            pre = get<1>(tp1) + get<2>(tp1);
        }
        else 
        {
        	// 기다리는 경우
            // 기다리다가 pre 에 들어가서 get<2>(tp1) 만큼 사용하고 나옵니다.
            // 기다리는 시간의 최댓값을 기록합니다.
            _max = max(_max, pre - get<1>(tp1));
            pre = pre + get<2>(tp1); 
        }
		
        
        // pq가 빈 경우 -> 기다리는 사람이 없는 경우
        // 도착 시간이 같은 사람들을 pq에 넣습니다.
        if(pq.empty() && pre < get<0>(*oset.begin())){
            rem = get<0>(*oset.begin());
            while(!oset.empty()){
                tp = *oset.begin(); 

                if(get<0>(tp) != rem) break;

                oset.erase(tp);
                pq.push(make_tuple(get<1>(tp), get<0>(tp), get<2>(tp)));
            }
        }
        else{
        // pq가 차있는 경우
        // pre(경과시간) 보다 작은 인원들을 pq(기다리는 인원) 에 넣습니다.
            while(!oset.empty()){
                tp = *oset.begin();
                if(pre < get<0>(tp)) break;

                oset.erase(tp);
                pq.push(make_tuple(get<1>(tp), get<0>(tp), get<2>(tp)));
            }
        }
        
    }
    
    cout << _max;
    return 0;
}