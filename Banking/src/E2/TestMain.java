public class TestMain {
    public static void main(String[] args) {
        // Tạo mảng chứa 3 đối tượng Employee
        Employee[] employees = new Employee[3];
        employees[0] = new Employee(1, "Hai", "Nguyen", 10000);
        employees[1] = new Employee(2, "Vinh", "Le", 2000);
        employees[2] = new Employee(3, "Phi", "Hieu", 1000);

        // Hiển thị thông tin của từng nhân viên
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Tìm nhân viên có lương hàng năm cao nhất
        Employee highestPaid = employees[0];
        for (Employee employee : employees) {
            if (employee.getAnnualSalary() > highestPaid.getAnnualSalary()) {
                highestPaid = employee;
            }
        }
        System.out.println("Nhân viên có lương hàng năm cao nhất: " + highestPaid);
    }
}
//Khởi tạo: Ban đầu, biến highestPaid được gán bằng phần tử đầu tiên của mảng employees (ví dụ: employees[0]).
//So sánh: Sau đó, chương trình duyệt qua từng đối tượng Employee trong mảng và so sánh lương hàng năm của mỗi
//đối tượng với lương của highestPaid. Nếu có nhân viên nào có lương hàng năm cao hơn, biến highestPaid sẽ được cập
//nhật để lưu đối tượng nhân viên đó.
//Kết quả: Cuối cùng, sau khi duyệt hết mảng, highestPaid sẽ chứa nhân viên có lương hàng năm cao nhất và
//in ra thông tin của nhân viên đó.