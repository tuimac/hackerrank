#!/usr/bin/env python3

import math
import os
import random
import re
import sys

def minimumBribes(q):
    num_bribe = 0
    fin = False
    while fin == False:
        fin = True
        sequence = 0
        for i in range(len(q) - 1):
            if q[i] > q[i + 1]:
                tmp = q[i + 1]
                q[i + 1] = q[i]
                q[i] = tmp
                num_bribe += 1
                sequence += 1
                fin = False
                if sequence > 2:
                    print('Too chaotic')
                    return
            else:
                sequence = 0
    print(num_bribe)
    return
                
if __name__ == '__main__':
    t = int(input().strip())

    for t_itr in range(t):
        n = int(input().strip())

        q = list(map(int, input().rstrip().split()))

        minimumBribes(q)
