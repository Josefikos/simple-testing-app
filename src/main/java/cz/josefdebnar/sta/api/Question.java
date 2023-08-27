package cz.josefdebnar.sta.api;

import java.util.ArrayList;
import java.util.function.Function;

public class Question {
    private String title;
    private String content = null;
    private ArrayList<Answer> answers = new ArrayList<Answer>();
    private ArrayList<Integer> correctKeys = new ArrayList<Integer>();

    public String getTitle() {
        return title;
    }

    public Question setTitle(String title) {
        this.title = title;

        return this;
    }

    public String getContent() {
        return content;
    }

    public Question setContent(String content) {
        this.content = content;

        return this;
    }

    public Question addAnswer(Answer answer) {
        this.answers.add(answer);

        if (answer.isCorrect()) {
            this.addCorrectKey(this.answers.size() - 1);
        }

        return this;
    }

    public Question addAnswer(Function<Answer, Answer> function) {
        return this.addAnswer(function.apply(new Answer()));
    }

    public ArrayList<Answer> getAnswers() {
        return answers;
    }

    public Question setAnswers(ArrayList<Answer> answers) {
        this.answers = answers;

        return this;
    }

    public Question addCorrectKey(int key) {
        this.correctKeys.add(key);

        return this;
    }

    public ArrayList<Integer> getCorrectKeys() {
        return correctKeys;
    }

    public void setCorrectKeys(ArrayList<Integer> correctKeys) {
        this.correctKeys = correctKeys;
    }
}
