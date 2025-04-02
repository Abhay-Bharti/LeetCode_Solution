class Solution {
        public long maximumTripletValue(int[] nums) {
                int n = nums.length;
                        long max = 0;

                                for (int j = 1; j < n - 1; j++) {
                                            int maxLeft = Integer.MIN_VALUE;
                                                        for (int i = 0; i < j; i++) {
                                                                        maxLeft = Math.max(maxLeft, nums[i]);
                                                                                    }

                                                                                                int maxRight = Integer.MIN_VALUE;
                                                                                                            for (int k = j + 1; k < n; k++) {
                                                                                                                            maxRight = Math.max(maxRight, nums[k]);
                                                                                                                                        }

                                                                                                                                                    max = Math.max(max, (long)(maxLeft - nums[j]) * maxRight);
                                                                                                                                                            }

                                                                                                                                                                    return max;
                                                                                                                                                                        }
                                                                                                                                                                        }

