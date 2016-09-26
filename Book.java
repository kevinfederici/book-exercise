/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Kevin Federici)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int stringSize;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        stringSize = refNumber.length();
        courseText = bookCourseText;
    }

    // Add the methods here ...
    /*
     * exercise 2.83
     */
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    /*
     * exercise 2.85
     */
    public int getPages()
    {
        return pages;
    }
    
    /*
     * exercise 2.84
     */
    public void printAuthor()
    {
        System.out.println();
        System.out.println("author: ");
        System.out.print(author);
        System.out.println();
    }
    
    public void printTitle()
    {
        System.out.println();
        System.out.println("title: ");
        System.out.print(title);
        System.out.println();
    }
    
    /*
     * exercise2.87
     */
    public void printDetails()
    {
        printTitle();
        printAuthor();
        System.out.println();
        System.out.println("pages: ");
        System.out.print(pages);
        System.out.println();
        /*
         * exercise 2.89
         */
        if (stringSize > 0)
        {
        System.out.println();
        System.out.println("reference number: ");
        System.out.print(refNumber);
        System.out.println();
    }
        else
        {
        System.out.println();
        System.out.println("reference number: zzz");
        System.out.println();
    }
        System.out.println();
        System.out.print("this book has been borrowed ");
        System.out.print(borrowed);
        System.out.println("times");
        System.out.println();
    }
    
    /*
     * exercise 2.88 and 2.90
     */
    public void setRefNumber(String ref)
    {
        if (stringSize >= 3)
        {
        refNumber = ref;
    }
        else
        {
        System.out.println();
        System.out.println("error");
        System.out.println();
    }
}

    public String getRefNumber()
    {
        return refNumber;
    }
    
    /*
     * exercise 2.91
     */
    public void borrow(int borrowed)
    {
        borrowed = borrowed + 1;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    /*
     * exercise 2.92
     */
    public boolean isCourseText()
    {
        return courseText;
    }
}
