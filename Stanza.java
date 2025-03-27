class Stanza {
    String content;
    String theme;
    int lines;
    String rhymeScheme;
    String language;
    boolean isPublished;
    String author;
    int yearWritten;
    String style;
    String title;

    public Stanza() {
        System.out.println("Default Constructor");
    }

    public Stanza(String content) {
        this.content = content;
        System.out.println("Constructor 1 String");
    }

    public Stanza(String content, String theme) {
        this(content);
        this.theme = theme;
        System.out.println("Constructor 2 String, String");
    }

    public Stanza(String content, String theme, int lines) {
        this(content, theme);
        this.lines = lines;
        System.out.println("Constructor 3 String, String, int");
    }

    public Stanza(String content, String theme, int lines, String rhymeScheme) {
        this(content, theme, lines);
        this.rhymeScheme = rhymeScheme;
        System.out.println("Constructor 4 String, String, int, String");
    }

    public Stanza(String content, String theme, int lines, String rhymeScheme, String language) {
        this(content, theme, lines, rhymeScheme);
        this.language = language;
        System.out.println("Constructor 5 String, String, int, String, String");
    }

    public Stanza(String content, String theme, int lines, String rhymeScheme, String language, boolean isPublished) {
        this(content, theme, lines, rhymeScheme, language);
        this.isPublished = isPublished;
        System.out.println("Constructor 6 String, String, int, String, String, boolean");
    }

    public Stanza(String content, String theme, int lines, String rhymeScheme, String language, boolean isPublished, String author) {
        this(content, theme, lines, rhymeScheme, language, isPublished);
        this.author = author;
        System.out.println("Constructor 7 String, String, int, String, String, boolean, String");
    }

    public Stanza(String content, String theme, int lines, String rhymeScheme, String language, boolean isPublished, String author, int yearWritten) {
        this(content, theme, lines, rhymeScheme, language, isPublished, author);
        this.yearWritten = yearWritten;
        System.out.println("Constructor 8 String, String, int, String, String, boolean, String, int");
    }

    public Stanza(String content, String theme, int lines, String rhymeScheme, String language, boolean isPublished, String author, int yearWritten, String style, String title) {
        this(content, theme, lines, rhymeScheme, language, isPublished, author, yearWritten);
        this.style = style;
        this.title = title;
        System.out.println("Constructor 9 String, String, int, String, String, boolean, String, int, String, String");
    }

    public void info() {
        System.out.println("Stanza Details:");
        System.out.println("Title: " + this.title);
        System.out.println("Content: " + this.content);
        System.out.println("Theme: " + this.theme);
        System.out.println("Lines: " + this.lines);
        System.out.println("Rhyme Scheme: " + this.rhymeScheme);
        System.out.println("Language: " + this.language);
        System.out.println("Published: " + (this.isPublished ? "Yes" : "No"));
        System.out.println("Author: " + this.author);
        System.out.println("Year Written: " + this.yearWritten);
        System.out.println("Style: " + this.style);
    }
}