package assignment3;

/**
 * This class stores information about films including 
 * title, director, rating, released year, casts and genre.
 *
 * @author Nick He
 *
 */
public class Film {

    private String title;
    private String director;
    private double rating;
    private int releasedYear;
    private String casts;
    private Genre genre;
    
    /**
     * This constructor contains such objects of a film.
     * 
     * @param title
     * @param director
     * @param rating
     * @param releasedYear
     * @param casts
     * @param genre
     */
    
    public Film(String title, String director, double rating, int releasedYear, String casts, Genre genre)
    {
    	this.title = title;
    	this.director = director;
    	this.rating = rating;
    	this.releasedYear = releasedYear;
    	this.casts = casts;
    	this.genre = genre;
    }
    
    public Film()
    {
    	
    }
    
    /**
     * Return the title of the film.
     * 
     * @return
     */
	public String getTitle() 
	{
		return title;
	}
	
	/**
	 * Set the title of the film.
	 * 
	 * @param title
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	/**
	 * Return the director of the film.
	 * 
	 * @return
	 */
	public String getDirector() 
	{
		return director;
	}
	
	/**
	 * set the director of the film
	 * 
	 * @param director
	 */
	public void setDirector(String director) 
	{
		this.director = director;
	}
	
	/**
	 * return the rating of the film.
	 * 
	 * @return
	 */
	public double getRating() 
	{
		return rating;
	}
	
	/**
	 * set the rating of the film.
	 * 
	 * @param rating
	 */
	public void setRating(double rating) 
	{
		this.rating = rating;
	}
	
	/**
	 * return the released year of the film.
	 * 
	 * @return
	 */
	public int getReleasedYear()
	{
		return releasedYear;
	}
	
	/**
	 * set the released year of the film.
	 * 
	 * @param releasedYear
	 */
	public void setReleasedYear(int releasedYear)
	{
		this.releasedYear = releasedYear;
	}
	
	/**
	 * return the casts of the film.
	 * 
	 * @return
	 */
	public String getCasts()
	{
		return casts;
	}
	
	/**
	 * set the casts of the film.
	 * 
	 * @param casts
	 */
	public void setCasts(String casts)
	{
		this.casts = casts;
	}
	
	/**
	 * return the genre of the film.
	 * 
	 * @return
	 */
	public Genre getGenre()
	{
		return genre;
	}
	
	/**
	 * set the genre of the film
	 * 
	 * @param genre
	 */
	public void setGenre(Genre genre)
	{
		this.genre = genre;
	}
	
	/**
	 * The representation of the film
	 */
	public String toString()
	{
		String result="";
		result += this.title+" rating star: "+this.rating+"\n";
		result += "Genre: "+this.genre.toString()+" released on: "+this.releasedYear+"\n";
		result += "Director: "+this.director+"\n";
		result += "Casting list: "+this.casts;
		return result;
	}
}
