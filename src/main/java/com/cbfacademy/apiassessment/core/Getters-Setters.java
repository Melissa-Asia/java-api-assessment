package com.cbfacademy.apiassessment.core;

public void Hairstyle_types(int id, Boolean Wash, Boolean Blowdry, Boolean treatment, Boolean Assessment, String Style,
            int price) {
        this.ID = id;
        this.Wash = Wash;
        this.Blowdry = Blowdry;
        this.treatment = treatment;
        this.Assessment = Assessment;
        this.Style = Style;
        this.Price = price;
    }
    
    public int getid() {
        return ID;
    }

    public void setid(int id) {
        ID = id;
    }

    public Boolean getWash() {
        return Wash;
    }

    public void setWash(Boolean wash) {
        Wash = wash;
    }

    public Boolean getBlowdry() {
        return Blowdry;
    }

    public void setBlowdry(Boolean blowdry) {
        Blowdry = blowdry;
    }

    public Boolean getTreatment() {
        return treatment;
    }

    public void setTreatment(Boolean treatment) {
        this.treatment = treatment;
    }

    public Boolean getAssessment() {
        return Assessment;
    }

    public void setAssessment(Boolean assessment) {
        Assessment = assessment;
    }

    public String getStyle() {
        return Style;
    }

    public void setStyle(String style) {
        Style = style;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
