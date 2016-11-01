# LeetCode

1. 一个人一个文件夹
2. 每道题目按照 no. name的文件名存储，一道题一个文件。
3. 如果有多个求解方法，可以都放在同一个文件中。
4. 最好自己写完可以把时间复杂度写上，尤其是zhy和wkh

# 作业1
10月27日之前, 题号1-6, 难度为hard的可以看看discuss，看不懂问我，再不懂就先放着。  
题目2 基本的链表操作，不会的好好学一学。  
题目5 有点难度的动态规划，狗昱我们之前聊过的，你也好好看看  

# 作业2：（连同作业1，最好11月10号前搞定）
(因为wkh说的要不要按题型来刷，那我先给个数组的吧，下一次链表，换着来不枯燥)   
1. two Sum  //要求O(nlogn)或者O(n)的解法  
167. two sum 2	//要求O(n)的解法  
39. Combination Sum   
40. Combination Sum II   
33. Search in Rotated Sorted Array  //暴力解法遍历一遍O(n)可以AC，但是要求你们写出O(logn)的解法  


# git init

1. 本地新建文件夹
2. git init git初始化  
3. git clone https://github.com/FattyMelon/LeetCode.git

# git 添加文件
1. 本地添加文件夹如csn,在csn/目录下添加代码文件
2. git status 查看文件改动信息
3. git add csn/  添加自己目录下的文件（尽量不要所用 git add . 添加所有修改文件）  
4. git commit -m "修改信息"  提交修改文件

# git 远程仓库  

如果提示没有remote  
1. git remote add origin https://github.com/FattyMelon/LeetCode.git  
2. git push origin master push代码至远程仓库的master分支

# git push前先pull，因为有可能别人的修改导致你无法提交
1. git pull
2. git push
3. 如果提示错误，把origin master加在pull和push后面
