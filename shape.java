import java.lang.Math.*;
import java.util.*;
public class shape {
    private ArrayList<vector> vectors = new ArrayList<vector>();
    public void addVector(vector v) {
        vectors.add(v);
    }
    public ArrayList<vector> getVList() {
        return vectors;
    }
    public vector returnVector(int i) {
        return vectors.get(i);
    }
}