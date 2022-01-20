public class Holiday {
        private String name;
        private int day;
        private String month;
    public Holiday(String n,int d,String m)
    {
        this.name=n;
        this.day=d;
        this.month=m;
    }
    public boolean isSameDate(Holiday h)
    {
        return (month.equals(h.month));
    }
    public static double avgDate(Holiday[] h)
    {
        double sum=0;
        int n=h.length;
        for(int i=0;i<n;i++)
        {
            sum+=h[i].day;
        }
        return sum/n;
    }
    public static void main(String[] args)
    {
        Holiday h1= new Holiday("Independence Day",4,"July");
        Holiday h2= new Holiday("Republic Day",26,"January");
        Holiday h3= new Holiday("Children's Day",17,"July");
        System.out.println(h1.isSameDate(h2));
        Holiday[] hArray={h1,h2,h3};
        System.out.println("Average="+avgDate(hArray));
    }
}
