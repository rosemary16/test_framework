package client;

import io.restassured.response.Response;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ResponseWrapper<T> {
    private final Response response;
    private final Class<T> responseClass;

    ResponseWrapper(Response response, Class<T> responseClass) {
        this.response = response;
        this.responseClass = responseClass;
    }

    public Response getResponse() {
        return response;
    }

    public T readEntity() {
        return response.getBody().as(responseClass);
    }

    public List<T> readEntities() {
        return response.getBody().jsonPath().getList("content", responseClass);
    }

    public ResponseWrapper<T> expectedStatusCode(int statusCode) {
        assertThat("Response status code does not match", response.getStatusCode(), is(statusCode));
        return this;
    }

    public ResponseWrapper<T> expectedContentType(String contentType) {
        assertThat("Content type does not match", response.getContentType(), is(contentType));
        return this;
    }
}
