package matchers;

import org.testng.asserts.SoftAssert;

import java.util.function.Function;

public abstract class AbstractObjectEqualsMatcher<T> {
    public T actual;
    public T expected;
    public SoftAssert softAssert = new SoftAssert();

    protected AbstractObjectEqualsMatcher(T actual, T expected) {
        this.actual = actual;
        this.expected = expected;
        addDefaultConditions();
    }

    public abstract void addDefaultConditions();

    public <R> void add(Function<T, R> function, String field) {
        softAssert.assertEquals(function.apply(actual), function.apply(expected), field);
    }

    public void match() {
        softAssert.assertAll();
    }
}