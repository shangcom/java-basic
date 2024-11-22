package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {

        MovieReview review1 = new MovieReview();
        MovieReview review2 = new MovieReview();

        review1.title = "인셉션";
        review1.review = "인생은 무한 루프";

        review2.title = "어바웃 타임";
        review2.review = "인생 시간 영화!";

        MovieReview[] movieReviews = new MovieReview[2];
        movieReviews[0] = review1;
        movieReviews[1] = review2;
        for (int i = 0; i < movieReviews.length; i++) {
            MovieReview mr = movieReviews[i];
            System.out.println("영화 제목: " + mr.title + ", 리뷰: " + mr.review);
        }
    }
}
