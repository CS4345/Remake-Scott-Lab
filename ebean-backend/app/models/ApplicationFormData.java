package models;

public class ApplicationFormData {

    public String coursesTaken;
    public Long pref_one;
    public Long pref_two;
    public Long pref_three;
    public Long getPref_one() {
        return pref_one;
    }
    public void setPref_one(Long pref_one) {
        this.pref_one = pref_one;
    }
    public Long getPref_two() {
        return pref_two;
    }
    public void setPref_two(Long pref_two) {
        this.pref_two = pref_two;
    }
    public Long getPref_three() {
        return pref_three;
    }
    public void setPref_three(Long pref_three) {
        this.pref_three = pref_three;
    }
}