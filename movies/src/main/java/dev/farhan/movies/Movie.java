package dev.farhan.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collation = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Movie {

    @Id
    private ObjectId id;
    private String imdbId;
    private  String title;
    private String releseDate;
    private String trailerLink;
    private String poster;
    private List<String> generes;
    private List<String> backdrops;
}
