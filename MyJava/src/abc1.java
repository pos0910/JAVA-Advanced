public class abc1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] items = {"오징어 땅콩", "미국산 한우 A++", "Morning 버터 200ml"}; //품목
        int[] item_prc = {2000, 40000, 2000}; //단가
        int[] item_qty = {10, 2, 50}; //갯수

        System.out.printf("\n\n%20s\n", "곰돌이마트 영수증");
        System.out.printf("==========================================\n");
        System.out.printf("%1.10s%10.10s%10.10s%10.10s\n", "품명", "단가", "수량", "합계");
        System.out.printf("==========================================\n");

        int totPrc = 0;
        for (int i = 0; i < items.length; i++) {
            int itemTot = item_prc[i] * item_qty[i];
            System.out.printf("%5.20s%5.10s%5.10s%5.10s\n",
                    items[i], item_prc[i], item_qty[i], itemTot);
            totPrc = totPrc + itemTot;
        }
        System.out.printf("==========================================\n");
        System.out.printf("%5.40s%15s\n", "합계 :", totPrc);
        System.out.printf("==========================================\n");
    }
}