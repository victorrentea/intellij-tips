package victor.training.dirty;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Customer {
	private String name;
	private List rentals = new ArrayList();

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
		Iterator rentals = this.rentals.iterator();
		String result = "Rental Record for " + name + "\n";
		while (rentals.hasNext()) {
			Rental rental = (Rental) rentals.next();

			double price = 0;
			switch (rental.getMovie().getPriceCode()) {
			case Movie.CATEGORY_REGULAR:
				price = 2;
				if (rental.getDaysRented() > 2)
					price += (rental.getDaysRented() - 2) * 1.5;
				break;
			case Movie.CATEGORY_NEW_RELEASE:
				price = rental.getDaysRented() * 3;
				break;
			case Movie.CATEGORY_CHILDRENS:
				price = 1.5;
				if (rental.getDaysRented() > 3)
					price += (rental.getDaysRented() - 3) * 1.5;
				break;
			}
			result += "\t" + rental.getMovie().getTitle() + "\t" + price + "\n";
			totalPrice += price;
		}
		result += "Amount owed is " + String.valueOf(totalPrice) + "\n";
		return result;
	}
	public void methodTakingAMovie(Movie movie) {

	}
}