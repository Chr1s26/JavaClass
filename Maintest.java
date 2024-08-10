package ExamManagementSystem1;

import java.io.IOException;

public class Maintest {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Exam exam = new Exam();
		exam.createExam();
		exam.displayExam();

	}


}
