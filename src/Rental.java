class Rental {
    private Movie movie;
    private int daysRented;
    public Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRented = newdaysRented;
    }
    public int getDaysRented() {
        return daysRented;
    }
    public Movie getMovie() {
        return movie;
    }
	double amountFor() {
		 return movie.price.amountFor(movie, daysRented);
		 }
	int getFrequentRenterPoints() {
		 return movie.getFrequentRenterPoints(daysRented);
		 }

}