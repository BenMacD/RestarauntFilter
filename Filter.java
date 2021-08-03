class Solution {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
    
          List<Integer> result =  Arrays.stream(restaurants)
                           .filter(a -> veganFriendly != 1 || a[2] == veganFriendly)
            .filter(a -> a[3] <= maxPrice)
            .filter(a -> a[4] <= maxDistance)
            .sorted((a, b) -> a[1]==b[1] ? -Integer.compare(a[0], b[0]) : -Integer.compare(a[1], b[1]))
            .map(a -> a[0]).collect(Collectors.toList());
        return result;
    }
}
