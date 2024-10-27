package poly.ex.pay0;

public abstract class PayStore {

    public static Pay findPay(String option) {
        if ("kakao".equals(option)) {
            return new KakaoPay();
        } else if ("naver".equals(option)) {
            return new NaverPay();
        }
        else {
            return new DefaultPay();
        }
    }
}
