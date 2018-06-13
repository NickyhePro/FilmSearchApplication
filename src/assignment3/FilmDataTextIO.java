package assignment3;

import java.io.*;

import java.util.*;

/**
 * This class contains two methods which read and save
 * the film data from text file
 * 
 * @author Nick He
 *
 */
public class FilmDataTextIO {

	/**
	 * This methods takes two parameters to save
	 * the film data from the film list.
	 * 
	 * @param films
	 * @param filename
	 */
	public static void output(ArrayList<Film> films,String filename)
	{
		try {
			PrintWriter out = new PrintWriter(new FileWriter(filename));
            int size = films.size();
            for(int i=0;i<size;i++)
            {
            	out.println(films.get(i).getGenre());
            	out.println(films.get(i).getTitle());
    			out.println(films.get(i).getDirector());
    			out.println(films.get(i).getRating());
    			out.println(films.get(i).getReleasedYear());
    			out.println(films.get(i).getCasts());
            }
		
			out.close();

		} catch (IOException e) 
		{
			System.err.println("An IO error occurred");    //print out the error encounterd
			e.printStackTrace();
		}

	}
	

	/**
	 * This method read data from text file to
	 * generate the film list.
	 * 
	 * @param inputFileName
	 * @return
	 */
	public static ArrayList<Film> input(String inputFileName)
	{
		try 
		{
			ArrayList<Film> films = new ArrayList<Film>();
			Scanner in = new Scanner(new FileReader(inputFileName));
			while(in.hasNextLine())
			{
				Genre genre = null;
				try{
					genre = Genre.valueOf(in.nextLine());
				}catch(IllegalArgumentException e)
				{
					films = null;
				}
				String title = in.nextLine();
				String director = in.nextLine();
				double rating = Double.parseDouble(in.nextLine());
				int releasedYear = Integer.parseInt(in.nextLine());
				String casts = in.nextLine();
				
				films.add(new Film(title,director,rating,releasedYear,casts,genre));
			}
				
			in.close();
			return films;

		} catch (FileNotFoundException e) 
		{		
			e.printStackTrace();
		}
		return null;

		
	}
}
