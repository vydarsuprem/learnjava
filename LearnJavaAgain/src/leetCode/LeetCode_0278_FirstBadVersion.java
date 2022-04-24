package leetCode;

public class LeetCode_0278_FirstBadVersion {

	public static boolean isBadVersion(int number) {
		int bad = 1;
		if (number == bad) {
			return true;
		}
		return false;
	}

	public static int firstBadVersion2(int number) {
		int low = 0;
		int high = number - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (isBadVersion(mid)) {
				return mid;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}
	public static int firstBadVersion(int number) {
        int low = 1;
        int high = number;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(isBadVersion(mid)){
                return mid;
            }else{
                low = mid+1;
            }
        }
        return -1;
	}
	public static int firstBadVersion3(int n) {
		int left = 1;
        int right = n;
        
        while (left < right) {
            int middle = (right - left) / 2 + left;
            
            if (isBadVersion(middle)) {
                right = middle;
            } else {
                left = middle + 1;
            } 
        }
        
        return left;
	}

	public static void main(String[] args) {
		int bad = firstBadVersion(4);
		System.out.println(bad);
	}

}
