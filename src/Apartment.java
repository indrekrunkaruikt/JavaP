public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    public boolean larger(Apartment otherApartment){
        if(this.squareMeters > otherApartment.squareMeters){
            return true;
        }else{
            return false;
        }
    }
    public int priceDifference(Apartment otherApartment){
        Integer apartmentPrice = squareMeters * pricePerSquareMeter;
        Integer otherAparmentPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        Integer differenceBetweenTheApartments = apartmentPrice - otherAparmentPrice;
        return differenceBetweenTheApartments;
    }
    public boolean moreExpensiveThan(Apartment otherApartment){
        Integer apartmentPrice = squareMeters * pricePerSquareMeter;
        Integer otherAparmentPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        Integer differenceBetweenTheApartments = apartmentPrice - otherAparmentPrice;
        if(differenceBetweenTheApartments <= 0){
            return false;
        }else {
            return true;
        }
    }
}