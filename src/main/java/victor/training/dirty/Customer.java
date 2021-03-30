package victor.training.dirty;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Customer {
	private String name;
	private List<Rental> rentals = new ArrayList<>();

	public List<Rental> getRentals() {
		return rentals;
	}


	public Customer(String name) {
		this.name = name;
	};

	public void addRental(Rental arg) {
		rentals.add(arg);
	}

	public String getName() {
		return name;
	}

	public String statement() {
		double totalPrice = 0;
		int frequentRenterPoints = 0;
		Iterator<Rental> rentals = this.rentals.iterator(); // TODO move down
		String result = "Rental Record for " + getName() + "\n";
		while (rentals.hasNext()) {
			Rental rental = rentals.next();
			// methodTakingAMovie();

			double price = 0;
			switch (rental.getMovie().getPriceCode()) {
			case Movie.CATEGORY_REGULAR:
				price += 2;
				if (rental.getDaysRented() > 2)
					price += (rental.getDaysRented() - 2) * 1.5;
				break;
			case Movie.CATEGORY_NEW_RELEASE:
				price += rental.getDaysRented() * 3;
				break;
			case Movie.CATEGORY_CHILDRENS:
				price += 1.5;
				if (rental.getDaysRented() > 3)
					price += (rental.getDaysRented() - 3) * 1.5;
				break;
			}
			// add frequent renter points
			frequentRenterPoints++;
			// add bonus for a two day new release rental
			if ((rental.getMovie().getPriceCode() == Movie.CATEGORY_NEW_RELEASE)
					&& rental.getDaysRented() > 1)
				frequentRenterPoints++;
			// show figures for this rental
			result += "\t" + rental.getMovie().getTitle() + "\t"
					+ price + "\n";
			totalPrice += price;
		}
		// add footer lines
		result += "Amount owed is " + String.valueOf(totalPrice) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints)
				+ " frequent renter points";
		return result;
	}
	public void methodTakingAMovie(Movie movie) {
	    
	}
}