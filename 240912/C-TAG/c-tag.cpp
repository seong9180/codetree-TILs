#include <iostream>
#include <string>
#include <unordered_set>
#include <vector>
using namespace std;

int n, m;
string s;
unordered_set<string> uset;
vector<string> v1;
vector<string> v2;

int main() {

    cin.tie(0);
    ios::sync_with_stdio(0);

	// Input
    cin >> n >> m;
    for(int i=0; i<n; i++){
        cin >> s;
        v1.push_back(s);
    }
    for(int i=0; i<n; i++){
        cin >> s;
        v2.push_back(s);
    }


    s = "   ";
    int count = 0;
    bool once = false;
    
    // 모든 조합을 3중 for문으로 순회
    for(int i=0; i<m; i++){
        for(int j=i+1; j<m; j++){
            for(int k =j+1; k<m; k++){
            
            	// A 그룹의 조합을 unordered_set에 저장
                uset.clear();
                once = false;
                for(int t=0; t<n; t++){
                    s[0] = v1[t][i];
                    s[1] = v1[t][j];
                    s[2] = v1[t][k];
                    uset.insert(s); 
                }
                
				// unordered_set에 저장된 조합들과 B 그룹의 조합을 비교
                for(int t=0; t<n; t++){
                    s[0] = v2[t][i];
                    s[1] = v2[t][j];
                    s[2] = v2[t][k];
                    if(uset.find(s) != uset.end()){
                        once = true; break;
                    }
                }

                if(!once) count++;

            }
        }
    }
	
    
    // Output
    cout << count;
    return 0;
}