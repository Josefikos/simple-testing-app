package cz.josefdebnar.sta.api;

public class Answer {
    private boolean correct;
    private String content;

    public boolean isCorrect() {
        return correct;
    }

    public Answer setCorrect(boolean correct) {
        this.correct = correct;

        return this;
    }

    public Answer setCorrect() {
        return this.setCorrect(true);
    }

    public String getContent() {
        return content;
    }

    public Answer setContent(String content) {
        this.content = content;

        return this;
    }
}
