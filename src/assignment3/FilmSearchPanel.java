package assignment3;

import java.awt.Font;

import javax.swing.*;

/**
 * This class stores the information of 
 * JComponents and the film database.
 * 
 * @author Nick He
 *
 */
public class FilmSearchPanel extends JPanel{

	private FilmDatabase model;
	private JList<String> filmList;
	private JTextArea outcome;
	private JLabel title;
	private JLabel director;
	private JLabel start;
	private JLabel end;
	private JLabel casts;
	private JLabel rating;
	private JLabel genre;
	private JLabel title2;
	private JLabel director2;
	private JLabel yearLabel;
	private JLabel casts2;
	private JLabel rating2;
	private JLabel genre2;
	private JLabel search;
	private JLabel database;
	private JLabel movieList;
	private JTextField filmTitle;
	private JTextField filmDirector;
	private JTextField startYear;
	private JTextField endYear;
	private JTextField filmCasts;
	private JTextField filmTitle2;
	private JTextField filmDirector2;
	private JTextField year;
	private JTextField filmRating2;
	private JTextField filmCasts2;
	private JComboBox<String> genreBox2;
	private JComboBox<String> filmRating;
	private JComboBox<String> genreBox;
	private JButton searchButton;
	private JButton addButton;
	private JButton removeButton;
	
	/**
	 * Return the film list.
	 * 
	 * @return
	 */
	public JList<String> getFilmList() {
		return filmList;
	}
	
	/**
	 * return the outcome area.
	 * 
	 * @return
	 */
	public JTextArea getOutcome() {
		return outcome;
	}	
	
	/**
	 * return the text in title text field 
	 * in search module.
	 * 
	 * @return
	 */
	public JTextField getFilmTitle() {
		return filmTitle;
	}
	
	/**
	 * return the text in director text field
	 * in search module.
	 * 
	 * @return
	 */
	public JTextField getFilmDirector() {
		return filmDirector;
	}
	
	/**
	 * return the text in start year text field
	 * in search module.
	 * 
	 * @return
	 */
	public JTextField getStartYear() {
		return startYear;
	}
	
	/**
	 * return the text in end year text field
	 * in search module.
	 * 
	 * @return
	 */
	public JTextField getEndYear() {
		return endYear;
	}
	
	/**
	 * return the text in film casts text field
	 * in search module.
	 * 
	 * @return
	 */
	public JTextField getFilmCasts() {
		return filmCasts;
	}
	
	/**
	 * return the value in film rating combo
	 * box area in search module.
	 * 
	 * @return
	 */
	public JComboBox<String> getFilmRating() {
		return filmRating;
	}
	/**
	 * return the value in genre combo
	 * box area in search module.
	 * 
	 * @return
	 */
	public JComboBox<String> getGenreBox() {
		return genreBox;
	}
	
	/**
	 * return the search button in 
	 * search module.
	 * 
	 * @return
	 */
	public JButton getSearchButton() {
		return searchButton;
	}
	
	/**
	 * return the add button in 
	 * search module.
	 * 
	 * @return
	 */
	public JButton getAddButton() {
		return addButton;
	}
	
	/**
	 * return the remove button in 
	 * search module.
	 * 
	 * @return
	 */
	public JButton getRemoveButton() {
		return removeButton;
	}
	
	
	/**
	 * return the text in title text field 
	 * in database module.
	 * 
	 * @return
	 */
	public JTextField getFilmTitle2() {
		return filmTitle2;
	}
	
	/**
	 * return the text in director text field 
	 * in database module.
	 * 
	 * @return
	 */
	public JTextField getFilmDirector2() {
		return filmDirector2;
	}
	
	/**
	 * return the text in year text field 
	 * in database module.
	 * 
	 * @return
	 */
	public JTextField getYear() {
		return year;
	}
	
	/**
	 * return the text in film rating text field 
	 * in database module.
	 * 
	 * @return
	 */
	public JTextField getFilmRating2() {
		return filmRating2;
	}
	
	/**
	 * return the text in film casts text field 
	 * in database module.
	 * 
	 * @return
	 */
	public JTextField getFilmCasts2() {
		return filmCasts2;
	}
	
	/**
	 * return the value in genre combo box 
	 * in database module.
	 * 
	 * @return
	 */
	public JComboBox<String> getGenreBox2()
	{
		return genreBox2;
	}
	
	/**
	 * This constructor populates the JComponents
	 * above and a new database as model.
	 * 
	 * @param model
	 */
	public FilmSearchPanel(FilmDatabase model)
	{
		this.model = model;
		setLayout(null);
		
		this.movieList = new JLabel("Movie List");
		this.movieList.setLocation(20,20);
		this.movieList.setSize(150,20);
		this.movieList.setFont(new Font("Times", Font.BOLD, 16));
		this.add(movieList);
		
		this.filmList = new JList<String>(this.model.getFilmList());
		JScrollPane scrollPane1 = new JScrollPane(filmList,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane1.setLocation(20, 50);
		scrollPane1.setSize(200, 310);
		this.add(scrollPane1);
		
		this.outcome = new JTextArea();
		this.outcome.setEditable(false);
		JScrollPane scrollPane2 = new JScrollPane(outcome,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane2.setLocation(20, 370);
		scrollPane2.setSize(540, 200);
		this.add(scrollPane2);
		
		this.search = new JLabel("Search Engine");
		this.search.setLocation(240,20);
		this.search.setSize(150,20);
		this.search.setFont(new Font("Times", Font.BOLD, 16));
		this.add(search);
		
		this.title = new JLabel("Title");
		this.title.setLocation(240,50);
		this.title.setSize(100,10);
		this.add(title);
		
		this.filmTitle = new JTextField();
		this.filmTitle.setLocation(240, 60);
		this.filmTitle.setSize(150,20);
		this.add(filmTitle);
		
		this.director = new JLabel("Director");
		this.director.setLocation(240, 90);
		this.director.setSize(100,10);
		this.add(director);
		
		this.filmDirector = new JTextField();
		this.filmDirector.setLocation(240, 100);
		this.filmDirector.setSize(150, 20);
		this.add(filmDirector);
		
		this.start = new JLabel("From");
		this.start.setLocation(240, 180);
		this.start.setSize(70,20);
		this.add(start);
		
		this.startYear = new JTextField();
		this.startYear.setLocation(240, 200);
		this.startYear.setSize(70,20);
		this.add(startYear);
		
		this.end = new JLabel("To");
		this.end.setLocation(320, 180);
		this.end.setSize(70,20);
		this.add(end);
		
		this.endYear = new JTextField();
		this.endYear.setLocation(320, 200);
		this.endYear.setSize(70,20);
		this.add(endYear);
		
		this.casts = new JLabel("Casts");
		this.casts.setLocation(240,130);
		this.casts.setSize(50,20);
		this.add(casts);
		
		this.filmCasts = new JTextField();
		this.filmCasts.setLocation(240, 150);
		this.filmCasts.setSize(150,20);
		this.add(filmCasts);
		
		this.rating = new JLabel("Rating");
		this.rating.setLocation(240,230);
		this.rating.setSize(100,20);
		this.add(rating);
		
		String[] ratings = {"Above One", "Above Two", "Above Three", "Above Four", "Five"};
		this.filmRating = new JComboBox<String>(ratings);
		this.filmRating.setLocation(240, 250);
		this.filmRating.setSize(150,20);
		this.add(filmRating);
		
		this.genre = new JLabel("Genre");
		this.genre.setLocation(240,280);
		this.genre.setSize(50,20);
		this.add(genre);
		
		String[] genres = {"None", "Action", "Comedy", "Fantasy", "Romance"};
		this.genreBox = new JComboBox<String>(genres);
		this.genreBox.setLocation(240, 300);
		this.genreBox.setSize(150,20);
		this.add(genreBox);
		
		this.database = new JLabel("Database");
		this.database.setLocation(410,20);
		this.database.setSize(150,20);
		this.database.setFont(new Font("Times", Font.BOLD, 16));
		this.add(database);
		
		this.title2 = new JLabel("Title");
		this.title2.setLocation(410,50);
		this.title2.setSize(100,10);
		this.add(title2);
		
		this.filmTitle2 = new JTextField();
		this.filmTitle2.setLocation(410, 60);
		this.filmTitle2.setSize(150,20);
		this.add(filmTitle2);
		
		this.director2 = new JLabel("Director");
		this.director2.setLocation(410, 90);
		this.director2.setSize(100,10);
		this.add(director2);
		
		this.filmDirector2 = new JTextField();
		this.filmDirector2.setLocation(410, 100);
		this.filmDirector2.setSize(150, 20);
		this.add(filmDirector2);
		
		this.casts2 = new JLabel("Casts");
		this.casts2.setLocation(410,130);
		this.casts2.setSize(50,20);
		this.add(casts2);
		
		this.filmCasts2 = new JTextField();
		this.filmCasts2.setLocation(410, 150);
		this.filmCasts2.setSize(150,20);
		this.add(filmCasts2);
		
		this.yearLabel = new JLabel("Released Year");
		this.yearLabel.setLocation(410, 180);
		this.yearLabel.setSize(100,20);
		this.add(yearLabel);
		
		this.year = new JTextField();
		this.year.setLocation(410, 200);
		this.year.setSize(150,20);
		this.add(year);
		
		this.rating2 = new JLabel("Rating from 1 to 5 stars");
		this.rating2.setLocation(410,230);
		this.rating2.setSize(200,20);
		this.add(rating2);
		
		this.filmRating2 = new JTextField();
		this.filmRating2.setLocation(410, 250);
		this.filmRating2.setSize(150,20);
		this.add(filmRating2);
		
		this.genre2 = new JLabel("Genre");
		this.genre2.setLocation(410,280);
		this.genre2.setSize(50,20);
		this.add(genre2);
		
		String[] genres2 = {"Action", "Comdey", "Fantasy", "Romance"};
		this.genreBox2 = new JComboBox<String>(genres2);
		this.genreBox2.setLocation(410, 300);
		this.genreBox2.setSize(150,20);
		this.add(genreBox2);
		
		this.searchButton = new JButton("Search");
		this.searchButton.setLocation(240, 330);
		this.searchButton.setSize(150,30);
		this.add(searchButton);
		
		this.addButton = new JButton("Add");
		this.addButton.setLocation(410, 330);
		this.addButton.setSize(70,30);
		this.add(addButton);
		
		this.removeButton = new JButton("Rem");
		this.removeButton.setLocation(490, 330);
		this.removeButton.setSize(70,30);
		this.add(removeButton);
		
		setSize(600,620);
		
		this.update();
	}

	/**
	 * This method contains some functions
	 * to update the JPanel.
	 */
	public void update()
	{
		this.filmList.setListData(this.model.getFilmList());
		this.removeButton.setEnabled(this.filmList.getSelectedIndex()!=-1);
		this.addButton.setEnabled((!this.filmTitle2.getText().isEmpty()) && 
				                  (!this.filmDirector2.getText().isEmpty())&&
				                  (!this.filmCasts2.getText().isEmpty())&&
				                  (!this.year.getText().isEmpty())&&
				                  (!this.filmRating2.getText().isEmpty()));
	}
	
}
