import itertools
import sys

# 2명의 도둑
# N x N 크기의 방
# M개 열에 있는 물건
# C : 최대 무게
# 한개의 가치는 무게 * 무게

# input 처리
N, M, C = map(int, sys.stdin.readline().split())
board = []

for _ in range(N):
    board.append(list(map(int, sys.stdin.readline().split())))

max_value = 0

# 어느 행에 있는 지 알아내는 함수
def get_row(a):
    return a // N

# 모든 부분 집합을 완전탐색해서 max value 찾아냄
def pick_from_list(li):
    val = 0
    if sum(li) <= C:
        val = sum(n * n for n in li)
    else:
        for length in range(1, len(li)):
            nCr = itertools.combinations(li, length)
            for n in nCr:
                if sum(n) <= C:
                    sum_sqrt_val = sum(x *x  for x in n)
                    if val < sum_sqrt_val:
                        val = sum_sqrt_val
    return val

# 두 도둑의 최대 가치 계산
def get_value(i, j, N):
    row_i = get_row(i)
    row_j = get_row(j)
    new_i_list = board[row_i][i % N:i % N + M]
    new_j_list = board[row_j][j % N:j % N + M]
    total_val = pick_from_list(new_i_list) + pick_from_list(new_j_list)
    return total_val


# 첫번째 도둑 시작 위치 i
for i in range(N * N):
    first_row = get_row(i)
    for j in range(i + 1, N * N):
        second_row = get_row(j)
        value = 0
        # 같은 줄에 있을 때
        if first_row == second_row:
            # print("same row")
            # 두번째 도둑이 훔칠 자리가 있을 떄
            if j >= (i + M) and get_row(i + M) == first_row:
                value = get_value(i, j, N)
                if max_value < value:
                    max_value = value
            else:
                continue
        else:
            # print("other row")
            value = get_value(i, j, N)
            if max_value < value:
                max_value = value
        # print("\n", i, first_row, j, second_row, value)
print(max_value)