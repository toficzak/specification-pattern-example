import java.util.Collection;
import java.util.stream.Stream;

interface Filter<T> {

    Stream<House> filter(Collection<T> items, Specification<T> s);
}