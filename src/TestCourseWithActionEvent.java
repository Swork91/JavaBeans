import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestCourseWithActionEvent {
	CourseWithActionEvent course = new CourseWithActionEvent("Java");
	
	public TestCourseWithActionEvent() {
		course.setEnrollentCap(2);
		ActionListener listener = new Listener();
		course.addActionListener(listener);
		course.addStudent("Jim");
		course.addStudent("John");
		course.addStudent("Sam");
	}
	
	public static void main(String[] args) {
		new TestCourseWithActionEvent();
	}
	
	private class Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("enrollent Cap exceeded");
		}
		
	}
}
