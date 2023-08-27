package cz.josefdebnar.sta;

public class Main {
    public static void main(String[] args) {
        TestGame test = new TestGame();

        test.addQuestion(question -> question
                .setTitle("Otázka #1")
                .setContent("Jak se máš?")
                .addAnswer(answer -> answer
                        .setContent("Špatně")
                        .setCorrect()
                )
                .addAnswer(answer -> answer
                        .setContent("Dobře")
                )
                .addAnswer(answer -> answer
                        .setContent("Ujde to")
                )
        );

        test.addQuestion(question -> question
                .setTitle("Otázka #2")
                .setContent("Jak se máš?")
                .addAnswer(answer -> answer
                        .setContent("Špatně")
                        .setCorrect()
                )
                .addAnswer(answer -> answer
                        .setContent("Dobře")
                )
                .addAnswer(answer -> answer
                        .setContent("Ujde to")
                )
        );

        test.addQuestion(question -> question
                .setTitle("Otázka #3")
                .setContent("Jak se máš?")
                .addAnswer(answer -> answer
                        .setContent("Špatně")
                        .setCorrect()
                )
                .addAnswer(answer -> answer
                        .setContent("Dobře")
                )
                .addAnswer(answer -> answer
                        .setContent("Ujde to")
                )
        );

        test.addQuestion(question -> question
                .setTitle("Otázka #4")
                .setContent("Jak se máš?")
                .addAnswer(answer -> answer
                        .setContent("Špatně")
                        .setCorrect()
                )
                .addAnswer(answer -> answer
                        .setContent("Dobře")
                )
                .addAnswer(answer -> answer
                        .setContent("Ujde to")
                )
        );

        test.addQuestion(question -> question
                .setTitle("Otázka #5")
                .setContent("Jak se máš?")
                .addAnswer(answer -> answer
                        .setContent("Špatně")
                        .setCorrect()
                )
                .addAnswer(answer -> answer
                        .setContent("Dobře")
                )
                .addAnswer(answer -> answer
                        .setContent("Ujde to")
                )
        );

        test.run();
    }
}