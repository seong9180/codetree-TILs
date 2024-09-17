#include <iostream>
#include <unordered_map>
#include <vector>
#include <algorithm>
using namespace std;

unordered_map<int, int> umap;
vector<pair<int,int>> v;

int main() {
    cin.tie(0);
    ios::sync_with_stdio(0);

    int n, k, tmp;
    
	//Input
    cin >> n >> k;
    for(int i=0; i<n; i++){
        cin >> tmp;
        umap[tmp]++;
    }

    for(auto k : umap){
        v.push_back(make_pair(k.second, k.first));
    }
    sort(v.begin(), v.end());

    int s= v.size();
    
    //Output
    for(int i=0; i<k; i++){
        cout << v[s-i-1].second << ' ';
    }


    return 0;
}