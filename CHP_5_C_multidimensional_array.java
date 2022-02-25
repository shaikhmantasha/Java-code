public class CHP_5_C_multidimensional_array {
    public static void main(String[] args) {
        //multidimensional array is used when we want to get an array inside of an array inside of an array and so on...

        //int [] array;  // 1-D array
        int [] [] flats;  // 2-D array

        flats = new int [2][3];    //2 floor hai and 3 room hai usme
        flats[0][0] = 101;           //0 = ground floor  , 1=first room      , = room number
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 110;
        flats[1][1] = 112;
        flats[1][2] = 113;
        
        for(int i = 0 ; i < flats.length ; i++){
            for(int j = 0 ;j<flats[i].length ; j++ ){
            System.out.print(flats[i][j]);
            System.out.print(" ");
        }
        System.out.println("");
    }
    
    }
}
