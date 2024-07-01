//package study.codetree.mid.sort.instance;

import java.util.Scanner;

class dayWeather {
    String day;
    String dayOfWeek;
    String weather;

    public dayWeather(String day, String dow, String weather) {
        this.day = day;
        this.dayOfWeek = dow;
        this.weather = weather;
    }

    public dayWeather() {
        this.day = "";
        this.dayOfWeek = "";
        this.weather = "";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // n 입력
        dayWeather[] weathers = new dayWeather[n]; //weatehr 객체 배열 생성
        for (int i = 0; i < n; i++) {
            weathers[i] = new dayWeather(); //초기화
            weathers[i].day = sc.next();
            weathers[i].dayOfWeek = sc.next();
            weathers[i].weather = sc.next();
        }
        int min_year = 2100, min_month = 12, min_day = 31; // 비 오는 날짜 중 날짜 비교
        int index = 0;
        // 비가 오는 날짜들 찾기
        for (int i = 0; i < n; i++) {
            // 날짜의- 연도-월-일 부분을 정수형으로 변환.
            String strYear = weathers[i].day.substring(0, 4);
            int intYear = Integer.parseInt(strYear);
            String strMonth = weathers[i].day.substring(5, 7);
            int intMonth = Integer.parseInt(strMonth);
            String strDay = weathers[i].day.substring(8, 10);
            int intDay = Integer.parseInt(strDay);

            if (weathers[i].weather.equals("Rain")) { // 비가 온다면
                if (intYear == min_year) {
                    if (intMonth == min_month) {
                        if (intDay < min_day) {  // 년 ,월, 일 모두 동일한 값은 주어지지 않음.
                            min_day = intDay; //최소 일 갱신 (가장 가까운 일)
                            index = i; //가장 근시일 내의 날짜 인덱스
                        }
                    } else if (intMonth < min_month) { //같은 년도에 더 작은 월이 있다면 해당 인덱스를 찾고 i++ 루프
                        min_month = intMonth; //최소 월 갱신 (가장 가까운 월)
                        min_day = intDay;
                        index = i;
                        continue;
                    }
                } else if (intYear < min_year) { //더 작은 년도의 날짜가 있다면 해당 인덱스를 찾고 i++ 루프
                    min_year = intYear; //최소 년도 갱신 (가장 가까운 년도)
                    min_month = intMonth;
                    min_day = intDay;
                    index = i;
                    continue;
                }
            }
        }
        System.out.println(weathers[index].day + " " + weathers[index].dayOfWeek + " " + weathers[index].weather);
    }
}