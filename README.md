# LeetCode

1. 一个人一个文件夹
2. 每道题目按照 no. name的文件名存储，一道题一个文件。
3. 如果有多个求解方法，可以都放在同一个文件中。
4. 最好自己写完可以把时间复杂度写上，尤其是zhy和wkh

# git init

1. 本地新建文件夹
2. git init
3. git clone https://github.com/FattyMelon/LeetCode.git

# git 添加文件
1. git status 查看文件改动信息
2. git add . 添加所有修改文件
3. git commit -m "修改信息"  提交修改文件

# git 远程仓库
如果提示没有remote
1. git remote add origin https://github.com/FattyMelon/LeetCode.git
2. git push origin master push代码至远程仓库的master分支

# git push前先pull，因为有可能别人的修改导致你无法提交
1. git pull
2. git push
