
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }


    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
@Override
    public boolean equals(Object compared){
        if (this == compared){
            return true;
        }
        if (!(compared instanceof Book)){
            return false;
        }
        if(this.name.equals(((Book) compared).name) && this.publicationYear == ((Book) compared).publicationYear){
            return true;
        }
        else {
            return false;
        }
    }

}
