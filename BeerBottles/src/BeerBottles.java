public class BeerBottles {
    public static void main(String[] args){
        int beerBottles;

        for (beerBottles = 99; beerBottles > 1; beerBottles--){
            System.out.println(beerBottles + " bottles of beer on the wall, " + beerBottles + " bottles of beer, take one down, pass it around, " + beerBottles + " bottles of beer on the wall!");

            }
        if (beerBottles == 1){
            System.out.println(beerBottles + " bottle of beer on the wall, " + beerBottles + " bottle of beer, take it down, pass it around, no more bottles of beer on the wall!");
        }

    }
}
