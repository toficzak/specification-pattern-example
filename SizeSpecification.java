class SizeSpecification implements Specification<House> {

    Size size;

    SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean satisfiedBy(House item) {
        return this.size == item.size;
    }

}