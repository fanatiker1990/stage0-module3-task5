package lang.print.gaps.task5;

public class TimeConvertor {
    public void convert(float minutes) {
        System.out.println(minutes*60);
    }

    public static void main(String[] args) {
        TimeConvertor t=new TimeConvertor();
        t.convert(11.5F);
    }
}
