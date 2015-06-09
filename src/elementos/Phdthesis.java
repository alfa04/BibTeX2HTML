package elementos;

public class Phdthesis extends Entry {
	private String author, title, school, year, type, address, month, note, key;
	
	public Phdthesis() {
		super();
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void setSchool(String school) {
		this.school = school;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public void setType(String type) {
		this.type = type;
	}


	public void setAddress(String address) {
		this.address = address;
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
	
	public boolean isValid() {
		if (author != null && title != null && school != null && year != null) return true;
		else return false;
	}
	
	@Override
	public String printContents() {
		String contents = "";
		
		if (key != null) contents += "[" + key + "]";
		else contents += "[" + author.substring(0, 3) + year.substring(2, 4) + "]";
		
		contents += " " + author + ".";
		contents += " <i>" + title + "</i>.";
		contents += " PhD thesis,";
		contents += " " + school + ",";
		if (address != null) contents += " " + address + ",";
		if (month != null) contents += " " + month;
		contents += " " + year + ".";
		if (note != null) contents += " " + note + ".";
		
		return contents;
	}
}
