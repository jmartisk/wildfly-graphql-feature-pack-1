package org.wildfly.extras.quickstart.microprofile.graphql;

import java.util.List;
import io.smallrye.graphql.client.typesafe.api.GraphQLClientApi;

@GraphQLClientApi
interface FilmClientApi {
    List<Film> allFilms();
}
