class Holiday
{
    private String name;
    private int day;
    private String month;

    Holiday(String name_s, String month_s, int day_s)
    {
        name = name_s;
        month = month_s;
        day = day_s;
    }
    static boolean isSameMonth(String month1, String month2)
    {
        if(month1 == month2)
            return  true; //return(month1==month2)
        else return false;
    }
    static double avgDate(Holiday[] obj)
    {
        double sumDates = 0;
        int noOfObj = obj.length;
        for(int i = 0; i < noOfObj ; i++)
        {
            sumDates = sumDates + obj[i].day;
        }
        return sumDates/noOfObj;
    }
    public static void main(String a[])
    {
        Holiday[] object = new Holiday[4];
        object[0] = new Holiday("Independence Day", "July", 4);
        object[1] = new Holiday("Christmas", "December", 25);
        object[2] = new Holiday("Boxing Day", "December", 26);
        object[3] = new Holiday("Diwali", "November", 7);
        System.out.println("Object with name = " + object[0].name + ", month = " + object[0].month + ", day = " + object[0].day + " Created ");
        System.out.println("Check if Christmas and Boxing Day are in same month : "+ isSameMonth(object[1].month,object[2].month));
        System.out.println("Check if Christmas and Diwali are in same month : "+ isSameMonth(object[1].month,object[3].month));
        System.out.println("Average Date = " + avgDate(object));
    }
}
