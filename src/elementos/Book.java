package elementos;

public class Book extends Entry {
	String author, editor, title, publisher, year, volume, number, series, address, edition, month, note, crossref;

	public Book() {
		super();
	}

	public boolean addattribute(String attr, String value) {
		boolean aRetornar = false;
		switch(attr) {
		case "author":
			setAuthor(value);
			aRetornar = true;
			break;
		case "editor":
			setEditor(value);
			aRetornar = true;
			break;
		case "title":
			setTitle(value);
			aRetornar = true;
			break;
		case "publisher":
			setPublisher(value);
			aRetornar = true;
			break;
		case "year":
			setYear(value);
			aRetornar = true;
			break;
		case "volume":
			setVolume(value);
			aRetornar = true;
			break;
		case "number":
			setNumber(value);
			aRetornar = true;
			break;
		case "series":
			setSeries(value);
			aRetornar = true;
			break;
		case "address":
			setAddress(value);
			aRetornar = true;
			break;
		case "edition":
			setEdition(value);
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

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String isValid() {
		String aRetornar = "";
		if (author == null && editor == null) aRetornar +="author|editor-";
		if (title == null) aRetornar +="title-";
		if(publisher == null) aRetornar +="publisher-";
		if(year == null) aRetornar +="year-";
		if (aRetornar == "") return "";
		else return aRetornar.substring(0, aRetornar.length()-1);
	}

	@Override
	public String[] printContents() {
		String[] contents = new String[3];
		contents[0] = "";
		contents[1] = "";
		contents[2] = "";

		if (key != null) contents[0] += "[" + key.substring(1, key.length()-1) + "]";
		else if (author != null && year != null) contents[0] += "[" + author.substring(1, 3) + year.substring(2, 4) + "]";
		else if (editor != null && year != null) contents[0] += "[" + editor.substring(1, 3) + year.substring(2, 4) + "]";
		else contents[0] += "[book]";
		contents[2] = contents[0];
		if (author != null) contents[0] += " " + author.substring(1, author.length()-1) + ".";
		if (editor != null) contents[0] += " " + editor.substring(1, editor.length()-1) + ".";
		contents[0] += " <i>" + title.substring(1, title.length()-1) + "</i>,";
		if (volume != null && number != null)contents[0] += " volume " + volume.substring(1, volume.length()-1) + " of " + number.substring(1, number.length()-1) + ".";
		contents[0] += " " +  publisher.substring(1, publisher.length()-1) + ",";
		if (address != null) contents[0] += " " + address.substring(1, address.length()-1) + " ";
		if (edition != null) contents[0] += " " + edition.substring(1, edition.length()-1) + " edition,";
		if (month != null) contents[0] += " " + month.substring(1, month.length()-1);
		contents[0] += " " + year.substring(1, year.length()-1) + ".";
		if (note != null) contents[0] += " " + note.substring(1, note.length()-1) + ".";

		contents[1] = this.crossref;
		return contents;
	}
}
