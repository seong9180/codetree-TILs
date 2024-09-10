#include <iostream>
#include <set>
using namespace std;

int N, T, a, b;
set<pair<int,int>> oset;
set<pair<int,int>>::iterator iter, copyIter, preIter, nextIter;

float time1, time2;

int main() {
    
    cin.tie(0);
    ios::sync_with_stdio(0);

    cin >> N >> T;

	// Input
    for(int i=0; i<N; i++){
        cin >> a >> b;
        oset.insert(make_pair(a, b));
    }

    iter=oset.begin();
    while(iter != oset.end()){
        
        copyIter = iter;
        auto curPair = *(copyIter++);
        nextIter = copyIter--;
        preIter = --copyIter;
		
        
        // 삼항연산자 -> 각 그룹이 만나는 시간 계산 (음수면 만나지 못함)
        time1 = preIter->second - curPair.second == 0 ? -1 : (float)(curPair.first - preIter->first)/(preIter->second - curPair.second);
        time2 = curPair.second - nextIter->second == 0 ? -1 : (float)(nextIter->first - curPair.first)/(curPair.second - nextIter->second);

        if(nextIter == oset.end() && iter == oset.begin()) break;
        else if(nextIter == oset.end()){     // 앞선 사람이 없는 경우   
            if(time1 > 0 && time1 <= T){	 // 제한시간 내에 만날 수 있는지 확인
            oset.erase(*preIter);
            }
            else {
                iter++; continue;
            }
        }
        else if(iter == oset.begin()){		// 뒤쳐진 사람이 없는 경우
            if(time2 > 0 && time2 <= T){	
            oset.erase(curPair);
            iter = nextIter;
            }
            else {
                iter++; continue;
            }
        }
        else{								// 둘 다 있는 경우 양쪽 다 확인
            if(time1 > 0 &&  time1 <= T && time2 > 0 && time2 <= T){
                if(time1 < time2)		// 더 빠른 쪽 먼저 같은 그룹으로 만들어줌
                    oset.erase(*preIter);
                else{
                    oset.erase(curPair);
                    iter = nextIter;
                }
            }
            else if(time1 > 0 &&  time1 <= T){
            oset.erase(*preIter);
            }
            else if(time2 > 0 && time2 <= T){
            oset.erase(curPair);
            iter = nextIter;
            }
            else{
                iter++; continue;
            }
        }

    }

    cout << oset.size();

    return 0;
}