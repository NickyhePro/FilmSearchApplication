package assignment3;

import java.util.ArrayList;

/**
 * This class stores the information of a film database
 * including the film array list and a search engine.
 * 
 * @author Nick He
 *
 */
public class FilmDatabase {

	private ArrayList<Film> films;
	private SearchEngine searchEngine;

	/**
	 * This constructor contains a film list and 
	 * populates a search engine for this database.
	 * 
	 * @param films
	 */
	public FilmDatabase(ArrayList<Film> films)
	{
	    this.setFilms(films);
	    this.searchEngine = new SearchEngine(this);
	}
	
	/**
	 * The default constructor
	 */
	public FilmDatabase()
	{
		this(new ArrayList<Film>());
	}
	
	/**
	 * return a film list.
	 * 
	 * @return
	 */
	public ArrayList<Film> getFilms() {
		return films;
	}
	
	/**
	 * return a representation of titles of films 
	 * in the list.
	 * 
	 * @return
	 */
	public String[] getFilmList()
	{
		String[] array = new String[this.films.size()];
	
		for(int i =0; i<array.length;i++)
		{
			array[i] = this.films.get(i).getTitle();
		}
		return array;
	}

	/**
	 * set the film list
	 * 
	 * @param films
	 */
	public void setFilms(ArrayList<Film> films) {
		this.films = films;
	}

	/**
	 * return a search engine
	 * 
	 * @return
	 */
	public SearchEngine getSearchEngine() {
		return searchEngine;
	}
	
	/**
	 * add a new film object into a film list
	 * 
	 * @param aFilm
	 */
	public void add(Film aFilm)
	{
		this.films.add(aFilm);
	}

	/**
	 * remove a film object from current film list
	 * 
	 * @param aFilm
	 */
	public void remove(Film aFilm)
	{
		this.films.remove(aFilm);
	}
	
	/**
	 * The representation of the film list
	 */
	public String toString()
	{
		String out = "";
		out+= "Database contains: "+this.films.size()+" film(s) ";
		for(Film p : this.films)
		{
			out+="\n\n"+p;
		}
		
		return out+"\n";
	}

	

}
