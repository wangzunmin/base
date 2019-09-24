package ifelse.no;

public class MyPaper {
	private PaperColor paperColor;

	public MyPaper(PaperColor paperColor) {
		super();
		this.paperColor = paperColor;
	}

	public PaperColor getPaperColor() {
		return this.paperColor;
	}

	public void choicePen() {
		this.paperColor.getPenColor();
	}
}
