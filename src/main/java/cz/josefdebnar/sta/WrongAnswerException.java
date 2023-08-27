package cz.josefdebnar.sta;

import cz.josefdebnar.sta.api.Answer;

public class WrongAnswerException extends Exception {
    Answer correctAnswer;

    public WrongAnswerException(Answer answer) {
        super("Špatná odpověd!");
        this.correctAnswer = answer;
    }
}
