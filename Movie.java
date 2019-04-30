
 class Movie
{
    private String title;
    private String studio;
    private String rating;

    Movie(String title_s, String studio_s, String rating_s)
    {
        title = title_s;
        studio= studio_s;
        rating = rating_s;
    }
    Movie(String title_s, String studio_s)
    {
        title = title_s;
        studio= studio_s;
        rating = "PG";
    }
    static Movie[] getPG(Movie[] obj)
    {
        int count_objr = 0;
        for(int i = 0; i < obj.length; i++)
        {
            if(obj[i].rating == "PG")
            {
                count_objr++;
            }
        }
        Movie[] objr = new Movie[count_objr];
        count_objr = 0;
        for(int i = 0; i < obj.length; i++)
        {
            if(obj[i].rating == "PG")
            {
                objr[count_objr] = obj[i];
                count_objr++;
            }
        }
        return objr;
    }
    public static void main(String args[])
    {
        Movie[] object = new Movie[4];
        object[0] = new Movie("Casino Royale","Eon Productions","PG-13");
        object[1] = new Movie("The Incredibles","Pixar");
        object[2] = new Movie("Toy Story","Pixar");
        object[3] = new Movie("Once Upon a Deadpool","Marvel Entertainment","PG-13");
        System.out.println("Object with title = " + object[0].title + ", studio = " + object[0].studio + ", rating = " + object[0].rating + " Created ");
        Movie objectr[] = getPG(object);
        System.out.println("PG Rated Movies are : ");
        for(int i = 0; i < objectr.length; i++)
            System.out.println(objectr[i].title);
    }
}
