class ColorSpecification implements Specification<House> {

    Color color;

    ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean satisfiedBy(final House item) {
        return this.color == item.color;
    }
}