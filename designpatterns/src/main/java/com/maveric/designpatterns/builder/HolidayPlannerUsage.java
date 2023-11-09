package com.maveric.designpatterns.builder;

public class HolidayPlannerUsage {
    public static void main(String[] args) {
        HolidayPlanner.HolidayPlannerBuilder builder = new HolidayPlanner.HolidayPlannerBuilder();
        HolidayPlanner planner=builder.setLunchTime("12:30pm")
                .setStartDate("1-nov-23")
                .setEndDate("10-nov-23")
                .setBusType(BusType.DELUXE)
                .build();

        System.out.println("planner constructed="+planner.getStartDate()+"-"+planner.getEndDate()+"-"+planner.getBusType());

    }
}
