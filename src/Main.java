import model.Auto;

public class Main {
    public static void main(String[] args) {
        //utworzenie obiektu klasy
        //       Auto a1 = new Auto();
        //odwolanie do pól klasowych --->obiekt.pole
        //   System.out.println("Brand: " + a1.brand);
        //   System.out.println("Model: " + a1.model);
        //    System.out.println("Year: " + a1.year);
        //   System.out.println("Color: " + a1.color);
        //   System.out.println("Fuel: " + a1.fuel_type);
        //  System.out.println("Price: " + a1.price);
        //   System.out.println("Segment:" + a1.segment);
        //zmiana pól klasowych
        //       a1.brand = "BMW";
        //       a1.model = "X5";
        //       a1.year = 2010;
        //       a1.color = "Black";
        //       a1.fuel_type = "Diesel";
        //       a1.price = 80_000;
        //       a1.segment = 'S';
        //    System.out.println("Brand: " + a1.brand);
        //    System.out.println("Model: " + a1.model);
        //    System.out.println("Year: " + a1.year);
        //    System.out.println("Color: " + a1.color);
        //    System.out.println("Fuel: " + a1.fuel_type);
        //     System.out.println("Price: " + a1.price);
        //    System.out.println("Segment:" + a1.segment);

        //      System.out.println(a1);

//utworzenie drugiego obiektu
//        Auto a2 = new Auto();
//        System.out.println(a2);
//        a2.setPrice(100_000);
//        System.out.println(a2);
//        System.out.println(a2.getPrice());
//        System.out.println(a2.getPrice());
//        System.out.println(a2.getPriceWithTax(23));

        Auto a3 = new Auto(
                "VW",
                "Passat",
                2019,
                "silver",
                "disel",
                150_000,
                'D');
        System.out.println(a3);
    }
}
