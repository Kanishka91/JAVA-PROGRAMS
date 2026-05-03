class delivery {
    public static void main(String[] args) {

        
        String[] parcels = {"TRK101", "TRK102", "TRK103", "TRK104"};

    
        parcels[2] = "TRK999";

        
        System.out.println("Parcel Tracking Numbers:");
        for (int i = 0; i < parcels.length; i++) {
            System.out.println(parcels[i]);
        }
    }
}