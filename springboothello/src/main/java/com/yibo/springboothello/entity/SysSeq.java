package com.yibo.springboothello.entity;

import java.io.Serializable;

public class SysSeq implements Serializable {
    private String seqName;

    private Long currentVal;

    private Long incrementVal;

    private static final long serialVersionUID = 1L;

    public String getSeqName() {
        return seqName;
    }

    public void setSeqName(String seqName) {
        this.seqName = seqName == null ? null : seqName.trim();
    }

    public Long getCurrentVal() {
        return currentVal;
    }

    public void setCurrentVal(Long currentVal) {
        this.currentVal = currentVal;
    }

    public Long getIncrementVal() {
        return incrementVal;
    }

    public void setIncrementVal(Long incrementVal) {
        this.incrementVal = incrementVal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", seqName=").append(seqName);
        sb.append(", currentVal=").append(currentVal);
        sb.append(", incrementVal=").append(incrementVal);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}