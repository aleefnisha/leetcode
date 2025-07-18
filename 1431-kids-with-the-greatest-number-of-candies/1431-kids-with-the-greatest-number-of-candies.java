class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n= candies.length;
        boolean[] resultArray = new boolean[n];
        int max=candies[0];
        for(int i=0;i<n;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(int i=0;i<n;i++){
            resultArray[i]=candies[i]+ extraCandies>=max;
        }
        List<Boolean> resultList = new ArrayList<>();
        for (boolean val : resultArray) {
            resultList.add(val);
        }

        return resultList;
    }
}