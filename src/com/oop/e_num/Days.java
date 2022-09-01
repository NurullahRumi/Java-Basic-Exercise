package com.oop.e_num;

public enum Days {
	FRIDAY("Offday."),
    SATERDAY("Offday."),
    SUNDAY("Starting Week."),
    MONDAY("Meeting Day."),
    TUESDAY("Middle of the week."),
    WEDNESDAY("Movie day."),
    THRUSDAY("Outting day.");

    final String dayActivity;

    Days(String dayActivity){
        this.dayActivity = dayActivity;
    }
}
