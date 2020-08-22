package model;

public class Minimart {

	private Client entryOfPeople;
	private int numberOfPeople;

	public int getNumberOfPeople() {
		return numberOfPeople;
	}

	/**
	 * 
	 * @param numberOfPeople
	 */
	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}

	/**
	 * 
	 * @param numberOfPeople
	 */
	public Minimart(int numberOfPeople) {
		// TODO - implement Minimart.Minimart
		throw new UnsupportedOperationException();
	}

	public void addPerson() {
		// TODO - implement Minimart.addPerson
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param client
	 */
	public void addInfoPerson(Client client) {
		entryOfPeople.add(client);
		throw new UnsupportedOperationException();
	}

}
