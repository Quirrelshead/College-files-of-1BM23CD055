# -*- coding: utf-8 -*-
"""
Created on Fri Feb 13 11:46:10 2026

@author: Admin
"""

import numpy as np 
import matplotlib.pyplot as plt 

x = np.linspace(-2,8,100)

f = x**2 - 6*x + 10

plt.plot(x,f)
plt.scatter(3,3**2 - 6*3 + 10,
              color = 'red')
plt.title("quad minimization")
