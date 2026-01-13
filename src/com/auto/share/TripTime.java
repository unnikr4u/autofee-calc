package com.auto.share;

public enum TripTime {
    AM_7("7:00 AM"),
    AM_8("8:00 AM"),
    PM_1("1:00 PM"),
    PM_3_30("3:30 PM");

    private final String display;

    TripTime(String display) {
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }
}

