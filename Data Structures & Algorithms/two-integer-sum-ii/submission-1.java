class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int result;
        for(int i=0;i<numbers.length;i++){
            result = target - numbers[i];
            if(map.containsKey(result)){
                return new int[]{map.get(result),i+1};
            }
            map.put(numbers[i],i+1);
        }
        return new int[]{};
    }
}
