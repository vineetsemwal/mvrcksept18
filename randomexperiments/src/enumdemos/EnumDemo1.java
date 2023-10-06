package enumdemos;

public class EnumDemo1 {
    public static void main(String[] args) {
        DayBreak lunchBreak=DayBreak.LunchBreak;
        String lunchEnumText=lunchBreak.name();
        int lunchBreakPosition=lunchBreak.ordinal();
        System.out.println("***lunchbreak="+lunchEnumText+" "+lunchBreakPosition);
        System.out.println("***priniting all enum values daybreaks can have");
        DayBreak values[]=DayBreak.values();
        for (DayBreak iteratedBreak:values){
            System.out.print("position="+iteratedBreak.ordinal()+
                    ",starttime="+iteratedBreak.getStartTime()+
                    ",duration="+iteratedBreak.getDurationInMinutes());
        }
        DayBreak morningBreak1=DayBreak.MorningTeaBreak;
        DayBreak morningBreak2=DayBreak.MorningTeaBreak;
        boolean isSameObj=morningBreak1==morningBreak2;
        System.out.println("is same obj="+isSameObj);

    }
}
