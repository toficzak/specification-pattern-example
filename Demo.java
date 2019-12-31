import java.util.List;

class Demo {
    public static void main(String[] args) {
        House h1 = new House(Color.RED, Size.LARGE);
        House h2 = new House(Color.BLUE, Size.MEDIUM);
        House h3 = new House(Color.GREEN, Size.SMALL);
        House h4 = new House(Color.RED, Size.SMALL);

        HouseFilter hf = new HouseFilter();
        List<House> houses = List.of(h1, h2, h3, h4);
        hf.filter(houses, new SizeSpecification(Size.MEDIUM)).forEach(System.out::println);
        System.out.println("---");
        hf.filter(houses, new SizeSpecification(Size.SMALL)).forEach(System.out::println);
        System.out.println("---");
        hf.filter(houses, new ColorSpecification(Color.RED)).forEach(System.out::println);
        System.out.println("---");
        hf.filter(houses, new ColorSpecification(Color.GREEN)).forEach(System.out::println);
    }
}