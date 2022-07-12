class ParkingSystem {
    private int[] spot = new int[3];

    public ParkingSystem(int big, int medium, int small) {
        spot[0] = big;
        spot[1] = medium;
        spot[2] = small;
    }

    public boolean addCar(int carType) {
        if(spot[carType-1]>0){
            spot[carType-1] = spot[carType-1]-1;
            return true;
        }
        return false;
    }
}
/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
