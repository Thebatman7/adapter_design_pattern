import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        Contact daniel = new Contact("Daniel", "Lacambra", "80000000", "daniel@gmail.com");
        Contact kevin = new Contact("Kevin", "Pardo", "80000001", "kevin@gmail.com");
        Contact leonidas = new Contact("Paul", "Pardo", "80000002", "leonidas@gmail.com");
        Contact nazaret = new Contact("Nazaret", "Abellan", "80000003", "nazaret@gmail.com");
        Contact parker = new Contact("Parker", "Oberg", "80000004", "parker@gmail.com");

        ContactManager contactManager = new ContactManager();
        contactManager.addContact(daniel);
        contactManager.addContact(kevin);
        contactManager.addContact(leonidas);
        contactManager.addContact(nazaret);
        contactManager.addContact(parker);

        Adapter adapter = new Adapter(contactManager);
        OutputStreamWriter outputStream = new OutputStreamWriter(System.out);
        Table table = new Table(outputStream, adapter);

        table.display();
        outputStream.flush();
    }
}
