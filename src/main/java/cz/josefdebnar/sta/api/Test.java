package cz.josefdebnar.sta.api;

import java.util.ArrayList;
import java.util.function.Function;

public class Test {

    private ArrayList<Question> questions = new ArrayList<Question>();

    public Test addQuestion(Question question) {
        this.questions.add(question);

        return this;
    }

    public Test addQuestion(Function<Question, Question> function) {
        return this.addQuestion(function.apply(new Question()));
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public Test setQuestions(ArrayList<Question> questions) {
        this.questions = questions;

        return this;
    }
}
