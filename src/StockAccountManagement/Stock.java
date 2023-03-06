package StockAccountManagement;

public class Stock {
    private String stockName;
    private int numOfShare;
    private int sharePrice;
    private int totalPrice;

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getNumOfShare() {
        return numOfShare;
    }

    public void setNumOfShare(int numOfShare) {
        this.numOfShare = numOfShare;
    }

    public int getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }
}
