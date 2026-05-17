class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int i=0, j = people.length - 1;
    
        Arrays.sort(people);
        int boats = 0;
        while(i<=j){
            

            // If lightest + heaviest can fit together
            if (people[i] + people[j] <= limit) {
                i++;
            }

            // Heaviest person always uses a boat
            j--;
            boats++;
        }

        return boats;
    }
}