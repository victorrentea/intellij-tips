package victor.training.dirty;
public class Movie {
	public static final int CATEGORY_CHILDRENS = 2;
	public static final int CATEGORY_REGULAR = 0;
	public static final int CATEGORY_NEW_RELEASE = 1;
	private String _title;
	private int _priceCode;

	public Movie(String title, int priceCode) {
		_title = title;
		_priceCode = priceCode;
	}

	public int getPriceCode() {
		return _priceCode;
	}

	public void setPriceCode(int arg) {
		_priceCode = arg;
	}

	public String getTitle() {
		return _title;
	};
}