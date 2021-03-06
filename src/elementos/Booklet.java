package elementos;

public class Booklet extends Entry {
	private String title, author, howpublished, address, month, year, note, crossref;
	
	public Booklet(){
		super();
	}
	
	public boolean addattribute(String attr, String value) {
		boolean aRetornar = false;
		switch(attr) {
		case "author":
			setAuthor(value);
			aRetornar = true;
			break;
		case "title":
			setTitle(value);
			aRetornar = true;
			break;
		case "howpublished":
			setHowpublished(value);
			aRetornar = true;
			break;
		case "year":
			setYear(value);
			aRetornar = true;
			break;
		case "address":
			setAddress(value);
			aRetornar = true;
			break;
		case "month":
			setMonth(value);
			aRetornar = true;
			break;
		case "note":
			setNote(value);
			aRetornar = true;
			break;
		case "key":
			setKey(value);
			aRetornar = true;
			break;
		case "crossref":
			setCrossRef(value);
			aRetornar = true;
			break;
		default: break;
		}
		return aRetornar;
	}

	private void setCrossRef(String value) {
		this.crossref = value;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}

	public void setHowpublished(String howpublished) {
		this.howpublished = howpublished;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	public String isValid() {
		String aRetornar = "";
		if (title == null) aRetornar = "title-";
		if (aRetornar == "") return "";
		else return aRetornar.substring(0, aRetornar.length()-1);
	}
	
	@Override
	public String[] printContents() {
		String[] contents = new String[3];
		contents[0] = "";
		contents[1] = "";
		contents[2] = "";
		if (key != null) contents[0] += "[" + key.substring(1,key.length()-1) + "]";
		else if (author != null && year != null) contents[0] += "[" + author.substring(1, 3) + year.substring(2, 4) + "]";
		else contents[0] += "[booklet]";
		contents[2] = contents[0];
		if (author != null) contents[0] += " " + author.substring(1,author.length()-1) + ".";
		contents[0] += " " + title.substring(1,title.length()-1) + ".";
		if (howpublished != null) contents[0] += " " + howpublished.substring(1,howpublished.length()-1) + ",";
		if (address != null) contents[0] += " " + address.substring(1,address.length()-1) + ",";
		if (month != null) contents[0] += " " + month.substring(1,month.length()-1);
		if (year != null) contents[0] += " " + year.substring(1,year.length()-1) + ".";
		if (note != null) contents[0] += " " + note.substring(1,note.length()-1) + ".";

		contents[1] = this.crossref;
		return contents;
	}
}
