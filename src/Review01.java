
public class Review01 {

    public static void main(String[] args) {
        //商品価格
        int productPrice = 1500;
        //消費税率 例：10%なら10を代入
        int consumptionTaxRate = 7;
        //消費税
        int consumptionTax;
        //税込み価格
        int priceIncludingTax;

        //消費税を計算(引数に商品価格と消費税率)
        consumptionTax = tax(productPrice, consumptionTaxRate);
        //税込み価格を計算(税込価格 = 商品価格 + 消費税額)
        priceIncludingTax = productPrice + consumptionTax;

        // 結果を表示
        System.out.println(productPrice + "円の商品の税込価格は" + priceIncludingTax + "円（消費税は" + consumptionTax + "円）です。");
    }

    public static int tax(int productPrice, int consumptionTaxRate) {
        //消費税を計算(商品価格 * ( 消費税率(%) / 100))
        double result =  productPrice * ((double)consumptionTaxRate / 100);
        return (int)result;
    }

}