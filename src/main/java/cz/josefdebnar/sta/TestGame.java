package cz.josefdebnar.sta;

import cz.josefdebnar.sta.api.Answer;
import cz.josefdebnar.sta.api.Question;
import cz.josefdebnar.sta.api.Test;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

public class TestGame extends Test implements Game {

    private final Input input = new Input();
    boolean printCorrectAnswers = false;
    private int score = 0;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void addScore(int score) {
        this.score = this.score + score;
    }

    public void setPrintCorrectAnswers(boolean printCorrectAnswers) {
        this.printCorrectAnswers = printCorrectAnswers;
    }

    public boolean isPrintingCorrectAnswers() {
        return printCorrectAnswers;
    }

    public void addScore() {
        this.addScore(1);
    }

    private void answering(Question question) throws WrongAnswerException {
        System.out.println(question.getTitle());
        System.out.println(question.getContent());
        System.out.println();

        for (int i = 0; i < question.getAnswers().size(); i++) {
            Answer answer = question.getAnswers().get(i);

            System.out.println((i + 1) + ".: " + answer.getContent());
        }

        System.out.println();
        System.out.println("Odpovezte na otazku <" + 1 + ";" + question.getAnswers().size() + ">:");
        int answer = input.intInputInRange(1, question.getAnswers().size()) - 1;

        if (!question.getCorrectKeys().contains(answer)) {
            throw new WrongAnswerException(question.getAnswers().get(question.getCorrectKeys().get(0)));
        }

        this.addScore();
    }

    private void configure() {
        System.out.println("Zobrazit spravnou odpoved pri chybe:");
        System.out.println("0: Ne");
        System.out.println("1: Ano");
        this.setPrintCorrectAnswers(input.intInputInRange(0, 1) == 1);
    }

    public void run() {
        System.out.println("Mas pred sebou " + this.getQuestions().size() + " otazek");
        System.out.println("Test meri cas");
        System.out.println("Hodne stesti");
        System.out.println();

        this.configure();

        System.out.println();
        System.out.println("Zmackni \"enter\" pro start");
        try {
            System.in.read();
        } catch (IOException e) {
            //
        }

        Instant start = Instant.now();

        this.getQuestions().forEach(question -> {
            try {
                System.out.println();
                this.answering(question);
            } catch (WrongAnswerException e) {
                if (this.isPrintingCorrectAnswers()) {
                    System.out.println();
                    System.out.println("Chyba!");
                    System.out.println("Spravna odpoved byla: " + e.correctAnswer.getContent());
                }
            }
            System.out.println();
        });

        Instant end = Instant.now();
        long duration = Duration.between(start, end).toSeconds();

        System.out.println();
        System.out.println("Body: " + this.getScore() + "/" + this.getQuestions().size());
        System.out.println("Doba trvani: " + duration + " sekund");
    }
}
