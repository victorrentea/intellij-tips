package victor.training.dirty;
class Rental {
	private final Movie movie;
	private final int daysRented;

	public Rental(Movie movie, int daysRented) {
		this.movie = movie;
		this.daysRented = daysRented;
	}

	public int getDaysRented() {
		return daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

	public double computePrice() {
		double price = 0;
		switch (getMovie().getPriceCode()) {
		case Movie.CATEGORY_REGULAR:
			price = 2;
			if (getDaysRented() > 2)
				price += (getDaysRented() - 2) * 1.5;
			break;
		case Movie.CATEGORY_NEW_RELEASE:
			price = getDaysRented() * 3;
			break;
		case Movie.CATEGORY_CHILDRENS:
			price = 1.5;
			if (getDaysRented() > 3)
				price += (getDaysRented() - 3) * 1.5;
			break;
		}
		return price;
	}
}