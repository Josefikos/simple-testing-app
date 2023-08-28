package cz.josefdebnar.sta;

public class Main {
    public static void main(String[] args) {
        TestGame test = new TestGame();

        test.addQuestion(question -> question
                .setTitle("Prirodopis")
                .setContent("Jak se nazyva narodni strom CR?")
                .addAnswer(answer -> answer
                        .setContent("Briza belokora")
                )
                .addAnswer(answer -> answer
                        .setContent("Lipa srdcita")
                        .setCorrect()
                )
                .addAnswer(answer -> answer
                        .setContent("Dub letni")
                )
        );

        test.addQuestion(question -> question
                .setTitle("Literatura")
                .setContent("Kterou z nasledujicich knizek NENAPSAL George Orwell?")
                .addAnswer(answer -> answer
                        .setContent("Bili tesak")
                        .setCorrect()
                )
                .addAnswer(answer -> answer
                        .setContent("Barmske dny")
                )
                .addAnswer(answer -> answer
                        .setContent("Farma zvirat")
                )
        );

        test.addQuestion(question -> question
                .setTitle("Zemepis")
                .setContent("Ktery ocean zabira nejvice % zemskeho povrchu?")
                .addAnswer(answer -> answer
                        .setContent("Tichy ocean")
                        .setCorrect()
                )
                .addAnswer(answer -> answer
                        .setContent("Indicky ocean")
                )
                .addAnswer(answer -> answer
                        .setContent("Atlansky ocean")
                )
        );

        test.addQuestion(question -> question
                .setTitle("Sport")
                .setContent("V jakem roce budou pristi Zimni Olympijske hry?")
                .addAnswer(answer -> answer
                        .setContent("2026")
                        .setCorrect()
                )
                .addAnswer(answer -> answer
                        .setContent("2024")
                )
        );

        // @via https://w3techs.com/technologies/overview/web_server
        test.addQuestion(question -> question
                .setTitle("Technologie")
                .setContent("Jaky webovy server je nejvice pouzavany?")
                .addAnswer(answer -> answer
                        .setContent("Apache")
                )
                .addAnswer(answer -> answer
                        .setContent("LiteSpeed")
                )
                .addAnswer(answer -> answer
                        .setContent("Nginx")
                        .setCorrect()
                )
                .addAnswer(answer -> answer
                        .setContent("Tomcat")
                )
        );

        test.run();
    }
}