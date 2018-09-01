import com.uber.h3core.H3Core;

import java.io.IOException;

public class Main {
    private static final double[][] coordinates = new double[][] {
            {0.0    , 90.0    },
            {13.5467, -19.2347},
            {13.5467, -30.2347},
            {17.5467, -30.2347}
    };

    public static void main(String[] args) throws IOException {
        H3Core h3Core = H3Core.newInstance();
        for (double[] coordinate: coordinates) {
            long h3Id = h3Core.geoToH3(coordinate[0], coordinate[1], 12);
            System.out.printf("Lat: %s Lng: %s H3: %d%n", coordinate[0], coordinate[1], h3Id);
        }
    }
}
