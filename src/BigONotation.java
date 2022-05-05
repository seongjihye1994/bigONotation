public class BigONotation {

    public static void main(String[] args) {
        System.out.println("BigONotation.main");

        // O(n)
        logItem(7);

        // O(n^2)
        logItem(7);
    }

    private static void logItem(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("i = " + i);
            // 총 7회 실행 -> O(n)
            // 10을 대입하면 10번 실행된다.
            // 즉, 대입하는 숫자와 루프를 도는 실행수가 정비례한다.
            // -> O(n) 표기법
        }

        System.out.println("===================================");

        // 루프를 두번 돌리면? -> 또 0부터 6까지 출력 즉, 7 * 2 니까 O(2n)
        for (int j = 0; j < n; j++) {
            System.out.println("j = " + j);
        }

        // 그런데 사실 2n, 3n, ... 처럼 앞 숫자는 성능에 큰 영향을 미치지 않는다.
        // 그래서 2n 이던 3n 이던 4n 이던 그냥 모두 O(n) 이라고 표기한다.

    }



}


