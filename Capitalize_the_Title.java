class Solution {
    public String capitalizeTitle(String title) {
        String[] arr = title.split(" ");
        StringBuilder ans = new StringBuilder();
        for(String str: arr){
            if(str.length() > 2){
                ans.append(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase() + " ");
            }else{
                ans.append(str.toLowerCase() + " ");
            }
        }
        return ans.toString().trim();
    }
}

// Code by Md Zaid Alam