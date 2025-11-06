class Solution {
    public int[] productExceptSelf(int[] array) {
        int[] result = new int[array.length];
		int product = 1;
        int countZero = 0;
		for(int arr: array) {
			if(arr != 0){
                product *= arr;
            }else{
                countZero++;
            }
		}
        if(countZero > 1){
            return result;
        }
		for(int i = 0;i < array.length; i++) {
			if(countZero == 0){
                result[i] = product/array[i];
            }else{
                if(array[i] == 0){
                    result[i] = product;
                }
            }
		}
		return result;
    }
}