package org.example.dtos;

public class Rating {
    private long rating;
    private String ratedBy;

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public String getRatedBy() {
        return ratedBy;
    }

    public void setRatedBy(String ratedBy) {
        this.ratedBy = ratedBy;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "rating=" + rating +
                ", ratedBy='" + ratedBy + '\'' +
                '}' ;
    }
}
