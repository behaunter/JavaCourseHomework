package algorithms.lesson_7;

public class DynamicListDemo {
        public static void main(String[] args) {
            DynamicList dynamicList = new DynamicList();
            System.out.println(dynamicList);
//            dynamicList.push(12);
//            System.out.println(dynamicList);
//            dynamicList.push(8);
//            System.out.println(dynamicList);
//            dynamicList.push(5);
//            dynamicList.push(2);
//            System.out.println(dynamicList);
//            for (int i = 0; i < 5; i++) {
//                System.out.println(dynamicList.pop()+ " < -- " + dynamicList);
//
//            }
            dynamicList.offer(12);
            dynamicList.offer(8);
            dynamicList.offer(5);
            dynamicList.offer(-2);
            System.out.println(dynamicList);
            for (int i = 0; i < 4; i++) {
                System.out.println(dynamicList.poll() + " <- " + dynamicList);
            }
        }
    }

