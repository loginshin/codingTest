def solution(my_string, queries):
    answer = ''
    
    s = list(my_string)
    for start, end in queries:
        s[start:end+1] = reversed(s[start:end+1])
    
    return ''.join(s)