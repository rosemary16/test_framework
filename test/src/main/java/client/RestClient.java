package client;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.EncoderConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.filter.log.LogDetail;
import io.restassured.response.Response;

import java.util.Map;

import static io.restassured.RestAssured.given;


public abstract class RestClient<Impl extends RestClient<Impl>> {
    protected Configuration configuration = defaultConfiguration();

    protected abstract Configuration defaultConfiguration();

    public RestClient() {
        init();
    }

    private void init(){
        RestAssured.config = RestAssuredConfig
                .config()
                .encoderConfig(new EncoderConfig().appendDefaultContentCharsetToContentTypeIfUndefined(false));

        RestAssured.baseURI = configuration.getServicePath();
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setContentType(configuration.getContentType())
                .log(LogDetail.ALL)
                .build();
    }

    private void logResponse(Response response) {
        response.then().log().all();
    }

    public <F>ResponseWrapper<F> get(String path, Class<F> responseClass){
        Response response = given().get(path);
        logResponse(response);
        return new ResponseWrapper<>(response, responseClass);
    }

    public <F>ResponseWrapper<F>  get(String path, Map<String, String> queryParams, Class<F> responseClass){
        Response response = given().queryParams(queryParams).get(path);
        logResponse(response);
        return new ResponseWrapper<>(response, responseClass);
    }

    public <T, F>ResponseWrapper<F> post(String path, T payload, Class<F> responseClass){
        Response response = given().body(payload).post(path);
        logResponse(response);
        return new ResponseWrapper<>(response, responseClass);
    }

    public <T, F>ResponseWrapper<F> patch(String path, T payload, Class<F> responseClass){
        Response response = given().body(payload).patch(path);
        logResponse(response);
        return new ResponseWrapper<>(response, responseClass);
    }

    public <T, F>ResponseWrapper<F> put(String path, T payload, Class<F> responseClass){
        Response response = given().body(payload).put(path);
        logResponse(response);
        return new ResponseWrapper<>(response, responseClass);
    }

    public <F>ResponseWrapper<F> delete(String path, Class<F> responseClass){
        Response response = given().delete(path);
        logResponse(response);
        return new ResponseWrapper<>(response, responseClass);
    }
}
