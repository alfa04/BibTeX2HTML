package elementos;

public class Unpublished extends Entry {
	private String crossref, author, title, note, month, year, key;
	
	public Unpublished(){
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
		case "note":
			setNote(value);
			aRetornar = true;
			break;
		case "month":
			setMonth(value);
			aRetornar = true;
			break;
		case "year":
			setYear(value);
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

	public String isValid() {
		String aRetornar = "";
		if (author == null) aRetornar +="author-";
		if (title == null) aRetornar +="title-";
		if (note == null) aRetornar +="note-";
		if (aRetornar == "") return "";
		else return aRetornar.substring(0, aRetornar.length()-1);
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	@Override
	public String printContents() {
		String contents = "";
		
		if (key != null) contents += "[" + key.substring(1, key.length()-1) + "]";
		else if (year != null) contents += "[" + author.substring(1, 3) + year.substring(2, 4) + "]";
		else contents += "[unpublished]";
		
		contents += " " + author.substring(1, author.length()-1) + ".";
		contents += " " + title.substring(1, title.length()-1) + ".";
		contents += " " + note.substring(1, note.length()-1) + ",";
		if (month != null) contents += " " + month.substring(1, month.length()-1);
		if (year != null) contents += " " + year.substring(1, year.length()-1) + ".";
		
		return contents;
	}
}
