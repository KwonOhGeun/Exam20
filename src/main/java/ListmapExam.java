import java.util.*;

public class ListmapExam {
    public static void main(String[] args) {

        List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> map = new HashMap<>();

        map.put("name", "권오근");
        map.put("email", "ohgeun72@naver.com");
        map.put("dept", "데이터분석과");
        map.put("addr", "서울");

        list.add(map);

        map = null;

        map = new HashMap<>();

        map.put("name", "홍길동");
        map.put("email", "g.d.hong@kopo.ac.kr");
        map.put("addr", "경기");
        map.put("dept", "시각디자인과");

        list.add(map);

        map = null;

        int listSize = list.size();

        for (int i = 0; i < listSize; i++) {

            Map rmap = list.get(i);
            System.out.println("----------------------------");
            System.out.println("name : " + rmap.get("name"));
            System.out.println("email : " + rmap.get("email"));
            System.out.println("addr : " + rmap.get("addr"));
            System.out.println("dept : " + rmap.get("dept"));
        }

        for (Map<String, String> rMap : list) {
            System.out.println("----------------------------");
            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("addr : " + rMap.get("addr"));
            System.out.println("dept : " + rMap.get("dept"));
        }

        list.forEach(rmap -> {
            System.out.println("----------------------------");
            System.out.println("name : " + rmap.get("name"));
            System.out.println("email : " + rmap.get("email"));
            System.out.println("addr : " + rmap.get("addr"));
            System.out.println("dept : " + rmap.get("dept"));
        });

        Iterator<Map<String, String>> it = list.iterator();

        while (it.hasNext()) {

            Map<String, String> rMap = it.next();
            System.out.println("----------------------------");
            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("addr : " + rMap.get("addr"));
            System.out.println("dept : " + rMap.get("dept"));


        }

    }
}
