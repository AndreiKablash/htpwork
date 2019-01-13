package com.htp.lessons.collections;

import java.util.Objects;

public class CollectionEntry {
    private String someStirng;
    private Long infold;

    public CollectionEntry() {
    }

    public CollectionEntry(String someStirng, Long infold) {
        this.someStirng = someStirng;
        this.infold = infold;
    }

    public String getSomeStirng() {
        return someStirng;
    }

    public void setSomeStirng(String someStirng) {
        this.someStirng = someStirng;
    }

    public Long getInfold() {
        return infold;
    }

    public void setInfold(Long infold) {
        this.infold = infold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CollectionEntry that = (CollectionEntry) o;
        return Objects.equals(someStirng, that.someStirng) &&
                Objects.equals(infold, that.infold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(someStirng, infold);
    }

    @Override
    public String toString() {
        return "CollectionEntry{" +
                "someStirng='" + someStirng + '\'' +
                ", infold=" + infold +
                '}';
    }
}
