public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList();
        List<Integer> cur = new ArrayList();
        dfs(target, 0, candidates, ans, cur);
        return ans;
    }
    
    void dfs(int targ, int pre, int[] cand, List<List<Integer>> ans, List<Integer> cur){
        if(targ == 0){
            ans.add(new ArrayList(cur)); //这里为什么不是直接add cur?
            return;
        }
        for(int i : cand){
            if(i >= pre && (i <= targ - pre || i == targ)){
                cur.add(i);
                dfs(targ-i, i, cand, ans, cur);
                cur.remove(cur.size() - 1); //这一步的用意是清除第一个节点的cur，跳到下一个节点进行递归。是不是啊我浓
            }
        }
        
    }
    
    
}