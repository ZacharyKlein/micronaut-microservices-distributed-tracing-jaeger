//tag::packageandimports[]
package example.micronaut.bookrecommendation;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Flowable;
//end::packageandimports[]

//tag::harcoded[]
@Client(id="bookcatalogue") // <1>
//end::harcoded[]
//tag::clazz[]
public interface BookCatalogueClient extends BookCatalogueOperations {

    @Get("/books")
    Flowable<Book> findAll();
}
//end::clazz[]
