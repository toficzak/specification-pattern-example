class House {
    Color color;
    Size size;

    House(final Color color, final Size size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "House: " + color.name() + ", " + size.name();
    }
}