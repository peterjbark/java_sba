package JavaSE;

public class MyOwnAutoShop {
    public static void main(String[] args){
        Sedan bmwm3 = new Sedan (120, 70000, "Le Mans Blue", 21);
        Ford f150 = new Ford (70, 40000, "Dune Pearl", 2022, 1000);
        Ford gt350 = new Ford (120, 50000, "Nardo Grey", 2020, 500);
        Car camry = new Car (40, 20000, "Plain White");

        System.out.println("This BMW M3 specced in this rare " + bmwm3.color + " can be yours for " + bmwm3.regularPrice);   
        System.out.println("This F150 in this gorgeous " + f150.color + " can be yours for " + f150.regularPrice);   
        System.out.println("This sporty limited " + gt350.color + " GT350 can easily reach speeds of " + gt350.speed);   
        System.out.println("If you just need to get from point A to point B, this Camry can be yours for an outstanding price of " + camry.regularPrice);   

     }
}
