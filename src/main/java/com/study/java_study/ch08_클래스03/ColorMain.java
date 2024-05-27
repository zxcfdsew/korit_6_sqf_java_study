package com.study.java_study.ch08_클래스03;

public class ColorMain {
    public static void main(String[] args) {
        /*
            문제.
            Color 객체 5개를 담을 수 있는 배열을 생성하여
            #CAB4BA, Brandied Apricot
            #FFBE98, Peach Fuzz
            #964F4C, Marsala
            #A78C7B, Almondine
            #D8C8BD, Almond peach
            생성 데이터를 저장 한 후에 for문을 사용하여 배열에 들어있는 모든 색상 정보를 printInfo()를 호출하여 출력한다.
            이후에 모든 code와 name의 값을 null로 바꾸어 다시 출력한다.
            이때 null로 바꿀때에는 반목문을 사용한다.
         */
        Color[] color = new Color[] {
                new Color("#CAB4BA", "Brandied Apricot"),
                new Color("#FFBE98", "Peach"),
                new Color("#964F4C", "Marsala"),
                new Color("#A78C7B", "Almondine"),
                new Color("#D8C8BD", "Almond peach")
        };

        for (Color value : color) {
            value.printInfo();
            System.out.println();
        }

        System.out.println("-------------------------\n");

        for (Color value : color) {
            value.setCode(null);
            value.setName(null);
        }

        for (Color value : color) {
            value.printInfo();
            System.out.println();
        }
    }
}
