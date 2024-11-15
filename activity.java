public class activity {

    
    public static void main(String[] args) {

        Dog asos = new Dog();
        asos.setNumberPuppies(5);

        Dog aso1 = new Dog();
        aso1.setName( "Sili");
        aso1.isMale = true;

        Dog aso2 = new Dog();
        aso2.setName( "Patis");
        aso2.isMale = true;

        Dog aso3 = new Dog();
        aso3.setName( "Mangga");
        aso3.isMale = true;

        Dog aso4 = new Dog();
        aso4.setName( "Matamis");
        aso4.isMale = true;

        Dog aso5 = new Dog();
        aso5.setName( "Saging");
        aso5.isMale = true;

        asos.addPuppies(aso1);
        asos.addPuppies(aso2);
        asos.addPuppies(aso3);
        asos.addPuppies(aso4);
        asos.addPuppies(aso5);

        aso1.showName();
        aso2.showName();
        aso3.showName();
        aso4.showName();
        aso5.showName();

        aso1.bark();
        aso2.bark();
        aso3.bark();
        aso4.bark();
        aso5.bark();

        asos.showNumberPuppies();
        asos.AllPuppies();

    }
}
