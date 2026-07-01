class Solution {
    public double angleClock(int hour, int minutes) {
        hour %= 12;
       double minAngle = 6 * minutes;
       double hourAngle = 30 * hour + 0.5 * minutes;

       double diff = Math.abs(minAngle - hourAngle);

       return Math.min(diff, 360 - diff);
    }
}