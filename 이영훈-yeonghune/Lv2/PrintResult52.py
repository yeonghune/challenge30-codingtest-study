'''
출력결과 52

1번째 재귀 (71,15)+10
2번째 재귀 (23,45)+30
3번째 재귀 (7,135)+90
4번째 재귀 (2,405)+135
5번째 재귀 (0,1215)+810
6번째 재귀 0

결과 : 0 + 10 + 30 + 90 + 135 + 810 = 1075
정답 : 1075
'''

def f(x, y):
    if x == 0:
        return 0
    return f(x // 3, y * 3) + x % 3 * y


print(f(215,5))