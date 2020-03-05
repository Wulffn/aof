/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraexercisesweek3solution;

/**
 *
 * @author mwn
 */
public class Main {

    public static void main(String[] args) {

        /*
        Lav en adresse klasse indeholdende passende attributter, get/set metoder og konstruktør
        Lav en bil klasse indeholdende passende attributter, get/set metoder og konstruktør
        Lav en hund klasse indeholdende passende attributter, get/set metoder og konstruktør
        
        Lav en personklasse indeholdende passende attributter, get/set metoder og konstruktør
        Personklassen skal derudover have muligheden for at have en adresse, en bil, en hund og en partner
        --Hint: Enhver klasse kan være en attribut i en anden klasse. En person klasse kan derfor indeholde en anden person som angiver en partner
                Personklassen kan også indeholde en hund, en bil eller adresse som attribut
        
        Lav nu instanser to personer i mainmetoden
        Tilføj instanser af bil, hund og adresse til personerne
        --Hint: Disse instanser skal også oprettes inden de kan tilføjes en person
        --Hint: Hvis personen ikke skal have en partner eller en hund, kan disse sættes til null i parameterlisten og kan derefter testes med en if sætning
        
        VALGFRIT
        I dette tilfælde holder vi det simpelt og tilføjer en bil til hver af personerne. 
        Hvis man har lyst må man gerne teste med if sætning om personen har en bil, der skal naturligvis også testes på om partneren har en bil
        Der skal derfor laves en if sætning der tester om personen har en partner. Hvis denne har en partner, skal der testes om partneren har en bil
        
        Lav nu en række System.out.println med en historie om en af personerne
        
        Historien kunne se således ud:
        
        Kurt Hansen er 54 år
        Kurt Hansen er ikke gift
        Kurt Hansen's adresse er Strandvejen 215 2900 Hellerup
        Kurt Hansen kører i en Ford Mondeo 2007
        Kurt Hansen har ingen hund
        Kurt Hansen har nu fået en hund
        Kurt Hansen har en Beagle på 4 år
         */
        
        Car car1 = new Car("Ford", "Mondeo", 2007);
        Car car2 = new Car("Seat", "Arona", 2016);
        Dog dog = new Dog("Beagle", "Fido", 4);
        Address address1 = new Address("Strandvejen 215", "2900 Hellerup");
        Address address2 = new Address("Øverødvej 246 B", "2800 Holte");
        Person p2 = new Person("Lena Larsen", 47, car2, null, address2, null);

        Person p1 = new Person("Kurt Hansen", 54, car1, null, address1, null);

        System.out.println(p1.getName() + " er " + p1.getAge() + " år");

        if (p1.getSpouse() != null) {
            System.out.println(p1.getName() + " er gift med " + p1.getSpouse().getName());
            System.out.println(p2.getName() + " kører i en " + p1.getSpouse().getCar());
        } else {
            System.out.println(p1.getName() + " er ikke gift");
        }

        System.out.println(p1.getName() + "'s adresse er " + p1.getAddress());
        System.out.println(p1.getName() + " kører i en " + p1.getCar());

        if (p1.getDog() != null) {
            System.out.println(p1.getName() + " har en " + p1.getDog().getBreed() + " på " + p1.getDog().getAge() + " år");
        } else {
            System.out.println(p1.getName() + " har ingen hund");
        }

        p1.setDog(dog);
        System.out.println(p1.getName() + " har nu fået en hund");
        System.out.println(p1.getName() + " har en " + p1.getDog().getBreed() + " på " + p1.getDog().getAge() + " år");

    }

}
