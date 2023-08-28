package cz.josefdebnar.sta;

import cz.josefdebnar.sta.api.Answer;

public class WrongAnswerException extends Exception {
    Answer correctAnswer;

    public WrongAnswerException(Answer answer) {
        super("Spatna odpoved!");
        this.correctAnswer = answer;
    }
}
