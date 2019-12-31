import java.util.Collection;
import java.util.stream.Stream;

class HouseFilter implements Filter<House> {

    @Override
    public Stream<House> filter(final Collection<House> items, final Specification<House> s) {
        return items.stream().filter(s::satisfiedBy);
    }

}