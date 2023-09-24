public class Q1{
    public static void main(String[] args){
        Student student1 = new Student(1, "김철수", "컴퓨터공학", 1, 3, "객체지향연구소");
        Student student2 = new Student( 2, "신윤정", "전자공학 ",2,3,"웹연구소" );
        // 헤더 출력
        System.out.println("-------------------------------------------");
        System.out.println("ID   이름   전공   학년   연구소ID    연구소명");
        System.out.println("-------------------------------------------");
        // 학생 정보 출력
        student1.displayInfo();
        student2.displayInfo();
    }
    
}