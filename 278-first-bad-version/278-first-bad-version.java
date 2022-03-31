/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {

    public int firstBadVersion(int n) {
        return check(0, n);
    }

    public int check(int l, int r) {
        int mid = l + (r - l) / 2;
        if (isBadVersion(mid)) {
            if (!isBadVersion(mid - 1)) return mid;
            return (check(0, mid - 1));
        } else {
            if (isBadVersion(mid + 1)) return mid + 1;
            return check(mid + 1, r);
        }
    }
}
