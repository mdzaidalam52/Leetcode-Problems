class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int ans = 0;
        for(int i = 0; i < experience.length; i++){
            ans += Math.max(energy[i] + 1 - initialEnergy, 0) + Math.max(experience[i] + 1 - initialExperience, 0);
            initialEnergy = Math.max(initialEnergy, energy[i] + 1);
            initialExperience = Math.max(initialExperience, experience[i] + 1);
            initialExperience += experience[i];
            initialEnergy -= energy[i];
        }
        return ans;
    }
}

// Code by Md Zaid Alam