package data;

import java.util.ArrayList;
import java.util.List;

public class DBcertificat {
    public static List<PairCertificat> getListCer(){
         List<PairCertificat> colection=new ArrayList<>();
         colection.add(new PairCertificat("78456266",false));
         colection.add(new PairCertificat("45924126",true));
         return colection;
    }
}
