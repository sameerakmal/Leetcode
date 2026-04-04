class Solution {
    public boolean canBeEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;

        char[] arr;

        arr = s2.toCharArray();
        swap(arr, 0, 2);
        if (s1.equals(new String(arr))) return true;

        arr = s2.toCharArray();
        swap(arr, 1, 3);
        if (s1.equals(new String(arr))) return true;

        arr = s2.toCharArray();
        swap(arr, 0, 2);
        swap(arr, 1, 3);
        if (s1.equals(new String(arr))) return true;

        return false;
    }

    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}