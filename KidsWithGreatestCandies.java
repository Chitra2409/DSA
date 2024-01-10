//Question link- https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/


class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];

        // Find the maximum number of candies among all kids
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        // Check if each kid, after adding extraCandies, has the greatest number of candies
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            int totalCandies = candies[i] + extraCandies;
            result.add(totalCandies >= max);
        }

        return result;
    }
}
