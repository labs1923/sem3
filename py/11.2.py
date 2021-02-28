import numpy as np
ab = np.array([(1,2,3),(4,5,6),(7,8,9)])
cd = np.array([(1,0,0),(0,1,0),(0,0,1)])
print(ab+cd)
print(np.transpose(ab))
print(np.dot(ab,cd))
