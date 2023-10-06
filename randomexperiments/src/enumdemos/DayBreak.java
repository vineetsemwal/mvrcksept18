package enumdemos;

public enum DayBreak {
    MorningTeaBreak(15,"11:30am"),
    LunchBreak(60,"1:00pm"),
    EveningTeaBreak(15,"4:00pm");
    private int durationInMinutes;
    private String startTime;
    DayBreak(int duration,String startTime){
        this.durationInMinutes =duration;
        this.startTime=startTime;
    }
    public int getDurationInMinutes(){
        return durationInMinutes;
    }
    public String getStartTime(){
        return startTime;
    }



}
