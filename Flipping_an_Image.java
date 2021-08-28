class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] a: image){
            reverseArray(a);
        }
        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image[0].length; j++){
                image[i][j] = 1 - image[i][j];
            }
        }
        return image;
    }
    
    void reverseArray(int[] a) {
		for (int i = 0; i < (a.length >> 1); i++) {
			int temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;
		}
	}
}

// Code by Md Zaid Alam