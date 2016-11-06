public class Solution{
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    List<List<Integer>> ans = new LinkedList<List<Integer>>();
    Arrays.sort(candidates);
    backtrack(ans, new ArrayList<Integer>(), candidates, target, 0);
    return ans;
    }

    private void backtrack(List<List<Integer>> ans, List<Integer> cur, int[] cand, int targ, int start) {
        if(targ < 0) return; /** no solution */
        else if(targ == 0) ans.add(new ArrayList<>(cur));
        else{
            for (int i = start; i < cand.length; i++) {
                if(i > start && cand[i] == cand[i-1]) continue; /** skip duplicates */
                cur.add(cand[i]);
                backtrack(ans, cur, cand, targ - cand[i], i+1);
                cur.remove(cur.size() - 1);
        }
    }
    }

}
// 此题用hashset实现更简单，不需要判断去重。