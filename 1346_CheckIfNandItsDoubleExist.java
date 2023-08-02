// HashMap
class Solution {
    public boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<arr.length; i++) {
            map.put(arr[i], 1);
            for (int j=i+1; j<arr.length; j++) {
                if ((map.containsKey(arr[j] * 2)) || ((arr[j] & 1) == 0 && map.containsKey(arr[j] / 2))) {
                    return true;
                }
            }
        }
        return false;
    }
}

// Linear Search
class Solution {
    public boolean checkIfExist(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            int idx = search(arr[i], arr);
            if (idx >= 0 && idx != i && arr[idx] == 2 * arr[i]) {
                return true;
            }
        }
        return false;
    }

    public int search(int x, int[] a) {
        for (int i=0; i<a.length; i++) {
            if (a[i] == 2 * x) {
                return i;
            }
        }
        return -1;
    }
}
