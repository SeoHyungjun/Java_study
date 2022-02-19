public class SwitchCase {
    public static void main(String[] args) {
        int rank = 1;
        char medalColor;

        switch(rank) {
            case 1: 
                medalColor = 'G';
                break; // 없으면 medalColor에 G를 넣은 뒤 S를 넣어서 결과가 이상해짐
            case 2: 
                medalColor = 'S';
                break;
            case 3: 
                medalColor = 'B';
                break;
            default: 
                medalColor = 'A';
        }
        System.out.println(rank + "등 메달의 색깔은 " + medalColor + "입니다.");
    }
}