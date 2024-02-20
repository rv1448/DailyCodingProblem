################ Problem ################

# Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

# For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

# Follow-up: what if you can't use division?
from  functools import reduce
input = [1, 2, 3, 4, 5]
# output = [120, 60, 40, 30, 24]
test= reduce(lambda x, y: x * y, input)
final_output = [int(test/i) for i in input]

def head_tail(arr, i):
    len_arr = len(arr)
    head = [1]

    if i >= len_arr:
        return [1] 
    if i == 0:
        return (head, arr[1::])
    else:
        return (arr[0:i], arr[i::len_arr])
     
def reduce_head_tail(test):
    head, tail = test
    return reduce(lambda x,y: x *y, head) * reduce(lambda x,y: x *y, tail)

print(head_tail([10,2,3,4,5,6],1))
tests = head_tail([10,2,3,4,5,6],0)
print(reduce_head_tail(tests))