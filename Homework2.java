import java.util.Scanner;

class Student {
    long studentId;
    String name;
    String major;
    long phoneNumber;

    long getStudentId() { return studentId; }
    void setStudentId(long studentId) { this.studentId = studentId; }

    String getName() { return name; }
    void setName(String name) { this.name = name; }

    String getMajor() { return major; }
    void setMajor(String major) { this.major = major; }

    long getPhoneNumber() { return phoneNumber; }
    void setPhoneNumber(long phoneNumber) { this.phoneNumber = phoneNumber; }

    String getFormattedPhoneNumber() {
        String s = "0" + Long.toString(phoneNumber);
        return s.substring(0, 3) + "-" + s.substring(3, 7) + "-" + s.substring(7, 11);
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        Student student1 = new Student();
        student1.setStudentId(sc.nextLong());
        student1.setName(sc.next());
        student1.setMajor(sc.next());
        student1.setPhoneNumber(sc.nextLong());

        System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        Student student2 = new Student();
        student2.setStudentId(sc.nextLong());
        student2.setName(sc.next());
        student2.setMajor(sc.next());
        student2.setPhoneNumber(sc.nextLong());

        System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        Student student3 = new Student();
        student3.setStudentId(sc.nextLong());
        student3.setName(sc.next());
        student3.setMajor(sc.next());
        student3.setPhoneNumber(sc.nextLong());

        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        System.out.println("1번째 학생: " + student1.getStudentId() + " " + student1.getName() + " " + student1.getMajor() + " " + student1.getFormattedPhoneNumber());
        System.out.println("2번째 학생: " + student2.getStudentId() + " " + student2.getName() + " " + student2.getMajor() + " " + student2.getFormattedPhoneNumber());
        System.out.println("3번째 학생: " + student3.getStudentId() + " " + student3.getName() + " " + student3.getMajor() + " " + student3.getFormattedPhoneNumber());
    }
}