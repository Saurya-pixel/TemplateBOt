public class Movie {
    //A new class must be made. You should change this to match what your class should be named.
    private String name; 
    private String summary;  
    private int year; 
    private String ageRating; 

    public Movie(String n, String s, int y, String r){
        name = n; 
        summary = s;
        year = y;
        ageRating = r;
    }
    public String getName(){
        return name; 
    }
    public String getSummary(){
        return summary;
    }
    public int getYear(){
        return year;
    }
    public String getRating(){
        return ageRating;
    }

}
