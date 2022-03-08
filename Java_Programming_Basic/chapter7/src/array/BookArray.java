package array;

public class BookArray {
    public static void main(String[] args) {

        // Book의 주소값이 들어가는 공간 5개를 선언한 것
        Book[] library = new Book[5];


        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
        }

        // 선언해둔 공간에 새로운 인스턴스를 생성하여 주소값을 저장
        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");

        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
        }

        for (int i = 0; i < library.length; i++) {
            library[i].showBookInfo();
        }

    }
}
