package com.os.domain;

public class Apply {
    private Integer applyId;

    private String applyRealname;

    private Integer typeId;

    private String applyPhone;

    private String applyShopname;

    private String applyShopaddress;

    private String applyShopdescription;

    private String applyIdcard;

    private String idcardphotopic;

    private String businesspic;

    private String sanitarypic;

    private Integer userId;

    private Integer applyStatus;

    private Integer shopId;

    private String applyShoplogon;

    
    private Type type;
    
    
    
    
    public Integer getApplyId() {
        return applyId;
    }

    public void setApplyId(Integer applyId) {
        this.applyId = applyId;
    }

    public String getApplyRealname() {
        return applyRealname;
    }

    public void setApplyRealname(String applyRealname) {
        this.applyRealname = applyRealname == null ? null : applyRealname.trim();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getApplyPhone() {
        return applyPhone;
    }

    public void setApplyPhone(String applyPhone) {
        this.applyPhone = applyPhone == null ? null : applyPhone.trim();
    }

    public String getApplyShopname() {
        return applyShopname;
    }

    public void setApplyShopname(String applyShopname) {
        this.applyShopname = applyShopname == null ? null : applyShopname.trim();
    }

    public String getApplyShopaddress() {
        return applyShopaddress;
    }

    public void setApplyShopaddress(String applyShopaddress) {
        this.applyShopaddress = applyShopaddress == null ? null : applyShopaddress.trim();
    }

    public String getApplyShopdescription() {
        return applyShopdescription;
    }

    public void setApplyShopdescription(String applyShopdescription) {
        this.applyShopdescription = applyShopdescription == null ? null : applyShopdescription.trim();
    }

    public String getApplyIdcard() {
        return applyIdcard;
    }

    public void setApplyIdcard(String applyIdcard) {
        this.applyIdcard = applyIdcard == null ? null : applyIdcard.trim();
    }

    public String getIdcardphotopic() {
        return idcardphotopic;
    }

    public void setIdcardphotopic(String idcardphotopic) {
        this.idcardphotopic = idcardphotopic == null ? null : idcardphotopic.trim();
    }

    public String getBusinesspic() {
        return businesspic;
    }

    public void setBusinesspic(String businesspic) {
        this.businesspic = businesspic == null ? null : businesspic.trim();
    }

    public String getSanitarypic() {
        return sanitarypic;
    }

    public void setSanitarypic(String sanitarypic) {
        this.sanitarypic = sanitarypic == null ? null : sanitarypic.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(Integer applyStatus) {
        this.applyStatus = applyStatus;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getApplyShoplogon() {
        return applyShoplogon;
    }

    public void setApplyShoplogon(String applyShoplogon) {
        this.applyShoplogon = applyShoplogon == null ? null : applyShoplogon.trim();
    }

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
}