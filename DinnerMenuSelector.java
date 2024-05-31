import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DinnerMenuSelector {

    public static void main(String[] args) {
        // 夕飯のメニューリストを作成
        List<String> dinnerMenus = new ArrayList<>();
        dinnerMenus.add("カレー");
        dinnerMenus.add("ハンバーグ");
        dinnerMenus.add("オムライス");
        dinnerMenus.add("ラーメン");
        dinnerMenus.add("パスタ");

        // ランダムにメニューを選択
        Random random = new Random();
        int randomIndex = random.nextInt(dinnerMenus.size());
        String selectedMenu = dinnerMenus.get(randomIndex);

        // 選択されたメニューを表示
        System.out.println("今日の夕飯は: " + selectedMenu);
    }
}