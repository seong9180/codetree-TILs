#include <iostream>
using namespace std;

int n;
int arr[100002] = {0,};
long long int l[100002] = {0,};
long long int r[100002] = {0,};



int main() {
    cin >> n;

    for(int i=1; i<=n; i++)
    {
        cin >> arr[i];
    }

    //left prefix
    for(int i=1; i<=n; i++)
    {
        l[i] = l[i-1] + arr[i];
    }

    //right prefix
    for(int i=n; i>=1; i--)
    {
        r[i] = r[i+1] + arr[i];
    }

    long long int answer = 0;
    for(int i=2; i<=n-2; i++)
    {
        long long int leftsum = l[i];
        long long int rightsum = r[i+1];


        if(leftsum == rightsum && leftsum%2 == 0)
        {
            //1~i 두 구간 쪼개기
            //i+1 ~ n 두 구간 쪼개기
            int leftcnt = 0;
            int rightcnt = 0;

            for(int j=1; j<i; j++)
            {
                if(l[j] == (leftsum/2)) leftcnt++;
            }

            for(int j=n; j>i+1; j--)
            {
                if(r[j] == (rightsum/2))rightcnt++;
            }

            answer += leftcnt * rightcnt;
        }
    }

    cout << answer;

    // 여기에 코드를 작성해주세요.
    return 0;
}