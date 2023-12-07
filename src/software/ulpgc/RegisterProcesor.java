package software.ulpgc;

import java.util.List;
import java.util.Map;

public interface RegisterProcesor {
    Map<Integer,Integer> process(List<Register> registers);
}
