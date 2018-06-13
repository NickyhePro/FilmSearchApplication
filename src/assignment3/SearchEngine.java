package assignment3;

/**
 * This class stores a film database 
 * and define a search engine.
 * 
 * @author Nick He
 *
 */
public class SearchEngine {

	private FilmDatabase fdb;
	
	/**
	 * The constructor of the search
	 * engine.
	 * 
	 * @param fdb
	 */
	public SearchEngine(FilmDatabase fdb)
	{
		this.fdb = fdb;
	}
	
	/**
	 * Return results searched by title.
	 * @param title
	 * @return
	 */
	public FilmDatabase byTitle(String title)
	{
		FilmDatabase results = new FilmDatabase();
		for(Film f : fdb.getFilms())
		{
			if(f.getTitle().toLowerCase().contains(title.toLowerCase()))
			{
				results.add(f);
			}
		}
		return results;
	}
	
	/**
	 * Return results searched by director.
	 * 
	 * @param director
	 * @return
	 */
	public FilmDatabase byDirector(String director)
	{
		FilmDatabase results = new FilmDatabase();
		
		for(Film f : fdb.getFilms())
		{
			if(f.getDirector().toLowerCase().contains(director.toLowerCase()))
			{
				results.add(f);
			}
		}
		return results;
	}
	
	/**
	 * Return results searched by rating.
	 * @param rating
	 * @return
	 */
	public FilmDatabase byRating(int rating)
	{
		FilmDatabase results = new FilmDatabase();
		
		for(Film f : fdb.getFilms())
		{
			if(f.getRating() >= rating)
			{
				results.add(f);
			}
		}
		return results;
	}
	
	/**
	 * Return results searched by released year.
	 * 
	 * @param startYear
	 * @param endYear
	 * @return
	 */
	public FilmDatabase releaseBetween(int startYear, int endYear)
	{
		FilmDatabase results = new FilmDatabase();
		
		for(Film f: fdb.getFilms())
		{
			if((f.getReleasedYear()>=startYear) && (f.getReleasedYear()<=endYear))
			{
				results.add(f);
			}
		}
		return results;
	}
	
	/**
	 * Return results searched by genre.
	 * 
	 * @param genre
	 * @return
	 */
	public FilmDatabase byGenre(Genre genre)
	{
		FilmDatabase results = new FilmDatabase();
		
		for(Film f : fdb.getFilms())
		{
			if(f.getGenre() == genre)
			{
				results.add(f);
			}
		}
		return results;
	}
	
	/**
	 * Return results searched by casts.
	 * 
	 * @param casts
	 * @return
	 */
	public FilmDatabase byCasts(String casts)
	{
		FilmDatabase results = new FilmDatabase();
		
		for(Film f : fdb.getFilms())
		{
			if(f.getCasts().toLowerCase().contains(casts.toLowerCase()))
			{
				results.add(f);
			}
		}
		return results;
	}
}
