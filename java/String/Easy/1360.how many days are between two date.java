class Solution {

    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(totalDays(date1) - totalDays(date2));
    }

    // Convert date to total no.of days  by converting string to the integer. 
    private int totalDays(String date) {
        
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        int days = 0;

        
        for (int i = 0; i < year; i++) {
            days += isLeap(i) ? 366 : 365;
        }

        // Add days for months in current year
        int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};

        for (int i = 0; i < month - 1; i++) {
            days += monthDays[i];
        }

        // If leap year and month > Feb, add 1 extra day
        if (month > 2 && isLeap(year)) {
            days += 1;
        }

        // Add current day
        days += day;

        return days;
    }

    // finally , Check leap year
    private boolean isLeap(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return year % 4 == 0;
    }
}
