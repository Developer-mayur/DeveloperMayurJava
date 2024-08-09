import java.util.TreeMap;
import java.util.Map;


public class p2 {
  public static void main(String[]args){
TreeMap tm= new TreeMap();
tm.put(103,"ddg");
tm.put(104,"dg");
tm.put(105,"gddg");
tm.put(107,"dgdg");
tm.put(108,"ddfg");

System.out.println(tm.ceilingKey(103));
// System.out.println(tm.ceilingValue("dg"));

System.out.println(tm.headMap(105));
 

Map.Entry firstEntry = tm.firstEntry();

System.out.println(tm);
  }
}
