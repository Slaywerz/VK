package ru.netology.domain;

public class DonutInfo {
    private boolean isDonut;
    private int paidDuration;
    private Object placeHolder;
    private boolean canPublishFreeCopy;
    private boolean editMode;

    public boolean isDonut() {
        return isDonut;
    }

    public void setDonut(boolean donut) {
        isDonut = donut;
    }

    public int getPaidDuration() {
        return paidDuration;
    }

    public void setPaidDuration(int paidDuration) {
        this.paidDuration = paidDuration;
    }

    public Object getPlaceHolder() {
        return placeHolder;
    }

    public void setPlaceHolder(Object placeHolder) {
        this.placeHolder = placeHolder;
    }

    public boolean isCanPublishFreeCopy() {
        return canPublishFreeCopy;
    }

    public void setCanPublishFreeCopy(boolean canPublishFreeCopy) {
        this.canPublishFreeCopy = canPublishFreeCopy;
    }

    public boolean isEditMode() {
        return editMode;
    }

    public void setEditMode(boolean editMode) {
        this.editMode = editMode;
    }
}
