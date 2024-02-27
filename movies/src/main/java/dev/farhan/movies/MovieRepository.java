package dev.farhan.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    //create method for getmovies by imdb ID data deom db
    Optional<Movie> findMovieByImdbId(String imdbId);

}
