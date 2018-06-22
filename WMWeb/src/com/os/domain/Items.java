package com.os.domain;

public class Items {
    private Integer itemsId;

    private String itemsName;

    private String itemsImagespic;

    private Integer itemsPrice;

    private Integer shopId;

    private String itemsContent;

    public Integer getItemsId() {
        return itemsId;
    }

    public void setItemsId(Integer itemsId) {
        this.itemsId = itemsId;
    }

    public String getItemsName() {
        return itemsName;
    }

    public void setItemsName(String itemsName) {
        this.itemsName = itemsName == null ? null : itemsName.trim();
    }

    public String getItemsImagespic() {
        return itemsImagespic;
    }

    public void setItemsImagespic(String itemsImagespic) {
        this.itemsImagespic = itemsImagespic == null ? null : itemsImagespic.trim();
    }

    public Integer getItemsPrice() {
        return itemsPrice;
    }

    public void setItemsPrice(Integer itemsPrice) {
        this.itemsPrice = itemsPrice;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getItemsContent() {
        return itemsContent;
    }

    public void setItemsContent(String itemsContent) {
        this.itemsContent = itemsContent == null ? null : itemsContent.trim();
    }
}