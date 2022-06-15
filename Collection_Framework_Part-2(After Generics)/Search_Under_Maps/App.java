package Search_Under_Maps;

import java.util.Map;
import java.util.TreeMap;

class Code implements Comparable<Code> {

    private String secNo;

    public String getSecNo() {
        return secNo;
    }

    private String lecNo;

    public String getLecNo() {
        return lecNo;
    }

    public Code(String secNo, String lecNo) {
        this.secNo = secNo;
        this.lecNo = lecNo;
    }

    @Override
    public String toString() {
        return "Code [secNo=" + secNo + ", lecNo=" + lecNo + "]";
    }

    @Override
    public int compareTo (Code o) {
        String code1 = secNo.concat(lecNo);
        String code2 = o.getSecNo()+o.getLecNo();
        return code1.compareTo(code2);
    }

}

public class App {

    public static void main(String[] args) {
        

        Map<Code, String> student = new TreeMap<>();
        student.put(new Code("S01", "L03"), "Java");
        student.put(new Code("S01", "L03"), "Core-Java");
        student.put(new Code("S01", "L01"), "Spring");
        student.put(new Code("S02", "L03"), "C++");
        student.put(new Code("S01", "L07"), "C");
        student.put(new Code("S01", "L05"), "Python");
        

        System.out.println(student.get(new Code("S04", "L03")));
        System.out.println(student.get(new Code("S01", "L05")));

        Code code = null;
        for (Map.Entry<Code, String> entry:student.entrySet()) {
            if (entry.getValue().equals("Core-Java")) {
                code = entry.getKey();
            }
        }

        System.out.println(code);

    }

}
