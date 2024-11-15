public class EncapsulationSample {
    public static void main(String[] args) {

        Student student1 = new Student();
        
        student1.setStudent_Id(10805);
        student1.setName("Dexter");
        
        System.out.println("Student ID: " + student1.getStudent_Id());
        System.out.println("Name: " + student1.getName());
        
        Book book1 = new Book();
        
        book1.setBook_Number(9999);
        book1.setTitle("Java tups");
        book1.setAuthor("Dexter Manalo");
        book1.setPrice(199.99);
        
        System.out.println("\nBook Number: " + book1.getBook_Number());
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Price: $" + book1.getPrice());
    }
}