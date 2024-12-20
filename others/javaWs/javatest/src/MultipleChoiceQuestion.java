import javax.swing.*;

public class MultipleChoiceQuestion extends Question{

    MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
        question = query + "\n";
        question += "A." + a + "\n";
        question += "B." + b + "\n";
        question += "C." + c + "\n";
        question += "D." + d + "\n";
        question += "E." + e + "\n";

        correctAnswer = answer.toUpperCase();
    }

    @Override
    String ask() {

        while(true) {
            String answer = JOptionPane.showInputDialog(question).toUpperCase();

            if(     answer.equals("A")
                    ||  answer.equals("B")
                    ||  answer.equals("C")
                    ||  answer.equals("D")
                    ||  answer.equals("E"))
                return answer;
            else
                JOptionPane.showMessageDialog(null, "The input is wrong, please choose one of the following letters: A,B,C,D,E");
        }
    }
}