package assignment3;

import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * This class stores the information of the 
 * film search application.
 * 
 * @author Nick He
 *
 */
public class FilmSearchApplication extends JFrame {

	private FilmDatabase model;          
	private FilmSearchPanel view;        

	/**
	 * This method defines how to handle the 
	 * list selection event.
	 */
	private void eventHandleListSelection() {
		this.view.getRemoveButton().setEnabled(true);
		if(this.view.getFilmList().getSelectedIndex() != -1)
		{
			this.view.getOutcome()
			.setText(this.model.getFilms().get(this.view.getFilmList().getSelectedIndex()).toString());
		}
		
	}
	
	/**
	 * This method defines how to handle the 
	 * key released event.
	 * 
	 * @param e
	 */
	private void eventHandleKeyReleased(KeyEvent e)
	{
		this.view.getAddButton().setEnabled((!this.view.getFilmTitle2().getText().isEmpty()) && 
                (!this.view.getFilmDirector2().getText().isEmpty())&&
                (!this.view.getFilmCasts2().getText().isEmpty())&&
                (!this.view.getYear().getText().isEmpty())&&
                (!this.view.getFilmRating2().getText().isEmpty()));
	}
	
	/**
	 * This method defines how to handle the 
	 * add button event.
	 */
	private void eventHandleAddButton()
	{
		String title = this.view.getFilmTitle2().getText();
		String director = this.view.getFilmDirector2().getText();
		String casts = this.view.getFilmCasts2().getText();
		int year = Integer.parseInt(this.view.getYear().getText());
		double rating = Double.parseDouble(this.view.getFilmRating2().getText());
		Genre genre = Genre.valueOf(this.view.getGenreBox2().getSelectedItem().toString().toUpperCase());
		this.model.add(new Film(title, director, rating, year, casts, genre));
		this.view.update();
	}

	/**
	 * This method defines how to handle the 
	 * remove button event.
	 */
	private void eventHandleRemoveButton() {
		int index = this.view.getFilmList().getSelectedIndex();
		if (index != -1) {
			this.model.remove(this.model.getFilms().get(index));
		}
		this.view.update();
	}

	/**
	 * This method defines how to handle the 
	 * window opened event.
	 */
	private void eventHandleWindowOpened() {
		this.model.setFilms(FilmDataTextIO.input("data.txt"));
		this.view.update();
	}

	/**
	 * This method defines how to handle the 
	 * window closed event.
	 */
	private void eventHandleWindowClosed() {
		FilmDataTextIO.output(this.model.getFilms(), "data.txt");
	}

	/**
	 * This method defines how to handle the 
	 * search button event.
	 */
	private void eventHandleSearchButton() {
		FilmDatabase results = null;
		if (!this.view.getFilmTitle().getText().isEmpty()) {
			results = this.model.getSearchEngine().byTitle(this.view.getFilmTitle().getText());
		}

		if (!this.view.getFilmDirector().getText().isEmpty()) {
			if (results == null) {
				results = this.model.getSearchEngine().byDirector(this.view.getFilmDirector().getText());
			} else {
				results = results.getSearchEngine().byDirector(this.view.getFilmDirector().getText());
			}
		}

		if ((!this.view.getStartYear().getText().isEmpty()) && (!this.view.getEndYear().getText().isEmpty())) {
			if (results == null) {
				results = this.model.getSearchEngine().releaseBetween(
						Integer.parseInt(this.view.getStartYear().getText()),
						Integer.parseInt(this.view.getEndYear().getText()));
			} else {
				results = results.getSearchEngine().releaseBetween(Integer.parseInt(this.view.getStartYear().getText()),
						Integer.parseInt(this.view.getEndYear().getText()));
			}
		}

		if (this.view.getFilmRating().getSelectedIndex() != -1) {
			if (results == null) {
				results = this.model.getSearchEngine().byRating(this.view.getFilmRating().getSelectedIndex() + 1);
			} else {
				results = results.getSearchEngine().byRating(this.view.getFilmRating().getSelectedIndex() + 1);
			}
		}

		if (!this.view.getFilmCasts().getText().isEmpty()) {
			if (results == null) {
				results = this.model.getSearchEngine().byCasts(this.view.getFilmCasts().getText());
			} else {
				results = results.getSearchEngine().byCasts(this.view.getFilmCasts().getText());
			}
		}

		if (this.view.getGenreBox().getSelectedIndex() != 0) {
			if (results == null) {
				results = this.model.getSearchEngine()
						.byGenre(Genre.valueOf(this.view.getGenreBox().getSelectedItem().toString()));
			} else {
				results = results.getSearchEngine()
						.byGenre(Genre.valueOf(this.view.getGenreBox().getSelectedItem().toString().toUpperCase()));
			}
		}

		this.view.getOutcome().setText(results.toString());

	}

	/**
	 * This constructor populates the new database
	 * as model and a new search engine as view 
	 * and add the event handler to JComponets. 
	 * 
	 * @param name
	 */
	public FilmSearchApplication(String name) {
		super(name);

		this.model = new FilmDatabase();
		this.view = new FilmSearchPanel(this.model);

		this.view.getFilmList().addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				eventHandleListSelection();
			}
		});
		
		this.view.getFilmTitle2().addKeyListener(new KeyAdapter(){
			public void keyReleased(KeyEvent e)
			{
				eventHandleKeyReleased(e);
			}
		});
		
		this.view.getFilmDirector2().addKeyListener(new KeyAdapter(){
			public void keyReleased(KeyEvent e)
			{
				eventHandleKeyReleased(e);
			}
		});
		
		this.view.getFilmCasts2().addKeyListener(new KeyAdapter(){
			public void keyReleased(KeyEvent e)
			{
				eventHandleKeyReleased(e);
			}
		});
		
		this.view.getYear().addKeyListener(new KeyAdapter(){
			public void keyReleased(KeyEvent e)
			{
				eventHandleKeyReleased(e);
			}
		});
		
		this.view.getFilmRating2().addKeyListener(new KeyAdapter(){
			public void keyReleased(KeyEvent e)
			{
				eventHandleKeyReleased(e);
			}
		});

		this.view.getRemoveButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eventHandleRemoveButton();
			}
		});

		this.view.getSearchButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eventHandleSearchButton();
			}
		});
		
		this.view.getAddButton().addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				try{
					eventHandleAddButton();
				}
				catch(NumberFormatException numberFormatException)
				{
					view.getOutcome().setText("Invalid operation: Wrong number format!");
				}
			}
		});

		this.addWindowListener(new WindowAdapter() {
			public void windowOpened(WindowEvent e) {
				eventHandleWindowOpened();
			}

			public void windowClosed(WindowEvent e) {
				eventHandleWindowClosed();
			}
		});

		this.getContentPane().add(this.view);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(600, 640);
	}

	/**
	 * The main method initialize the JFrame.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new FilmSearchApplication("");
		frame.setVisible(true);

	}

}
