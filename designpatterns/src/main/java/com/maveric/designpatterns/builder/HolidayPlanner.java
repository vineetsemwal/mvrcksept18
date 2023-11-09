package com.maveric.designpatterns.builder;

public class HolidayPlanner {
    private String lunchTime;
    private String dinnerTime;
    private BusType busType;
    private String startDate;
    private String endDate;
    private HolidayPlanner(){}

    public String getLunchTime() {
        return lunchTime;
    }

    public String getDinnerTime() {
        return dinnerTime;
    }

    public BusType getBusType() {
        return busType;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public  static class  HolidayPlannerBuilder {

        private HolidayPlanner planner;
        public HolidayPlannerBuilder(){
           this.planner=new HolidayPlanner();
        }

        public HolidayPlannerBuilder setStartDate(String startDate){
            planner.startDate=startDate;
            return this;
        }

        public HolidayPlannerBuilder setEndDate(String endDate){
            planner.endDate=endDate;
            return this;
        }

        public HolidayPlannerBuilder setLunchTime(String lunchTime){
            planner.lunchTime=lunchTime;
            return this;
        }
        public HolidayPlannerBuilder setBusType(BusType busType){
            planner.busType=busType;
            return this;
        }

        public HolidayPlanner build(){
            return planner;
        }


    }
}
