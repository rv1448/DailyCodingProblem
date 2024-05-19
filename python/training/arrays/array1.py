from array import array
array1 = array('i',[10,20,30,40,50,60])
 

def _createArray():
    from array import array
    array1 = array('i',[10,20,30,40,50,60])
    return array1

def _searchArray(array, elementIndex):
    array.index(elementIndex)

def _insertArray(array, index, value):
    array.insert(index, value)

def _insertArray_pass_by_value(index, value):
    array1.insert(index, value)

def _deleteArray(array, value):
    array.remove(value)

if __name__ == '__main__':
    array_val = _createArray()
    _insertArray(array_val,2,69) 
    _insertArray_pass_by_value(2,69)
    print(array1)