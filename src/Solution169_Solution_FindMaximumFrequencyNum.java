public class Solution169_Solution_FindMaximumFrequencyNum {
    protected class Solution {//
        public int majorityElement(int[] nums) {
//            Map<String,Integer> answer = new HashMap<String,Integer>();
//            answer.put("0",0);
//            Map<Integer,Integer> map = new HashMap<Integer,Integer>();
//            for( int i: nums){
//                if(map.containsKey(i)==false){
//                    map.put(i,0);
//                }
//                else{int k = map.get(i);
//
//                    map.put(i,k+1);
//                }
//            }
//
//            return
            int majorityCount = nums.length/2;
            int count=0;
            int jj;
            for(int i:nums){
                for( int j:nums){
                    if(j==i){
                        count+=1;//why I cannot use count++?
                    }

                }
                if(count > majorityCount){
                    return i;
                }
                count=0;
            }
            return -1;
        }
        }
    }

