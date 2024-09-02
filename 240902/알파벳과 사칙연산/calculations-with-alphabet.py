import sys
sys.setrecursionlimit(10**5)
 
def f(value_array, S):
    N = value_array[ord(S[0]) - ord('a')]
    for i in range(2, len(S), 2):
        M = value_array[ord(S[i]) - ord('a')]
        if S[i - 1] == '-':
            N -= M
        elif S[i - 1] == '+':
            N += M
        else:
            N *= M
 
    value_array[0] += 1
    for i in range(len(value_array)):
        if value_array[i] > 4:
            if i == len(value_array) - 1:
                return N
            value_array[i] = 1
            value_array[i + 1] += 1
    return max(N, f(value_array, S))
 
 
def main():
    S = input()
    print(f([1 for _ in range(6)], S))
 
main()