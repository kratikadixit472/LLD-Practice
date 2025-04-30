package SOLIDPrinciples;

// This means every class should have only one reason to change it

public class SingleResponsibilityPrinciple {
    
}

class Book {
    String name;
    String authorName;

    public Book(String name, String authorName) {
        this.name = name;
        this.authorName = authorName;
    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    // This is not handling Single responsibility principle
    // public String getInvoice() {
    //     return "Invoice";
    // }
}

class Invoice {
    public String getInvoice() {
        return "Invoice";
    }
}