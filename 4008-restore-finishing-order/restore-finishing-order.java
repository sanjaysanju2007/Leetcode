class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] res = new int[friends.length];
        int k = 0;
        
        for (int i = 0; i < order.length; i++) {
            for (int f : friends) {
                if (order[i] == f) {
                    res[k++] = order[i];
                    break;
                }
            }
        }
        return res;
    }
}