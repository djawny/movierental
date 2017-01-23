package pl.sda;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();

        Customer customer = new Customer("Adam", "Kowalski", 1980, 123);
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Terminator"));
        movies.add(new Movie("Matrix"));
        movies.add(new Movie("Forrest Gump"));
        Rental rental = new Rental(customer, new Date(), new Date(), movies);

//        System.out.println(customer);
//        System.out.println(rental);
//        String jsonString = "{\"customer\":{\"firstName\":\"Adam\",\"lastName\":\"Kowalski\",\"birthYear\":1980,\"idNumber\":123},\"startDate\":\"Jan 23, 2017 8:34:36 PM\",\"endDate\":\"Jan 23, 2017 8:34:36 PM\",\"movies\":[{\"title\":\"Terminator\"},{\"title\":\"Matrix\"},{\"title\":\"Forrest Gump\"}]}";
//        Rental rental1 = gson.fromJson(jsonString, Rental.class);
//        System.out.println(rental1);

        String json = gson.toJson(rental);
        System.out.println(json);

//        FileWriter fileWriter = new FileWriter("rental.json");
//        gson.toJson(rental, fileWriter);
//        fileWriter.flush();
//        fileWriter.close();
        Rental rental1 = gson.fromJson(new FileReader("rental.json"), Rental.class);
        System.out.println(rental);

    }
}
